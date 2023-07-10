package model;

import java.util.Date;

public class ParkingTime {
	
	private Date entryTime;
	private Date exitTime;
	
	public ParkingTime(Date entryTime) {
		this.entryTime = entryTime;
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
		return duration / (60 * 1000); //60 as per a minute and 1000 as per a second
	}
	
}
