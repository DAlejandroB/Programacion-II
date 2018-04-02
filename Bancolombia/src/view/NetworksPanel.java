package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class NetworksPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NetworksPanel() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setBackground(Color.decode("#ffffff"));
		
		JLabel lb = new JLabel("Síguenos en nuestras redes sociales");
		lb.setBackground(Color.decode("#ffffff"));
		lb.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 10));
		lb.setFont(new Font("Heveltica", Font.PLAIN, 14));
		lb.setForeground(Color.decode("#999999"));
		lb.setHorizontalTextPosition(SwingConstants.LEFT);
		add(lb);
		
		Networks networks  = new Networks();
		add(networks);
	}

}
