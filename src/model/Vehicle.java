package model;

import java.util.ArrayList;

public abstract class Vehicle {
	
	private String plate;
	protected double minutePrice;
	protected ParkingTime stayedTime;
	protected ArrayList<ParkingTime> stays = new ArrayList<>();
	
	public Vehicle(String plate) {
		this.plate = plate;
		minutePrice = 0.0;
	}
	
	public void setParkedTime(ParkingTime time) {
		this.stayedTime = time;
	}
	
	public ParkingTime getParkingTime() {
		return stayedTime;
	}
	
	public String getPlate() {
		return plate;
	}
	
	public double getMinutePrice() {
		return minutePrice;
	}
	
	public ArrayList<ParkingTime> getStays() {
		return stays;
	}
	
	public void addStay(ParkingTime pt) {
		stays.add(pt);
	}
}
