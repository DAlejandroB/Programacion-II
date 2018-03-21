package com.afcr.graphics.gui;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JToolBar;

public class JToolBarAppGraphic extends JToolBar {
	
	private static final long serialVersionUID = 1L;

	public JToolBarAppGraphic() {
		super();
		init();
	}
	
	private void init() {
		this.setBorder(BorderFactory.createEtchedBorder());
		this.add(new JButton("A 1"));
		this.add(new JButton("A 2"));
		this.add(new JButton("A 3"));
	}
}
