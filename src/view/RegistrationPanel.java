package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

@SuppressWarnings("serial")
public abstract class RegistrationPanel extends JPanel {
	
	protected JTextField plateTxt;
	protected JLabel registerPanelLbl, plateLbl;
	protected JButton saveBtn, returnBtn;
	protected CentralPanel central;

	public RegistrationPanel() {
		setLayout(null);
		
		registerPanelLbl = new JLabel("REGISTER VEHICLE");
		registerPanelLbl.setHorizontalAlignment(SwingConstants.CENTER);
		registerPanelLbl.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		registerPanelLbl.setBounds(10, 11, 280, 28);
		add(registerPanelLbl);
		
		plateLbl = new JLabel("License Plate");
		plateLbl.setFont(new Font("Tw Cen MT", Font.BOLD, 16));
		plateLbl.setHorizontalAlignment(SwingConstants.CENTER);
		plateLbl.setBounds(10, 80, 120, 28);
		add(plateLbl);
		
		plateTxt = new JTextField();
		plateTxt.setBounds(127, 85, 150, 20);
		add(plateTxt);
		plateTxt.setColumns(10);
		
		saveBtn = new JButton("Save");
		saveBtn.setFont(new Font("SimSun", Font.BOLD, 14));
		saveBtn.setBounds(188, 132, 89, 23);
		add(saveBtn);
		
		returnBtn = new JButton("Back");
		returnBtn.setFont(new Font("SimSun", Font.BOLD, 14));
		returnBtn.setBounds(188, 166, 89, 23);
		add(returnBtn);
		
	}
	
	public void setCentralPanel(CentralPanel central) {
		this.central = central;
	}
}