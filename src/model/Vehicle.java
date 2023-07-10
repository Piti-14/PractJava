package model;

public abstract class Vehicle {
	
	private String plate;
	protected double minutePrice;
	
	
	public Vehicle(String plate) {
		this.plate = plate;
		minutePrice = 0.0;
	}
	
	public String getPlate() {
		return plate;
	}
	
	public double getMinutePrice() {
		return minutePrice;
	}
}
