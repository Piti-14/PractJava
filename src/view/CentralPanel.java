package view;

import javax.swing.JPanel;
import java.awt.CardLayout;

@SuppressWarnings("serial")
public class CentralPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public CentralPanel() {
		setLayout(new CardLayout());
	}
}
