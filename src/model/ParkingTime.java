package model;

import java.util.Date;

public class ParkingTime {
	
	private Date entryTime;
	private Date exitTime;
	
	public ParkingTime() {}
	
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
		entryTime = null;
		exitTime = null;
	}
}
