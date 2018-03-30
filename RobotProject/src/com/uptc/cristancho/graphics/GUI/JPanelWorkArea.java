package com.uptc.cristancho.graphics.GUI;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

import javax.swing.JPanel;

/**
 * Clase JPanelWorkArea, encargada de crear un panel Fecha: 16/03/2018
 * 
 * @author Fabian Alejandro Cristancho Rincon
 *
 */

public class JPanelWorkArea extends JPanel {

	private static final long serialVersionUID = 1L;
	private Figure figure;

	/**
	 * Constructor que le asigna un valor al atributo figure
	 * 
	 * @param figure
	 *            Figura asignada
	 */

	public JPanelWorkArea(Figure figure) {
		super();
		this.figure = figure;
	}

	/**
	 * Metodo sobreescrito de la clase paint
	 * 
	 * @param graphics
	 */

	@Override
	public void paint(Graphics graphics) {
		figure.setGraphics((Graphics2D) graphics);
		figure.getGraphics().transform(AffineTransform.getRotateInstance(Math.toRadians(figure.getRotation()),figure.getPoint().getX() + figure.getSize()/2, figure.getPoint().getY() + figure.getSize()*2));
		figure.show();
	}

}
