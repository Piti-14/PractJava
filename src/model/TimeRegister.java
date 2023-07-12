package model;

import java.util.ArrayList;
import java.util.Date;

public class TimeRegister {
	
	private String plate;
	private boolean registered = false;
	
	public TimeRegister(String plate) {
		this.plate = plate;
	}
	
	public void newEntry() {
		
		if (!registered) {
			searchAndVerify(OfficialList.getOfficialList());
		}
		
		if (!registered) {
			searchAndVerify(ResidentList.getResidentList());
		}
		
		if (!registered) {
			searchAndVerify(NonResidentList.getNonResidentList());
		}
		
		NonResident nr = new NonResident(plate);
		nr.setParkedTime(new ParkingTime(new Date()));
		NonResidentList.addNonResident(nr);
		
	}

	private void searchAndVerify(ArrayList<? extends Vehicle> list) {
		for (Vehicle v : list) {
			
			if (v.getPlate().equals(plate)) {
				if (v.getParkingTime().getEntryTime() == null) {//Vehicle is not parked
					
					v.setParkedTime(new ParkingTime(new Date()));
				}
				registered = true;
			}
		}
	}
	
	public void newExit(String plate) {
		
	}
}
