package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AccountPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public AccountPanel() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setBackground(new Color(0, 0, 0, 0));
		
		JLabel lb1 = new JLabel("Acceso Digital es_");
		lb1.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lb1.setFont(new Font("Heveltica", Font.PLAIN, 20));
		lb1.setForeground(Color.WHITE);
		add(lb1);
		
		JLabel lb2 = new JLabel("Cuenta de");
		lb2.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lb2.setFont(new Font("Heveltica", Font.PLAIN, 50));
		lb2.setForeground(Color.WHITE);
		add(lb2);
		
		JLabel lb3 = new JLabel("ahorros por");
		lb3.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lb3.setFont(new Font("Helveltica", Font.PLAIN, 50));
		lb3.setForeground(Color.WHITE);
		add(lb3);
		
		JLabel lb4 = new JLabel("Internet");
		lb4.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lb4.setFont(new Font("Heveltica", Font.PLAIN, 50));
		lb4.setForeground(Color.WHITE);
		add(lb4);
		
		JLabel lb5 = new JLabel("Sencillo y para todos");
		lb5.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lb5.setFont(new Font("Heveltica", Font.PLAIN, 24));
		lb5.setForeground(Color.WHITE);
		add(lb5);
		
		JLabel lb6 = new JLabel("       ");
		add(lb6);
		
		JButton btn1 = new JButton("    Solicítala aquí    ");
		btn1.setBackground(new Color(0, 0, 0, 0));
		btn1.setFont(new Font("Heveltica", Font.PLAIN, 16));
		btn1.setForeground(Color.WHITE);
		btn1.setAlignmentX(Component.RIGHT_ALIGNMENT);
		btn1.setBorder(BorderFactory.createCompoundBorder( 
				BorderFactory.createLineBorder(Color.WHITE), BorderFactory.createEmptyBorder(15, 10, 15, 10)));
		add(btn1);
	}

}
