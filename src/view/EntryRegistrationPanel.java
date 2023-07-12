package view;

import controller.EntryRegistrationController;
import controller.MainPanelController;

@SuppressWarnings("serial")
public class EntryRegistrationPanel extends RegistrationPanel{
	
	public EntryRegistrationPanel(CentralPanel central) {
		super();
		setCentralPanel(central);
		
		registerPanelLbl.setText("REGISTER ENTRY");
		
		saveBtn.addActionListener(new EntryRegistrationController(plateTxt));
		returnBtn.addActionListener(new MainPanelController(central));
	}
}
