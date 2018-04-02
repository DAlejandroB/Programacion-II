package com.afcr.graphics.gui;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.AffineTransform;

/**
 * Clase Figure
 * 
 * @author Andrés Felipe Chaparro Rosas
 * @since 1.8
 */
public class Figure {

	private int size;
	private double rotation;
	private Point point;
	private Graphics2D graphics;

	/**
	 * Constructor que inicializa los atributos size y point
	 * 
	 * @param size
	 *            tamaño de la bicicleta
	 * @param point
	 *            posicion de la bicicleta
	 */
	public Figure(int size, Point point, double rotation) {
		this.size = size;
		this.point = point;
		this.rotation = rotation;
	}

	/**
	 * Muestra el dibujo de una bicicleta
	 */
	public void show() {
		rotationAction();
		wheels();
		armchair();
		skeleton();
		pinions();
		handle();
		pedals();
	}

	private void handle() {
		graphics.setColor(Color.black);
		int[] x1 = { this.point.x + 295 * this.size / 100, this.point.x + 305 * this.size / 100,
				this.point.x + 275 * this.size / 100, this.point.x + 265 * this.size / 100 };
		int[] y1 = { this.point.y + 50 * this.size / 100, this.point.y + 50 * this.size / 100,
				this.point.y - 100 * this.size / 100, this.point.y - 100 * this.size / 100 };
		graphics.fillPolygon(x1, y1, 4);
		int[] x2 = { this.point.x + 220 * this.size / 100, this.point.x + 220 * this.size / 100,
				this.point.x + 320 * this.size / 100, this.point.x + 320 * this.size / 100 };
		int[] y2 = { this.point.y - 100 * this.size / 100, this.point.y - 110 * this.size / 100,
				this.point.y - 100 * this.size / 100, this.point.y - 90 * this.size / 100 };
		graphics.fillPolygon(x2, y2, 4);
	}

	private void armchair() {
		graphics.setColor(Color.black);
		int[] x1 = { this.point.x + 14 * this.size / 10, this.point.x + 13 * this.size / 10,
				this.point.x + 14 * this.size / 10, this.point.x + 15 * this.size / 10 };
		int[] y1 = { this.point.y - 75 * this.size / 100, this.point.y - 75 * this.size / 100,
				this.point.y + 6 * this.size / 10, this.point.y + 6 * this.size / 10 };
		graphics.fillPolygon(x1, y1, 4);
		graphics.setColor(Color.blue);
		int[] x2 = { this.point.x + 23 * this.size / 20, this.point.x + 18 * this.size / 10,
				this.point.x + 23 * this.size / 20 };
		int[] y2 = { this.point.y - 88 * this.size / 100, this.point.y - 75 * this.size / 100,
				this.point.y - 55 * this.size / 100 };
		graphics.fillPolygon(x2, y2, 3);
	}

	private void pedals() {
		graphics.setColor(Color.black);
		graphics.fillOval(this.point.x + 25 * this.size / 20, this.point.y + this.size * 2 / 5, this.size * 2 / 5,
				this.size * 2 / 5);
		int[] x1 = { this.point.x + this.size * 17 / 10, this.point.x + 18 * this.size / 10,
				this.point.x + 12 * this.size / 10, this.point.x + 11 * this.size / 10 };
		int[] y1 = { this.point.y + 9 * this.size / 10, this.point.y + 9 * this.size / 10,
				this.point.y + 3 * this.size / 10, this.point.y + 3 * this.size / 10 };
		graphics.fillPolygon(x1, y1, 4);
		int[] x2 = { this.point.x + 33 * this.size / 20, this.point.x + 37 * this.size / 20,
				this.point.x + 37 * this.size / 20, this.point.x + 33 * this.size / 20 };
		int[] y2 = { this.point.y + 93 * this.size / 100, this.point.y + 93 * this.size / 100,
				this.point.y + 88 * this.size / 100, this.point.y + 88 * this.size / 100 };
		graphics.fillPolygon(x2, y2, 4);
		int[] x3 = { this.point.x + 25 * this.size / 20, this.point.x + 21 * this.size / 20,
				this.point.x + 21 * this.size / 20, this.point.x + 25 * this.size / 20 };
		int[] y3 = { this.point.y + 33 * this.size / 100, this.point.y + 33 * this.size / 100,
				this.point.y + 28 * this.size / 100, this.point.y + 28 * this.size / 100 };
		graphics.fillPolygon(x3, y3, 4);
	}

