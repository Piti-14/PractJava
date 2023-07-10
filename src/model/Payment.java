package model;

public class Payment {
	
	public static double calculatePayment(Vehicle v) {
		double ticket;
		if (v instanceof NonResident) {
			ticket = v.getMinutePrice() * v.stayedTime.totalTime();
		} else {
			Resident car = (Resident)v;
			ticket = car.getMinutePrice() * car.getTotalMinutes();
		}
		
		return ticket;
	}
}
