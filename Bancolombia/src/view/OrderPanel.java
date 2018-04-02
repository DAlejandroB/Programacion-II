package view;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class OrderPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public OrderPanel() {
		setLayout(new BorderLayout());
		
		UpBorder up = new UpBorder();
		add(up, BorderLayout.PAGE_START);
		
		GridCenter center = new GridCenter();
		add(center, BorderLayout.CENTER);
		
		DownBorder down = new DownBorder();
		add(down, BorderLayout.PAGE_END);
	}

}
