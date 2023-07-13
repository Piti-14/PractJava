package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import model.TimeRegister;

public class EntryRegistrationController implements ActionListener{
	
	private JTextField plate;
	
	public EntryRegistrationController(JTextField plate) {
		this.plate = plate;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (plate.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Enter a valid License Plate");
		} else {
			TimeRegister time = new TimeRegister(plate.getText());
			time.newEntry();
		}
		
		plate.setText("");
	}
}