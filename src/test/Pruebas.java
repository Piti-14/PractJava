package test;

import java.util.ArrayList;

//import model.NonResident;
import model.Official;
import model.Resident;
import model.Vehicle;

//import view.MainFrame;

public class Pruebas {

	public static void main(String[] args) {
		
		//MainFrame mf = new MainFrame();
		
		ArrayList<Vehicle> cars = new ArrayList<>();
		
		Vehicle car1 = new Official("ABC-123");
		Vehicle car2 = new Official("DEF-456");
		Vehicle car3 = new Official("GHI-789");
		Vehicle car4 = new Official("JKL-012");
		
		Vehicle car5 = new Resident("MNO-345");
		Vehicle car6= new Resident("PQR-678");
		Vehicle car7 = new Resident("STU-901");
		Vehicle car8 = new Resident("VWX-234");
		
	   /* Vehicle car9 = new NonResident("YZA-567");
		Vehicle car10 = new NonResident("BCD-890");
		Vehicle car11 = new NonResident("EFG-123");
		Vehicle car12 = new NonResident("HIJ-456"); */
		
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        cars.add(car8);
       		
	}

}
