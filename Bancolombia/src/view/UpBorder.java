package view;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class UpBorder extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public UpBorder() {
		setLayout(new BorderLayout());
		
		MainMenu mainMenu = new MainMenu();
		add(mainMenu, BorderLayout.PAGE_START);
		
		ProductMenu productMenu = new ProductMenu();
		add(productMenu, BorderLayout.CENTER);
		
		CenterPanel centerPanel = new CenterPanel();
		add(centerPanel, BorderLayout.PAGE_END);
	}

}
