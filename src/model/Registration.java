package model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Registration {
	
	private static final String FILES = "src/recursos/";
	private static final String OFFICIAL_VEHICLES_REGISTRY = "src/recursos/OfficialStays";
	private static final String RESIDENT_VEHICLES_REGISTRY = "src/recursos/ResidentStays";
	
	public static void saveOfficialRegistry() {
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(OFFICIAL_VEHICLES_REGISTRY, true));
			for (Official o : OfficialList.getOfficialList()) {
				String line = o.getParkingTime().toString();
			}
			writer.write("");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void saveNewPaymentRegistry(String fileName) {
		String header = String.format("%-10s | %-20s | %-20s", "License Plate", "Parked Time (min)", "Ticket Price ($)");
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(FILES + fileName));
			writer.write(header);
			writer.newLine();
			writer.write("-------------------------------------------------------");
			writer.newLine();
			for (Resident r : ResidentList.getResidentList()) {
				int minutes = r.getTotalMinutes();
				String plate = r.getPlate();
				double ticket = Payment.calculatePayment(r);
				
				String line = String.format("%-13s | %-20d | %-20.2f", plate, minutes, ticket);
				writer.write(line);
				writer.newLine();
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}