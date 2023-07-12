package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

import model.TimeRegister;

public class EntryRegistrationController implements ActionListener{
	
	private JTextField plate;
	
	public EntryRegistrationController(JTextField plate) {
		this.plate = plate;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		TimeRegister time = new TimeRegister(plate.getText());
		time.newEntry();
		
		plate.setText("");
	}
}