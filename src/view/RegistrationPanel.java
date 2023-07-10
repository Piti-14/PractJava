package view;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

@SuppressWarnings("serial")
public class RegistrationPanel extends JPanel {
	private JTextField textField;
	private JTextField hourField;
	private JTextField minuteField;

	/**
	 * Create the panel.
	 */
	public RegistrationPanel() {
		setLayout(new MigLayout("", "[][][grow]", "[][][][][][][][][][]"));
		
		JLabel lblNewLabel_1 = new JLabel("VEHICLE REGISTRATION");
		lblNewLabel_1.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 14));
		add(lblNewLabel_1, "cell 0 0 3 1,alignx center");
		
		JLabel PlateLabel = new JLabel("Plate");
		PlateLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		add(PlateLabel, "cell 0 2,alignx trailing");
		
		textField = new JTextField();
		add(textField, "cell 2 2");
		textField.setColumns(12);
		
		JLabel hourLabel = new JLabel("Entry hour");
		hourLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		add(hourLabel, "cell 0 4,alignx trailing");
		
		hourField = new JTextField();
		add(hourField, "flowx,cell 2 6,alignx left");
		hourField.setColumns(5);
		
		JLabel lblNewLabel = new JLabel("Type of Vehicle");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		add(lblNewLabel, "cell 0 7");
		
		JCheckBox typeOfficialChBx = new JCheckBox("Official");
		add(typeOfficialChBx, "cell 2 7");
		
		JCheckBox typeResidentChBx = new JCheckBox("Resident");
		typeResidentChBx.setFont(new Font("Tahoma", Font.PLAIN, 11));
		add(typeResidentChBx, "cell 2 8");
		
		JCheckBox typeNonResidentChBx = new JCheckBox("Non resident");
		typeNonResidentChBx.setFont(new Font("Tahoma", Font.PLAIN, 11));
		add(typeNonResidentChBx, "cell 2 9");
		
		JLabel timeSeparatorLabel = new JLabel(" : ");
		timeSeparatorLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		add(timeSeparatorLabel, "cell 2 6");
		
		minuteField = new JTextField();
		add(minuteField, "cell 2 6");
		minuteField.setColumns(5);

	}

}
