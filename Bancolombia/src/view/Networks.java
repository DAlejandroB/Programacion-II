package view;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Networks extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Networks() {
		setBackground(Color.decode("#ffffff"));
		
		JButton btn1 = new JButton();
		btn1.setBackground(Color.decode("#ffffff"));
		btn1.setBorder(BorderFactory.createEmptyBorder());
		btn1.setIcon(new ImageIcon("src/Images/facebook.png"));
		add(btn1);
		
		JButton btn2 = new JButton();
		btn2.setBackground(Color.decode("#ffffff"));
		btn2.setBorder(BorderFactory.createEmptyBorder());
		btn2.setIcon(new ImageIcon("src/Images/twitter.png"));
		add(btn2);
		
		JButton btn3 = new JButton();
		btn3.setBackground(Color.decode("#ffffff"));
		btn3.setBorder(BorderFactory.createEmptyBorder());
		btn3.setIcon(new ImageIcon("src/Images/likendIn.png"));
		add(btn3);
		
		JButton btn4 = new JButton();
		btn4.setBackground(Color.decode("#ffffff"));
		btn4.setBorder(BorderFactory.createEmptyBorder());
		btn4.setIcon(new ImageIcon("src/Images/instagram.png"));
		add(btn4);
		
		JButton btn5 = new JButton();
		btn5.setBackground(Color.decode("#ffffff"));
		btn5.setBorder(BorderFactory.createEmptyBorder());
		btn5.setIcon(new ImageIcon("src/Images/youtube.png"));
		add(btn5);
	}

}
