package view;

import controller.ExitRegistrationController;
import controller.MainPanelController;

@SuppressWarnings("serial")
public class ExitRegistrationPanel extends RegistrationPanel {

	public ExitRegistrationPanel(CentralPanel central) {
		super();
		setCentralPanel(central);
		
		registerPanelLbl.setText("REGISTER EXIT");
		
		saveBtn.addActionListener(new ExitRegistrationController(plateTxt));
		returnBtn.addActionListener(new MainPanelController(central));
	}
}
