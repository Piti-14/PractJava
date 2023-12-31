package model;

import java.util.ArrayList;
import java.util.Date;

public abstract class Vehicle {
	
	private String plate;
	protected double minutePrice;
	protected int totalMinutes;
	protected ParkingTime stayedTime = new ParkingTime();
	protected ArrayList<ParkingTime> stays = new ArrayList<>();
	
	public Vehicle(String plate) {
		this.plate = plate;
		minutePrice = 0.0;
	}
	
	public void setParkedTime(Date entry) {
		this.stayedTime.setEntryTime(entry);
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
	
	public void clearStayedTime() {
		stayedTime.reset();
	}
	
	public void setMonthlyMinutes(long minutes) {
		this.totalMinutes += minutes;
	}
	
	public int getTotalMinutes() {
		return totalMinutes;
	}
	
	public void setTotalMinutes(int minutes) {
		this.totalMinutes = minutes;
	}

	public String toString() {
		return plate;
	}
	
	/*public void saveStaysRegistry() {
		
	}*/
}
