package view;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ButtonPanel() {
		setBackground(Color.decode("#ffffff"));
		
		JLabel lb1 = new JLabel(" ");
		lb1.setBackground(Color.decode("#ffffff"));
		add(lb1);
		
		ReportPanel reportPanel = new ReportPanel();
		reportPanel.setBorder(BorderFactory.createEmptyBorder(0, 20, 10, 20));
		add(reportPanel);
		
		AccessPanel accessPanel = new AccessPanel();
		accessPanel.setBorder(BorderFactory.createEmptyBorder(0, 20, 10, 20));
		add(accessPanel);
		
		LegalPanel legalPanel = new LegalPanel();
		legalPanel.setBorder(BorderFactory.createEmptyBorder(0, 20, 10, 20));
		add(legalPanel);
		
		NetworksPanel networksPanel = new NetworksPanel();
		networksPanel.setBorder(BorderFactory.createEmptyBorder(0, 20, 10, 20));
		add(networksPanel);
		
		JLabel lb2 = new JLabel(" ");
		lb2.setBackground(Color.decode("#ffffff"));
		add(lb2);
	}
}
