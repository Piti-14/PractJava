package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ResidentList {
	
	private static ArrayList<Resident> residentVehicles = new ArrayList<Resident>();
	
	public static void readVehicleData(String file) {
		
		try {
			BufferedReader read = new BufferedReader(new FileReader(file));
			String line = read.readLine();
			
			while(line != null) {
				Resident v = new Resident(line.trim());
				residentVehicles.add(v);
				
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
		residentVehicles.add(r);
	}
	
	public static void clearResidents() {
		residentVehicles.clear();
	}
	
	public static void saveVehicleData(String file) {
		try {
			BufferedWriter write = new BufferedWriter(new FileWriter(file));
			
			for (Resident r : residentVehicles) {
				write.write(r.getPlate());
				write.newLine();
			}
			
			write.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}