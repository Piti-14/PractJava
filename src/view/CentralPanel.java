package view;


import javax.swing.JPanel;
import java.awt.CardLayout;

@SuppressWarnings("serial")
public class CentralPanel extends JPanel {
	
	private CardLayout cl;

	public CentralPanel() {
		cl = new CardLayout();		
		setLayout(cl);
	}
	
	public CardLayout getCardLayout() {
		return this.cl;
	}
}