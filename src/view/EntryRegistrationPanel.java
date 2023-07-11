package view;

import controller.MainPanelController;

@SuppressWarnings("serial")
public class EntryRegistrationPanel extends RegistrationPanel{
	
	public EntryRegistrationPanel(CentralPanel central) {
		super();
		setCentralPanel(central);
		
		registerPanelLbl.setText("REGISTER ENTRY");
		
		saveBtn.addActionListener(null);
		returnBtn.addActionListener(new MainPanelController(central));
	}
}
