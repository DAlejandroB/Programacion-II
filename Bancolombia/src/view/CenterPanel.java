package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CenterPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Image img;
	
	public CenterPanel() {
		setLayout(new GridBagLayout());
		
		img = new ImageIcon(getClass().getResource("/Images/bg_banner.jpg")).getImage();
		setPreferredSize(new Dimension(img.getWidth(this), img.getHeight(this)));
		
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 1;
		c.gridheight = 1;
		c.weighty = 0.2;
		
		for (int i = 0; i < 10; i++) {
			c.gridx = i;
			add(new JLabel(" "), c);
		}
		
		AccountPanel account = new AccountPanel();
		c.gridy = 3;
		c.weighty = 0.5;
		c.gridx  = 5;
		c.gridwidth = 3;
		add(account, c);
		
		JTextField  txt = new JTextField("Busca lo que tú necesitas");
		txt.setBackground(Color.WHITE);
		txt.setBorder(BorderFactory.createEmptyBorder());
		txt.setForeground(Color.decode("#777777"));
		c.gridy = 4;
		c.weighty = 0.06;
		c.gridx = 3;
		c.gridwidth = 3;
		add(txt, c);
		
		JButton btnSearch = new JButton();
		btnSearch.setBorder(BorderFactory.createEmptyBorder());
		btnSearch.setIcon(new ImageIcon("src/Images/searchBanc.PNG"));
		btnSearch.setBackground(Color.decode("#ffc902"));
		c.gridy = 4;
		c.weighty = 0.06;
		c.gridx = 6;
		c.gridwidth = 1;
		add(btnSearch, c);
		
		JLabel lb = new JLabel(" ");
		c.gridy = 5;
		c.weighty = 0.5;
		c.gridx  = 1;
		c.gridwidth = 9;
		add(lb, c);
		
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		setMinimumSize(getParent().getSize());
		g.drawImage(img, 0, 0, this);
	}

}
