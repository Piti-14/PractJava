package model;

public class NonResident extends Vehicle {
	
	private double price = 0.02;
	
	public NonResident(String plate) {
		super(plate);
		minutePrice = price;
	}
}