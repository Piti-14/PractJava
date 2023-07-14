package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import model.OfficialList;
import model.Registration;
import model.ResidentList;
import model.Vehicle;
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
			
			case "Monthly Payment": 
				String registry = JOptionPane.showInputDialog("Enter registry name:");
				if (registry != null && !registry.isEmpty()) {
					Registration.saveNewPaymentRegistry(registry);
				} else {
					System.out.println("No has introducido un nombre válido para el archivo");
				}
				break;
			
			case "Clear Month": 
				int option = JOptionPane.showConfirmDialog(null, "Be sure to generate the monthly registers first! \n"
						+ "All data will be deleted now,"
						+ " do you want to continue?");
				if (option == JOptionPane.YES_OPTION) {
					for (Vehicle o : OfficialList.getOfficialList()) {
						o.setParkedTime(new Date(0));
					}
					
					for (Vehicle r : ResidentList.getResidentList()) {
						r.setTotalMinutes(0);
						r.setParkedTime(new Date(0));
					}
				}
				break;	
			
			case "Back": central.getCardLayout().show(central, "initial"); break;
		}	
	}
}
