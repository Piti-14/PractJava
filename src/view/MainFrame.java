package view;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MainFrame extends JFrame {

	public MainFrame() {
		setTitle("Frame test");
		setBounds(0,0,400,400);
		
		MainPanel panel = new MainPanel();
		add(panel);
		
		setVisible(true);
		setDefaultCloseOperation(3);
	}

}
