package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ReportPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ReportPanel() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setBackground(Color.decode("#ffffff"));
		
		JLabel lb = new JLabel("Comunícate con nosotros");
		lb.setBackground(Color.decode("#ffffff"));
		lb.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 10));
		lb.setFont(new Font("Heveltica", Font.PLAIN, 14));
		lb.setForeground(Color.decode("#999999"));
		add(lb);
		
		JButton btn1 = new JButton("  Contáctanos");
		btn1.setAlignmentX(Component.LEFT_ALIGNMENT);
		btn1.setFont(new Font("Heveltica", Font.PLAIN, 14));
		btn1.setForeground(Color.decode("#337ab7"));
		btn1.setBackground(Color.decode("#ffffff"));
		btn1.setBorder(BorderFactory.createEmptyBorder());
		//btn1.setIcon(new ImageIcon("/Images/check-footer.png"));
		add(btn1);
		
		JButton btn2 = new JButton("  Trabaja con nosotros");
		btn2.setAlignmentX(Component.LEFT_ALIGNMENT);
		btn2.setFont(new Font("Heveltica", Font.PLAIN, 14));
		btn2.setForeground(Color.decode("#337ab7"));
		btn2.setBackground(Color.decode("#ffffff"));
		btn2.setBorder(BorderFactory.createEmptyBorder());
		//btn2.setIcon(new ImageIcon("/Images/check-footer.png"));
		add(btn2);
		
		JButton btn3 = new JButton("  About Us");
		btn3.setAlignmentX(Component.LEFT_ALIGNMENT);
		btn3.setFont(new Font("Heveltica", Font.PLAIN, 14));
		btn3.setForeground(Color.decode("#337ab7"));
		btn3.setBackground(Color.decode("#ffffff"));
		btn3.setBorder(BorderFactory.createEmptyBorder());
		//btn2.setIcon(new ImageIcon("/Images/check-footer.png"));
		add(btn3);
	}

}
