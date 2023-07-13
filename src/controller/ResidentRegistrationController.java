package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
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
		
		if (plate.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Enter a valid License Plate");
		} else {
			Resident r = new Resident(plate.getText());
			ResidentList.addResident(r);
		}
		
		plate.setText("");
	}
}