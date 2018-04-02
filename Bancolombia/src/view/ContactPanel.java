package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class ContactPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ContactPanel() {
		setLayout(new GridLayout(1, 6));
		setBackground(Color.decode("#ffd200"));
		
		JLabel lb1 = new JLabel();
		lb1.setBackground(Color.decode("#ffd200"));
		lb1.setBorder(BorderFactory.createEmptyBorder());
		add(lb1);
		
		JButton btn1 = new JButton("<html> Chatea con nosotros <br> Déjanos ayudarte a <br> encontrar lo que buscas <html>");
		btn1.setBackground(Color.decode("#ffd200"));
		btn1.setForeground(Color.decode("#00448c"));
		btn1.setFont(new Font("Heveltica", Font.PLAIN, 15));
		btn1.setHorizontalTextPosition(SwingConstants.CENTER);
		btn1.setIcon(new ImageIcon("src/Images/icon-chatea-blue.png"));
		btn1.setVerticalTextPosition(SwingConstants.BOTTOM);
		btn1.setBorder(BorderFactory.createMatteBorder(0, 1, 0, 0, Color.WHITE));
		add(btn1);
		
		JButton btn2 = new JButton("<html> Llámanos <br> Nuestras líneas están <br> esperándote <html>");
		btn2.setBackground(Color.decode("#ffd200"));
		btn2.setForeground(Color.decode("#00448c"));
		btn2.setFont(new Font("Heveltica", Font.PLAIN, 15));
		btn2.setHorizontalTextPosition(SwingConstants.CENTER);
		btn2.setIcon(new ImageIcon("src/Images/icon-llamanos-blue.png"));
		btn2.setVerticalTextPosition(SwingConstants.BOTTOM);
		btn2.setBorder(BorderFactory.createMatteBorder(0, 1, 0, 0, Color.WHITE));
		add(btn2);
		
		JButton btn3 = new JButton("<html> Déjanos llamarte <br> Nos encantaría <br> hablar contigo <html>");
		btn3.setBackground(Color.decode("#ffd200"));
		btn3.setForeground(Color.decode("#00448c"));
		btn3.setFont(new Font("Heveltica", Font.PLAIN, 15));
		btn3.setHorizontalTextPosition(SwingConstants.CENTER);
		btn3.setIcon(new ImageIcon("src/Images/icon-llamarte-blue.png"));
		btn3.setVerticalTextPosition(SwingConstants.BOTTOM);
		btn3.setBorder(BorderFactory.createMatteBorder(0, 1, 0, 0, Color.WHITE));
		add(btn3);
		
		JButton btn4 = new JButton("<html> Visítanos <br> Busca nuestro próximo <br> lugar de encuetro <html>");
		btn4.setBackground(Color.decode("#ffd200"));
		btn4.setForeground(Color.decode("#00448c"));
		btn4.setFont(new Font("Heveltica", Font.PLAIN, 15));
		btn4.setHorizontalTextPosition(SwingConstants.CENTER);
		btn4.setIcon(new ImageIcon("src/Images/icon-visitanos-blue.png"));
		btn4.setVerticalTextPosition(SwingConstants.BOTTOM);
		btn4.setBorder(BorderFactory.createMatteBorder(0, 1, 0, 1, Color.WHITE));
		add(btn4);
		
		JLabel lb2 = new JLabel();
		lb2.setBackground(Color.decode("#ffd200"));
		lb2.setBorder(BorderFactory.createEmptyBorder());
		add(lb2);
	}

}
