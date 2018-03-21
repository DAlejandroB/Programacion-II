package com.afcr.ui.gui;

import javax.swing.JFrame;

public class MyJFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private JMenuBarCalculator jMenuBarCalculator;
	private JPanelDevCalculator jPanelDevCalculator;

	public MyJFrame() {
		super();
		this.jMenuBarCalculator = new JMenuBarCalculator();
		this.jPanelDevCalculator = new JPanelDevCalculator();
		settings();
	}

	public void settings() {
		this.setTitle("Calculadora");
		this.setSize(413, 383);
		this.setResizable(false);
		init();
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void init() {
		this.setJMenuBar(jMenuBarCalculator);
		this.add(jPanelDevCalculator);
	}
}
