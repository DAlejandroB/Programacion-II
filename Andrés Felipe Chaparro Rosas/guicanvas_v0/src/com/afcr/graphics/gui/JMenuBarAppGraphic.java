package com.afcr.graphics.gui;

import javax.swing.JMenuBar;
import javax.swing.JMenu;

public class JMenuBarAppGraphic extends JMenuBar {

	private static final long serialVersionUID = 1L;

	public JMenuBarAppGraphic() {
		super();
		init();
	}
	
	private void init() {
		this.add(new JMenu("OP A"));
		this.add(new JMenu("OP B"));
		this.add(new JMenu("OP C"));
		this.add(new JMenu("OP D"));
	}
}
