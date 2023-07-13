package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class ResidentList {
	
	private static ArrayList<Resident> residentVehicles = new ArrayList<Resident>();
	
	public static void readVehicleData(String file) {
		
		try {
			BufferedReader read = new BufferedReader(new FileReader(file));
			String line = read.readLine();
			
			while(line != null) {
				
				String[] data = line.split(",");
				Resident r = new Resident(data[0]);
				r.setMonthlyMinutes(Integer.parseInt(data[1]));
				Date entry = new Date(Long.parseLong(data[2]));
				r.getParkingTime().setEntryTime(entry);
				residentVehicles.add(r);
				
				line = read.readLine();
			}
			
			read.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static ArrayList<Resident> getResidentList() {
		return residentVehicles;
	}
	
	public static void addResident(Resident r) {
		for (Resident resident : residentVehicles) {
			if (resident.getPlate().equals(r.getPlate())) {
				return;
			}
		}
		residentVehicles.add(r);
	}
	
	public static void clearResidents() {
		residentVehicles.clear();
	}
	
	public static void saveVehicleData(String file) {
		try {
			BufferedWriter write = new BufferedWriter(new FileWriter(file));
			
			for (Resident r : residentVehicles) {
				write.write(r.getPlate() + "," + r.getTotalMinutes());
				
				if (r.getParkingTime().getEntryTime() != null) { //Still parked when shutting down the system
					write.write("," + r.getParkingTime().getEntryTime().getTime());
				} else {
					write.write(",0");
				}
				write.newLine();
			}
			
			write.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}