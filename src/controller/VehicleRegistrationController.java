package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Official;
import model.Registration;

public class VehicleRegistrationController implements ActionListener{
	
	private String plate;
	private Registration car;
	
	public VehicleRegistrationController(String plate) {
		this.plate = plate;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof Official) {
			car = new Registration(plate, 1);
		} else {
			car = new Registration(plate, 2);
		}
	}
}
