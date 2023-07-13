package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.Official;
import model.OfficialList;

public class OfficialRegistrationController implements ActionListener{
	
	private JTextField plate;
	
	public OfficialRegistrationController(JTextField plate) {
		this.plate = plate;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (plate.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Enter a valid License Plate");
		} else {
			Official v = new Official(plate.getText());
			OfficialList.addOfficial(v);
		}
		
		plate.setText("");
	}
}