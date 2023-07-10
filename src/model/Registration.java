package model;

import java.util.ArrayList;

public class Registration {
	
	private static ArrayList<Vehicle> cars = new ArrayList<>();
	
	public Registration(String plate, int type) {
		Vehicle v;
		
		switch (type) {
		
			case 1:
				v = new Official(plate);
				cars.add(v);
				//Se ha añadido el coche oficial
				break;
			
			case 2:
				v = new Resident(plate);
				cars.add(v);
				//Se ha añadido el coche residente
				break;
		}
	}
}
