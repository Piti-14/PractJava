package view;

import controller.MainPanelController;
import controller.VehicleRegistrationController;

@SuppressWarnings("serial")
public class ResidentVehicleRegistrationPanel extends RegistrationPanel {
	
	public ResidentVehicleRegistrationPanel(CentralPanel central) {
		super();
		setCentralPanel(central);
		
		registerPanelLbl.setText("REGISTER RESIDENT VEHICLE");
			
		saveBtn.addActionListener(new VehicleRegistrationController(plateTxt.getText()));
		returnBtn.addActionListener(new MainPanelController(central));
	}
}
