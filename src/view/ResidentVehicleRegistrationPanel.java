package view;

import controller.MainPanelController;
import controller.ResidentRegistrationController;

@SuppressWarnings("serial")
public class ResidentVehicleRegistrationPanel extends RegistrationPanel {
	
	public ResidentVehicleRegistrationPanel(CentralPanel central) {
		super();
		setCentralPanel(central);
		
		registerPanelLbl.setText("REGISTER RESIDENT VEHICLE");
			
		saveBtn.addActionListener(new ResidentRegistrationController(plateTxt));
		returnBtn.addActionListener(new MainPanelController(central));
	}
}
