package com.afcr.graphics.gui;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelStatusBar extends JPanel{
	private static final long serialVersionUID = 1L;
	
	public JPanelStatusBar() {
		super();
		init();
	}

	private void init() {
		this.setBorder(BorderFactory.createEtchedBorder());
		this.add(new JLabel("Esta es la barra de estado de appgraphics"));
	}
}
