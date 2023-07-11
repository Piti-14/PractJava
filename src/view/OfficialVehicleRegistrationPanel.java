package view;

import controller.MainPanelController;
import controller.VehicleRegistrationController;

@SuppressWarnings("serial")
public class OfficialVehicleRegistrationPanel extends RegistrationPanel {

	public OfficialVehicleRegistrationPanel(CentralPanel central) {
		super();		
		setCentralPanel(central);
		
		registerPanelLbl.setText("REGISTER OFFICIAL VEHICLE");
		
		saveBtn.addActionListener(new VehicleRegistrationController(plateTxt.getText()));
		returnBtn.addActionListener(new MainPanelController(central));		
	}
}
