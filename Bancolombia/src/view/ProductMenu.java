package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ProductMenu extends JPanel{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	public ProductMenu() {
		setBackground(Color.WHITE);
		
		JButton btn1 = new JButton();
		btn1.setBackground(Color.WHITE);
		btn1.setIcon(new ImageIcon("src/Images/Logo.png"));
		btn1.setBorder(BorderFactory.createEmptyBorder());
		add(btn1);
		
		JButton btn2 = new JButton("     Necesidades");
		btn2.setBackground(Color.WHITE);
		btn2.setBorder(BorderFactory.createEmptyBorder());
		btn2.setFont(new Font("Helveltica", Font.PLAIN, 13));
		btn2.setForeground(Color.decode("#777777"));
		add(btn2);
		
		JButton btn3 = new JButton("     Productos y Servicios");
		btn3.setBackground(Color.WHITE);
		btn3.setBorder(BorderFactory.createEmptyBorder());
		btn3.setFont(new Font("Helveltica", Font.PLAIN, 13));
		btn3.setForeground(Color.decode("#777777"));
		add(btn3);
		
		JButton btn4 = new JButton("     Aprender es fácil   ");
		btn4.setBackground(Color.WHITE);
		btn4.setBorder(BorderFactory.createEmptyBorder());
		btn4.setFont(new Font("Helveltica", Font.PLAIN, 13));
		btn4.setForeground(Color.decode("#777777"));
		add(btn4);
		
		JButton btn5 = new JButton("  Solicitud de productos  ");
		btn5.setBackground(Color.WHITE);
		btn5.setIcon(new ImageIcon("src/Images/LogoBancolombiaClick.png"));
		btn5.setFont(new Font("Helveltica", Font.PLAIN, 13));
		btn5.setForeground(Color.decode("#00448c"));
		btn5.setBorder(BorderFactory.createLineBorder(Color.decode("#00448c"), 2));
		add(btn5);
		
		JButton btn6 = new JButton("  Transacciones  ");
		btn6.setBackground(Color.decode("#00448d"));
		btn6.setIcon(new ImageIcon("src/Images/Segurity.PNG"));
		btn6.setFont(new Font("Helveltica", Font.PLAIN, 13));
		btn6.setForeground(Color.WHITE);
		btn6.setBorder(BorderFactory.createEmptyBorder());
		add(btn6);
	}

}
