package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TaxPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Image img;
	
	public TaxPanel() {
		setLayout(new GridBagLayout());
		img = new ImageIcon(getClass().getResource("/Images/bannerGray.jpg")).getImage();
		setPreferredSize(new Dimension(img.getWidth(this), img.getHeight(this)));
		
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 1;
		c.gridheight = 1;
		c.weighty = 0.1;
		
		for (int i = 0; i < 8; i++) {
			c.gridx = i;
			add(new JLabel(" "), c);
		}
		
		JLabel lb1 = new JLabel("Conoce cómo");
		lb1.setAlignmentX(Component.LEFT_ALIGNMENT);
		lb1.setFont(new Font("Heveltica", Font.PLAIN, 40));
		lb1.setForeground(Color.decode("#9E9FA1"));
		c.gridy = 2;
		c.weighty = 0.001;
		c.gridx  = 6;
		c.gridwidth = 2;
		add(lb1, c);
		
		JLabel lb2 = new JLabel("pagar tus impuestos");
		lb2.setAlignmentX(Component.LEFT_ALIGNMENT);
		lb2.setFont(new Font("Heveltica", Font.PLAIN, 40));
		lb2.setForeground(Color.decode("#9E9FA1"));
		c.gridy = 3;
		c.weighty = 0.001;
		c.gridx  = 6;
		c.gridwidth = 3;
		add(lb2, c);
		
		JLabel lb3 = new JLabel("con solo contar hasta 3");
		lb3.setAlignmentX(Component.LEFT_ALIGNMENT);
		lb3.setFont(new Font("Heveltica", Font.PLAIN, 40));
		lb3.setForeground(Color.decode("#9E9FA1"));
		c.gridy = 4;
		c.weighty = 0.001;
		c.gridx  = 6;
		c.gridwidth = 3;
		add(lb3, c);
		
		JLabel lb4 = new JLabel("");
		lb4.setAlignmentX(Component.LEFT_ALIGNMENT);
		c.gridy = 5;
		c.weighty = 0.03;
		c.gridx  = 6;
		c.gridwidth = 3;
		add(lb4, c);
		
		JButton btn1 = new JButton("     Descubre más     ");
		btn1.setAlignmentX(Component.LEFT_ALIGNMENT);
		btn1.setFont(new Font("Heveltica", Font.PLAIN, 14));
		btn1.setForeground(Color.decode("#000000"));
		btn1.setBackground(Color.decode("#ffd400"));
		btn1.setBorder(BorderFactory.createEmptyBorder());
		c.gridy = 6;
		c.weighty = 0.02;
		c.gridx  = 6;
		c.gridwidth = 1;
		add(btn1, c);
		
		JLabel lb5 = new JLabel("");
		lb5.setAlignmentX(Component.LEFT_ALIGNMENT);
		c.gridy = 7;
		c.weighty = 0.3;
		c.gridx  = 6;
		c.gridwidth = 3;
		add(lb5, c);
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		setMinimumSize(getParent().getSize());
		g.drawImage(img, 0, 0, this);
	}

}
