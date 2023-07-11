package view;

import controller.MainPanelController;

@SuppressWarnings("serial")
public class ExitRegistrationPanel extends RegistrationPanel {

	public ExitRegistrationPanel(CentralPanel central) {
		super();
		setCentralPanel(central);
		
		registerPanelLbl.setText("REGISTER EXIT");
		
		saveBtn.addActionListener(null);
		returnBtn.addActionListener(new MainPanelController(central));
	}
}
