package model;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Registration {
	
	private static final String FILES = "src/recursos/";
	private static final String OFFICIAL_VEHICLES_STAYS_REGISTRY = "src/recursos/OfficialStays";
	private static final String RESIDENT_VEHICLES_STAYS_REGISTRY = "src/recursos/ResidentStays";
	
	public static void saveOfficialStaysRegistry() {
		String header = String.format("%-10s | %-29s | %-29s", "License Plate", "Entry", "Exit");
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(OFFICIAL_VEHICLES_STAYS_REGISTRY, true));
			writer.write(header);
			writer.newLine();
			writer.write("-----------------------------------------------------------------------------\n");
			for (Official o : OfficialList.getOfficialList()) {
				for (ParkingTime stay : o.stays) {
					String plate = o.getPlate();
					String entry = stay.getEntryTime().toString();
					String exit = stay.getExitTime().toString();

					String line = String.format("%-13s | %-29s | %-29s", plate, entry, exit);
					writer.write(line);
					writer.newLine();
				}
			}
			writer.write("--------------- End of day: " + new Date() + " -------------------\n\n" +
					"-----------------------------------------------------------------------------\n");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void saveResidentStaysRegistry() {
		String header = String.format("%-10s | %-29s | %-29s", "License Plate", "Entry", "Exit");
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(RESIDENT_VEHICLES_STAYS_REGISTRY, true));
			writer.write(header);
			writer.newLine();
			writer.write("-----------------------------------------------------------------------------\n");
			for (Official o : OfficialList.getOfficialList()) {
				for (ParkingTime stay : o.stays) {
					String plate = o.getPlate();
					String entry = stay.getEntryTime().toString();
					String exit = stay.getExitTime().toString();

					String line = String.format("%-13s | %-29s | %-29s", plate, entry, exit);
					writer.write(line);
					writer.newLine();
				}
			}
			writer.write("--------------- End of day: " + new Date() + " -------------------\n\n" +
					"-----------------------------------------------------------------------------\n");
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

	public static String getFiles() { return FILES;}

	public static String getOfficials() { return OFFICIAL_VEHICLES_STAYS_REGISTRY;}

	public static String getResidents() { return RESIDENT_VEHICLES_STAYS_REGISTRY;}

	public static void clearMonthlyRegistries(String file) {
		String historic = file + "_" + getMonthName();
		try {
			Files.copy(new File(file).toPath(), new File(historic).toPath(), StandardCopyOption.REPLACE_EXISTING);
			PrintWriter writer = new PrintWriter(file);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static String getMonthName() {
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM");
		return dateFormat.format(date);
	}
}