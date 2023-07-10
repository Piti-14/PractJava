package model;

public class Resident extends Vehicle {
	
	private double price = 0.002;

	public Resident(String plate) {
		
		super(plate);
		minutePrice = price;
	}
}
