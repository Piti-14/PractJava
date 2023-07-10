package model;

public abstract class Vehicle {
	
	private String plate;
	protected double minutePrice;
	protected ParkingTime stayedTime; 
	
	public Vehicle(String plate) {
		this.plate = plate;
		minutePrice = 0.0;
	}
	
	public void setParkedTime(ParkingTime time) {
		this.stayedTime = time;
	}
	
	public String getPlate() {
		return plate;
	}
	
	public double getMinutePrice() {
		return minutePrice;
	}
}
