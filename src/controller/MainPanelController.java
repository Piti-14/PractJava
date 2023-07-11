package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.CentralPanel;

public class MainPanelController implements ActionListener{
	
	private CentralPanel central;
	
	public MainPanelController(CentralPanel central) {
		this.central = central;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		switch(e.getActionCommand()) {
			
			case "Add Official Vehicle": central.getCardLayout().show(central, "registerOfficial"); break;
			
			case "Add Resident Vehicle": central.getCardLayout().show(central, "registerResident"); break;
			
			case "New Entry Registry": central.getCardLayout().show(central, "entry"); break;
			
			case "New Exit Registry": central.getCardLayout().show(central, "exit"); break;
			
			case "Generate Monthly Payment": central.getCardLayout().show(central, "register"); break;
			
			case "Clear Month": central.getCardLayout().show(central, "register"); break;	
			
			case "Back": central.getCardLayout().show(central, "initial"); break;
		}	
	}
}
