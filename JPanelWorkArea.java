package com.afcr.graphics.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class JPanelWorkArea extends JPanel {

	private static final long serialVersionUID = 1L;

	private Figure figure;

	public JPanelWorkArea(Figure figure) {
		super();
		this.figure = figure;
		init();
	}

	private void init() {
		this.setBackground(Color.white);
	}

	@Override
	public void paint(Graphics graphics) {
		figure.setGraphics((Graphics2D) graphics);
		figure.show();
	}
}
