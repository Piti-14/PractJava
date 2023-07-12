package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class OfficialList {
	
	private static ArrayList<Official> officialVehicles = new ArrayList<Official>();
	
	public static void readVehicleData(String file) {
		
		try {
			BufferedReader read = new BufferedReader(new FileReader(file));
			String line = read.readLine();
			
			while(line != null) {
				Official v = new Official(line.trim());
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
				write.newLine();
			}
			
			write.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}