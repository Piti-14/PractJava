package model;

import java.util.ArrayList;
import java.util.Date;

public class Registration {
	
	private String plate;
	private Date date;
	private static ArrayList<Vehicle> cars = new ArrayList<>();
	
	public Registration(String plate, int type) {
		Vehicle v;
		
		switch (type) {
		
			case 1:
				v = new Official(plate);
				cars.add(v);
				break;
			
			case 2:
				v = new Resident(plate);
				cars.add(v);
				break;
				
			default:
				System.out.println("Enter a valid number for the vehicle type (1: Official; 2: Resident)");
				break;
		}
	}
	
	public static void newEntry(String plate) {
		if (cars.isEmpty()) {
			Vehicle v = new NonResident(plate);
		}
		for (Vehicle v : cars) {
			if (v.getPlate().equals(plate)) {
				ParkingTime time = new ParkingTime(new Date());
				v.setParkedTime(time);
			}
		}
	}
}
