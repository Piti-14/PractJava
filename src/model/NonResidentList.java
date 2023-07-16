package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class NonResidentList {
	
	private static ArrayList<NonResident> nonResidentVehicles = new ArrayList<>();
	
	public static void readVehicleData(String file) {
		
		try {
			BufferedReader read = new BufferedReader(new FileReader(file));
			String line = read.readLine();
			
			while(line != null && !(line.equals(""))) {
				String[] data = line.split(",");//plate,minutes,date
 				NonResident nr = new NonResident(data[0]);
 				nr.setMonthlyMinutes(Integer.parseInt(data[1]));
 				Date entry = new Date(Long.parseLong(data[2]));
 				nr.getParkingTime().setEntryTime(entry);
				nonResidentVehicles.add(nr);
				
				line = read.readLine();
			}
			
			read.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static ArrayList<NonResident> getNonResidentList() {
		return nonResidentVehicles;
	}
	
	public static void addNonResident(NonResident nr) {
		for (NonResident nonResident : nonResidentVehicles) {
			if (nonResident.getPlate().equals(nr.getPlate())) {
				return;
			}
		}
		nonResidentVehicles.add(nr);
	}
	
	public static void removeNonResident(NonResident nr) {
		Iterator<NonResident> i = nonResidentVehicles.iterator();
		while (i.hasNext()) {
			NonResident nonResident = i.next();
			if (nonResident.getPlate().equals(nr.getPlate())) {
				i.remove();
				break;
			}
		}
	}
	
	public static void saveVehicleData(String file) {
		try {
			BufferedWriter write = new BufferedWriter(new FileWriter(file));
			
			for (NonResident nonResident : nonResidentVehicles) {
				write.write(nonResident.getPlate() + "," + nonResident.getTotalMinutes());
				
				if (nonResident.getParkingTime().getEntryTime() != null) {
					write.write("," + nonResident.getParkingTime().getEntryTime().getTime());
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