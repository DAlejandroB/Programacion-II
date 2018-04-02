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

public class VisaPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Image img;
	
	public VisaPanel() {
		setLayout(new GridBagLayout());
		img = new ImageIcon(getClass().getResource("/Images/tarjeta-visa-bancolombia.jpg")).getImage();
		setPreferredSize(new Dimension(img.getWidth(this), img.getHeight(this)));
		
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 1;
		c.gridheight = 1;
		c.weighty = 0.001;
		
		for (int i = 0; i < 8; i++) {
			c.gridx = i;
			add(new JLabel(" "), c);
		}
		
		JLabel lb6 = new JLabel("  ");
		c.gridy = 1;
		c.weighty = 0.01;
		c.gridx  = 6;
		c.gridwidth = 3;
		add(lb6, c);
		
		JLabel lb1 = new JLabel("<html> Entre los hinchas que se quedan y los <br> "
				+ "que se ganan un viaje a Rusia, hay <br> una Tarjeta Visa Bancolombia de <br> diferencia. <html>");
		lb1.setAlignmentX(Component.LEFT_ALIGNMENT);
		lb1.setFont(new Font("Heveltica", Font.PLAIN, 26));
		lb1.setForeground(Color.decode("#00448c"));
		c.gridy = 2;
		c.weighty = 0.02;
		c.gridx  = 6;
		c.gridwidth = 3;
		add(lb1, c);
		
		JLabel lb2 = new JLabel("  ");
		c.gridy = 3;
		c.weighty = 0.000001;
		c.gridx  = 6;
		c.gridwidth = 3;
		add(lb2, c);
		
		JLabel lb3 = new JLabel("<html> Con tus Tarjetas Visa Bancolombia te puedes ir a La Copa  <br> "
				+ "Mundial FIFA Rusia 2018™ gracias a Visa con un acompañante. <br> Válido del 15 de febrero al 15 abril de 2018. <html>");
		lb3.setAlignmentX(Component.LEFT_ALIGNMENT);
		lb3.setFont(new Font("Heveltica", Font.PLAIN, 16));
		lb3.setForeground(Color.decode("#9E9FA1"));
		c.gridy = 4;
		c.weighty = 0.02;
		c.gridx  = 6;
		c.gridwidth = 3;
		add(lb3, c);
		
		JLabel lb4 = new JLabel("  ");
		c.gridy = 5;
		c.weighty = 0.0001;
		c.gridx  = 6;
		c.gridwidth = 3;
		add(lb4, c);
		
		JButton btn1 = new JButton("     Conoce más     ");
		btn1.setAlignmentX(Component.LEFT_ALIGNMENT);
		btn1.setFont(new Font("Heveltica", Font.PLAIN, 14));
		btn1.setForeground(Color.decode("#00448c"));
		btn1.setBackground(Color.decode("#ffd400"));
		btn1.setBorder(BorderFactory.createEmptyBorder());
		c.gridy = 6;
		c.weighty = 0.001;
		c.gridx  = 6;
		c.gridwidth = 1;
		add(btn1, c);
		
		JLabel lb5 = new JLabel("  ");
		c.gridy = 7;
		c.weighty = 0.1;
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
