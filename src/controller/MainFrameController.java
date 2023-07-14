package controller;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import model.NonResidentList;
import model.OfficialList;
import model.ResidentList;

public class MainFrameController implements WindowListener{
	
	private static final String OFFICIAL_VEHICLES = "src/recursos/OfficialVehicles";
	private static final String RESIDENT_VEHICLES = "src/recursos/ResidentVehicles";
	private static final String NON_RESIDENT_VEHICLES = "src/recursos/NonResidentVehicles";
	
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		OfficialList.readVehicleData(OFFICIAL_VEHICLES);
		ResidentList.readVehicleData(RESIDENT_VEHICLES);
		NonResidentList.readVehicleData(NON_RESIDENT_VEHICLES);
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		OfficialList.saveVehicleData(OFFICIAL_VEHICLES);
		ResidentList.saveVehicleData(RESIDENT_VEHICLES);
		NonResidentList.saveVehicleData(NON_RESIDENT_VEHICLES);
		
		/*for (NonResident vehicle : NonResidentList.getNonResidentList()) {
			vehicle.getParkingTime().setExitTime(new Date());
			double ticket = Payment.calculatePayment(vehicle);
			JOptionPane.showMessageDialog(null, "You owe " + ticket + "$, "
					+ "\ngrab the ticket and pay it at the attendant's hut.") ;
		}*/
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
