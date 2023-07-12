package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import model.Resident;
import model.ResidentList;

public class ResidentRegistrationController implements ActionListener{
	
	private JTextField plate;
	
	public ResidentRegistrationController(JTextField plate) {
		this.plate = plate;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Resident r = new Resident(plate.getText());
		ResidentList.addResident(r);
		
		plate.setText("");
	}
}