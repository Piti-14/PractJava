package model;

public class Resident extends Vehicle {
	
	private double price = 0.002;
	private int totalMinutes = 0;

	public Resident(String plate) {
		
		super(plate);
		minutePrice = price;
	}
	
	public void setMonthlyMinutes(int minutes) {
		this.totalMinutes += minutes;
	}
	
	public int getTotalMinutes() {
		return totalMinutes;
	}
	
}
