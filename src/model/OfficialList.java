package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class OfficialList {
	
	private static ArrayList<Official> officialVehicles = new ArrayList<Official>();
	
	public static void readVehicleData(String file) {
		
		try {
			BufferedReader read = new BufferedReader(new FileReader(file));
			String line = read.readLine();
			
			while(line != null) {
				String[] data = line.split(",");
 				Official v = new Official(data[0]);
 				Date entry = new Date(Long.parseLong(data[1]));
 				v.getParkingTime().setEntryTime(entry);
				officialVehicles.add(v);
				
				line = read.readLine();
			}
			
			read.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static ArrayList<Official> getOfficialList() {
		return officialVehicles;
	}
	
	public static void addOfficial(Official o) {
		for (Official official : officialVehicles) {
			if (official.getPlate().equals(o.getPlate())) {
				return;
			}
		}
		officialVehicles.add(o);
	}
	
	public static void clearOfficials() {
		officialVehicles.clear();
	}
	
	public static void saveVehicleData(String file) {
		try {
			BufferedWriter write = new BufferedWriter(new FileWriter(file));
			
			for (Official o : officialVehicles) {
				write.write(o.getPlate());
				if (o.getParkingTime().getEntryTime() != null) {
					write.write("," + o.getParkingTime().getEntryTime().getTime());
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