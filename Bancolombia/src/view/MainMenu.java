package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainMenu extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MainMenu() {
		setBackground(Color.decode("#535353"));
		
		JButton btn1 = new JButton("    Para Ti    ");
		btn1.setBackground(Color.decode("#535353"));
		btn1.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
		btn1.setFont(new Font("Helveltica", Font.PLAIN, 14));
		btn1.setForeground(Color.WHITE);
		add(btn1);
		
		JButton btn2 = new JButton("    Para Empresas    ");
		btn2.setBackground(Color.decode("#535353"));
		btn2.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
		btn2.setFont(new Font("Helveltica", Font.PLAIN, 14));
		btn2.setForeground(Color.WHITE);
		add(btn2);
		
		JButton btn3 = new JButton("    Acerca de Bancolombia    ");
		btn3.setBackground(Color.decode("#535353"));
		btn3.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
		btn3.setFont(new Font("Helveltica", Font.PLAIN, 14));
		btn3.setForeground(Color.WHITE);
		add(btn3);
		
		JButton btn4 = new JButton("    Negocios Especializados    ");
		btn4.setBackground(Color.decode("#535353"));
		btn4.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
		btn4.setFont(new Font("Helveltica", Font.PLAIN, 14));
		btn4.setForeground(Color.WHITE);
		add(btn4);
		
		JLabel lbSpace = new JLabel("                                                                                          ");
		lbSpace.setBackground(Color.decode("#535353"));
		add(lbSpace);
	}

}
