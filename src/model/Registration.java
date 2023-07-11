package model;

import java.util.ArrayList;

public class Registration {
	
	private static final int OFFICIAL = 1;
	private static final int RESIDENT = 2;
	private static ArrayList<Vehicle> cars = new ArrayList<>();
	
	public Registration(String plate, int type) {
		Vehicle v;
		
		switch (type) {
		
			case OFFICIAL:
				v = new Official(plate);
				cars.add(v);
				//Se ha añadido el coche oficial
				break;
			
			case RESIDENT:
				v = new Resident(plate);
				cars.add(v);
				//Se ha añadido el coche residente
				break;
		}
	}
}
