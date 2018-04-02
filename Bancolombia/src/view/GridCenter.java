package view;

import java.awt.GridLayout;

import javax.swing.JPanel;

public class GridCenter extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public GridCenter() {
		setLayout(new GridLayout(2, 1));
		
		TaxPanel taxPanel = new TaxPanel();
		add(taxPanel);
		
		VisaPanel visaPanel = new VisaPanel();
		add(visaPanel);
	}

}