	private void skeleton() {
		graphics.setColor(Color.red);
		int[] x1 = { this.point.x + this.size / 2, this.point.x + this.size * 3 / 5, this.point.x + this.size * 3 / 2,
				this.point.x + this.size * 7 / 5 };
		int[] y1 = { this.point.y + this.size / 2, this.point.y + this.size / 2, this.point.y - this.size * 2 / 5,
				this.point.y - this.size * 2 / 5 };
		graphics.fillPolygon(x1, y1, 4);
		int[] x2 = { this.point.x + this.size / 2, this.point.x + this.size * 3 / 5, this.point.x + this.size * 3 / 2,
				this.point.x + this.size * 7 / 5 };
		int[] y2 = { this.point.y + this.size / 2, this.point.y + this.size * 3 / 5, this.point.y + this.size * 7 / 10,
				this.point.y + this.size * 3 / 5 };
		graphics.fillPolygon(x2, y2, 4);
		int[] x3 = { this.point.x + this.size * 3 / 2, this.point.x + this.size * 7 / 5,
				this.point.x + this.size * 53 / 20, this.point.x + this.size * 55 / 20 };
		int[] y3 = { this.point.y + this.size * 7 / 10, this.point.y + this.size * 3 / 5,
				this.point.y - this.size * 15 / 20, this.point.y - this.size * 15 / 20 };
		graphics.fillPolygon(x3, y3, 4);
		int[] x4 = { this.point.x + this.size * 53 / 20, this.point.x + this.size * 53 / 20,
				this.point.x + this.size * 7 / 5, this.point.x + this.size * 7 / 5 };
		int[] y4 = { this.point.y - this.size * 15 / 20, this.point.y - this.size * 13 / 20,
				this.point.y - this.size * 3 / 10, this.point.y - this.size * 2 / 5 };
		graphics.fillPolygon(x4, y4, 4);
	}

	private void wheels() {
		graphics.setColor(Color.black);
		graphics.fillOval(this.point.x, this.point.y, this.size, this.size);
		graphics.fillOval(this.point.x + (this.size * 25 / 10), this.point.y, this.size, this.size);
		graphics.setColor(Color.white);
		graphics.fillOval(this.point.x + (this.size / 10), this.point.y + (this.size / 10), this.size * 4 / 5,
				this.size * 4 / 5);
		graphics.fillOval(this.point.x + (this.size * 25 / 10) + (this.size / 10), this.point.y + (this.size / 10),
				this.size * 4 / 5, this.size * 4 / 5);
	}

	private void pinions() {
		graphics.setColor(Color.black);
		graphics.fillOval(this.point.x + this.size * 2 / 5, this.point.y + this.size * 2 / 5, this.size * 1 / 5,
				this.size * 1 / 5);
		graphics.fillOval(this.point.x + (this.size * 29 / 10), this.point.y + this.size * 2 / 5, this.size * 1 / 5,
				this.size * 1 / 5);
	}

	private void rotationAction() {
		this.graphics.transform(AffineTransform.getRotateInstance(Math.toRadians(this.rotation),
				this.point.x+175* this.size / 100, this.point.y-this.size / 20));
	}

	/**
	 * Establece el valor del objeto graphics
	 * 
	 * @param graphics
	 *            objeto que se utiliza para los diversos dibujos
	 */
	public void setGraphics(Graphics2D graphics) {
		this.graphics = graphics;
	}
}
