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
			searchAndVerifyEntry(OfficialList.getOfficialList());
		}
		
		if (!registered) {
			searchAndVerifyEntry(ResidentList.getResidentList());
		}
		
		if (!registered) {
			if (NonResidentList.getNonResidentList().size() == 0) {
				NonResident nr = new NonResident(plate);
				nr.setParkedTime(new ParkingTime(new Date()));
				NonResidentList.addNonResident(nr);
			} else {
				searchAndVerifyEntry(NonResidentList.getNonResidentList());
			}
		}
		
		registered = false;
	}
	
	public void newExit(String plate) {
		
		if (!registered) {
			searchAndVerifyExit(OfficialList.getOfficialList());
		}
		
		if (!registered) {
			searchAndVerifyExit(ResidentList.getResidentList());
		}
		
		if (!registered) {
			if (NonResidentList.getNonResidentList().size() == 0) {
				NonResident nr = new NonResident(plate);
				nr.setParkedTime(new ParkingTime(new Date()));
				NonResidentList.addNonResident(nr);
			} else {
				searchAndVerifyExit(NonResidentList.getNonResidentList());
			}
		}
		
		registered = false;
	}

	private void searchAndVerifyEntry(ArrayList<? extends Vehicle> list) {
		for (Vehicle v : list) {
			
			if (v.getPlate().equals(plate)) {
				if (v.getParkingTime().getEntryTime() == null) {//Vehicle is not parked
					
					v.setParkedTime(new ParkingTime(new Date()));
				}
				registered = true;
			}
		}
	}
	
	private void searchAndVerifyExit(ArrayList<? extends Vehicle> list) {
		for (Vehicle v : list) {
			
			if (v.getPlate().equals(plate)) {
				if (v.getParkingTime().getExitTime() == null) {//Vehicle is still parked
					
					v.setParkedTime(new ParkingTime(new Date()));
				}
				registered = true;
			}
		}
	}
}
