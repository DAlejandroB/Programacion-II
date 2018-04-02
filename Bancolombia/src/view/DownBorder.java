package view;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class DownBorder extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public DownBorder() {
		setLayout(new BorderLayout());
		
		ContactPanel contactPanel = new ContactPanel();
		add(contactPanel, BorderLayout.PAGE_START);
		
		ButtonPanel buttonPanel = new ButtonPanel();
		add(buttonPanel, BorderLayout.CENTER);
		
		CopyrightPanel copyrightPanel = new CopyrightPanel();
		add(copyrightPanel, BorderLayout.PAGE_END);
	}

}
