package com.afcr.graphics.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

public class JPanelWorkArea extends JPanel {

	private static final long serialVersionUID = 1L;
	private Figure[] figures;

	public JPanelWorkArea(Figure[] figures) {
		super();
		this.figures = figures;
		init();
	}

	private void init() {
		this.setBackground(Color.white);
	}
	public void moveBikes() {
		for (Figure figure : figures) {
			figure.moveBike();
		}
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		for (Figure figure : figures) {
			figure.setGraphics(g2d);
			figure.show();
		}
	}
}
