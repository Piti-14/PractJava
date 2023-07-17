package model;

import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

public class TimeRegister {
	
	private String plate;
	private boolean registered = false;
	
	public TimeRegister(String plate) {
		this.plate = plate;
	}
	
	public void newEntry() {
		
		if (!registered) {
			searchAndVerifyEntry(OfficialList.getOfficialList());
		}
		if (!registered) {
			searchAndVerifyEntry(ResidentList.getResidentList());
		}
		if (!registered) {
			NonResident nr = new NonResident(plate);
			if (NonResidentList.getNonResidentList().size() == 0) {
				nr.setParkedTime(new Date());
			} else {
				searchAndVerifyEntry(NonResidentList.getNonResidentList());
			}				
			NonResidentList.addNonResident(nr);
		}
		registered = false;
	}
	
	
	public void newExit() {
		
		if (!registered) {
			searchAndVerifyExit(OfficialList.getOfficialList());
		}
		if (!registered) {
			searchAndVerifyExit(ResidentList.getResidentList());
		}
		if (!registered) {
			if (NonResidentList.getNonResidentList().size() == 0) {
				JOptionPane.showMessageDialog(null, "No such vehicle parked!");
			} else {
				searchAndVerifyExit(NonResidentList.getNonResidentList());
				NonResidentList.removeNonResident(new NonResident(plate));
				if (!registered) {
					JOptionPane.showMessageDialog(null, "No such vehicle parked!");
				}
			}
		}
		registered = false;
	}

	private void searchAndVerifyEntry(ArrayList<? extends Vehicle> list) {
		for (Vehicle v : list) {
			
			if (v.getPlate().equals(plate)) {
				if (v.getParkingTime().getEntryTime().equals(new Date(0))) {//Vehicle is not parked

					v.setParkedTime(new Date());
				} else {
					JOptionPane.showMessageDialog(null, "Vehicle already parked!") ;
				}
				registered = true;
			}
		}
	}
	
	private void searchAndVerifyExit(ArrayList<? extends Vehicle> list) {
		for (Vehicle v : list) {
			
			if (v.getPlate().equals(plate)) {
				if (v.getParkingTime().getExitTime().equals(new Date(0)) && !(v.getParkingTime().getEntryTime().equals(new Date(0)))) {//Vehicle is still parked
					
					v.getParkingTime().setExitTime(new Date());
					ParkingTime stay = new ParkingTime(v.getParkingTime().getEntryTime(), v.getParkingTime().getExitTime());
					
					if (v instanceof Official) {
						v.addStay(stay);
						v.clearStayedTime();
					} else if (v instanceof Resident) {
						v.addStay(stay);
						v.setMonthlyMinutes(stay.totalTime());
						v.clearStayedTime();
					} else {
						double ticket = Payment.calculatePayment(v);
						JOptionPane.showMessageDialog(null, "You owe " + ticket + "$, "
								+ "\ngrab the ticket and pay it at the attendant's hut.");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Vehicle not parked yet.");
				}
				registered = true;
			}
		}
	}
}