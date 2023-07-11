package model;

import java.util.ArrayList;

public class TimeRegister {
	
	private ArrayList<Vehicle> cars;
	
	public TimeRegister(ArrayList<Vehicle> cars) {
		this.cars = cars;
	}
	
	public void newEntry(String plate) {
		if (cars.contains((Object)plate)) {
			
		}
	}
	
	public void newExit(String plate) {
		
		for (Vehicle v : cars) {
			if (v.getPlate().equals(plate)) {
				
			}
		}
	}
}
