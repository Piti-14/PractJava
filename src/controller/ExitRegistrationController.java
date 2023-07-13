package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.TimeRegister;

public class ExitRegistrationController implements ActionListener{
	
	private JTextField plate;
	
	public ExitRegistrationController(JTextField plate) {
		this.plate = plate;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		if (plate.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Enter a valid License Plate");
		} else {
			TimeRegister time = new TimeRegister(plate.getText());
			time.newExit();
		}
		
		plate.setText("");
	}
}