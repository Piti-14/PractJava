package view;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class MainPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public MainPanel() {
		
		setLayout(new BorderLayout());
		
		//CentralPanel central = new CentralPanel();
		RegistrationPanel rp = new RegistrationPanel();
		
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("Options");
		
		JMenuItem enterRegistrationBtn = new JMenuItem("Register entry");
		JMenuItem exitRegistrationBtn = new JMenuItem("Register exit");
		JMenuItem addVehicleBtn = new JMenuItem("New vehicle");
		JMenuItem newMonthBtn = new JMenuItem("Reset month");
		JMenuItem paymentsBtn = new JMenuItem("Calculate payments");
		
		menu.add(enterRegistrationBtn);
		menu.add(exitRegistrationBtn);
		menu.add(addVehicleBtn);
		menu.add(newMonthBtn);
		menu.add(paymentsBtn);
		
		menuBar.add(menu);
		
		add(menuBar, BorderLayout.NORTH);
		add(rp, BorderLayout.CENTER);
	}
}
