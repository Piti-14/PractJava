package view;

import javax.swing.JPanel;

import controller.MainPanelController;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JMenuBar;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class MainPanel extends JPanel {
	
	private JPanel initialPanel;
	private CentralPanel central;
	private MainPanelController mpController;

	public MainPanel() {
		//First set the layout for the MainPanel
		setLayout(new BorderLayout());
		
		//Next create the different panels for adding them to the CentralPanel(with a CardLayout)
		central = new CentralPanel();
		
		initialPanel = new JPanel(new GridLayout(3, 2));
		central.add(initialPanel, "initial");
		
		RegistrationPanel officialPanel = new OfficialVehicleRegistrationPanel(central);
		central.add(officialPanel, "registerOfficial");
		
		RegistrationPanel residentPanel = new ResidentVehicleRegistrationPanel(central);
		central.add(residentPanel, "registerResident");
		
		RegistrationPanel vehicleEntry = new EntryRegistrationPanel(central);
		central.add(vehicleEntry, "entry");
		
		RegistrationPanel vehicleExit = new ExitRegistrationPanel(central);
		central.add(vehicleExit, "exit");
		
		/*Initialize our controller with the CentralPanel 
		 *Populate the MainPanel
		 *Add the CentralPanel to the MainPanel */
		mpController = new MainPanelController(central);
		
		initiatePanelButtons();
		initiatePanelMenuBar();
		add(central, BorderLayout.CENTER);
	}
	
	private void initiatePanelButtons() {
		
		JButton newEntryBtn = new JButton("New Entry Registry");
		newEntryBtn.addActionListener(mpController);
		
		JButton newExitBtn = new JButton("New Exit Registry");
		newExitBtn.addActionListener(mpController);
				
		JButton addOfficialVehicleBtn = new JButton("Add Official Vehicle");
		addOfficialVehicleBtn.addActionListener(mpController);
		
		JButton addResidentVehicleBtn = new JButton("Add Resident Vehicle");
		addResidentVehicleBtn.addActionListener(mpController);
		
		JButton residentPaymentBtn = new JButton("Monthly Payment");
		residentPaymentBtn.addActionListener(mpController);
		
		JButton resetBtn = new JButton("Clear Month");
		resetBtn.addActionListener(mpController);
		
		initialPanel.add(newEntryBtn);
		initialPanel.add(newExitBtn);
		initialPanel.add(addOfficialVehicleBtn);
		initialPanel.add(addResidentVehicleBtn);
		initialPanel.add(residentPaymentBtn);
		initialPanel.add(resetBtn);		
	}
	
	private void initiatePanelMenuBar() {
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("Options");
		
		JMenuItem enterRegistrationBtn = new JMenuItem("New Entry Registry");
		enterRegistrationBtn.addActionListener(mpController);
		
		JMenuItem exitRegistrationBtn = new JMenuItem("New Exit Registry");
		exitRegistrationBtn.addActionListener(mpController);
		
		JMenuItem addOfficialVehicleMenuBtn = new JMenuItem("Add Official Vehicle");
		addOfficialVehicleMenuBtn.addActionListener(mpController);
		
		JMenuItem addResidentVehicleMenuBtn = new JMenuItem("Add Resident Vehicle");
		addResidentVehicleMenuBtn.addActionListener(mpController);
			
		JMenuItem paymentsBtn = new JMenuItem("Monthly Payment");
		paymentsBtn.addActionListener(mpController);
		
		JMenuItem newMonthBtn = new JMenuItem("Clear Month");
		newMonthBtn.addActionListener(mpController);
		
		menu.add(enterRegistrationBtn);
		menu.add(exitRegistrationBtn);
		menu.add(addOfficialVehicleMenuBtn);
		menu.add(addResidentVehicleMenuBtn);
		menu.add(paymentsBtn);
		menu.add(newMonthBtn);
		
		menuBar.add(menu);
		
		add(menuBar, BorderLayout.NORTH);
	}
}
