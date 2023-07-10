package model;

import java.time.LocalTime;

public class ParkingTime {
	
	private LocalTime entryTime;
	private LocalTime exitTime;
	
	public ParkingTime(LocalTime entryTime, LocalTime exitTime) {
		this.entryTime = entryTime;
		this.exitTime = exitTime;
	}
	
	public LocalTime getEntryTime() {
		return entryTime;
	}
	
	public LocalTime getExitTime() {
		return exitTime;
	}
}
