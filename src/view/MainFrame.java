package view;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MainFrame extends JFrame {

	public MainFrame() {
		setTitle("Parking Manager - v4.8.0");
		setBounds(0,0,300,300);
		setResizable(false);
		
		MainPanel panel = new MainPanel();
		add(panel);
		
		setVisible(true);
		setDefaultCloseOperation(3);
	}

}
