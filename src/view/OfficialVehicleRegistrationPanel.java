package view;

import controller.MainPanelController;
import controller.OfficialRegistrationController;

@SuppressWarnings("serial")
public class OfficialVehicleRegistrationPanel extends RegistrationPanel {

	public OfficialVehicleRegistrationPanel(CentralPanel central) {
		super();		
		setCentralPanel(central);
		
		registerPanelLbl.setText("REGISTER OFFICIAL VEHICLE");
		
		saveBtn.addActionListener(new OfficialRegistrationController(plateTxt));
		returnBtn.addActionListener(new MainPanelController(central));		
	}
}
