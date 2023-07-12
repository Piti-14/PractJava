package test;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import model.OfficialList;
import model.ResidentList;


import view.MainFrame;

public class Pruebas {
	
	private static final String FILES = "src/recursos/";

	public static void main(String[] args) {
		
		OfficialList.readVehicleData(FILES + "OfficialVehicles");
		ResidentList.readVehicleData(FILES + "ResidentVehicles");
		
		MainFrame mf = new MainFrame();
	}
}
