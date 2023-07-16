package model;

import java.util.Date;

public class ParkingTime {
	
	private Date entryTime;
	private Date exitTime;
	
	public ParkingTime() {
		entryTime = new Date(0);
		exitTime = new Date(0);
	}

	public ParkingTime(Date entryTime, Date exitTime){
		this.entryTime = entryTime;
		this.exitTime = exitTime;
	}
	
	public void setEntryTime(Date entry) {
		this.entryTime = entry;
	}
	
	public void setExitTime(Date exitTime) {
		this.exitTime = exitTime;
	}
	
	public Date getEntryTime() {
		return entryTime;
	}
	
	public Date getExitTime() {
		return exitTime;
	}
	
	public long totalTime() {
		long duration = exitTime.getTime() - entryTime.getTime(); //time in miliseconds!!
		return duration / (60 * 1000); //1000 as per a second and 60 as per a minute
	}
	
	public void reset() {
		entryTime = new Date(0);
		exitTime = new Date(0);
	}
	
	public String toString() {
		return "Entry at: " + entryTime + "\n" +
				"Exit at: " + exitTime;
	}
}
