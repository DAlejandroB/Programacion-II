package com.afcr.graphics.gui;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

import com.afcr.figures.models.FigureDao;

/**
 * Clase Figure
 * 
 * @author Andrés Felipe Chaparro Rosas
 * @since 1.8
 */
public class Figure extends FigureDao {
	private Graphics2D graphics;

	/**
	 * Constructor que inicializa los atributos size y point
	 * 
	 * @param size
	 *            tamaño de la bicicleta
	 * @param point
	 *            posicion de la bicicleta
	 */
	public Figure(FigureDao figure) {
		super(figure, figure.getSize(), figure.getDirection(), figure.getStatus(), figure.getColor());
		this.y += 110;
	}

	/**
	 * Muestra el dibujo de una bicicleta
	 */
	public void show() {
		rotationAction();
		wheels();
		armchairholder();
		color();
		armchair();
		color();
		skeleton();
		pinions();
		handle();
		pedals();
		wind();
		restoreRotationAction();
	}

	public void moveBike() {
		this.x = x + 1;
		this.y = y + 1;
	}

	private void wind() {
		switch (status) {
		case STOP:
			break;
		case RUNNING:
			graphics.setColor(Color.blue);
			graphics.drawLine(this.x, this.y, (int) (this.x - 2 * this.size), this.y);
			graphics.drawLine(this.x - (int) this.size / 2, this.y + (int) this.size / 4,
					(int) (this.x - 2 * this.size) - (int) this.size / 2, this.y + (int) this.size / 4);
			graphics.drawLine(this.x, this.y + (int) this.size / 2, (int) (this.x - 2 * this.size),
					this.y + (int) this.size / 2);
			break;
		default:
			break;
		}
	}

	private void handle() {
		graphics.setColor(Color.black);
		int[] x1 = { (int) (this.x + 295 * this.size / 100), (int) (this.x + 305 * this.size / 100),
				(int) (this.x + 275 * this.size / 100), (int) (this.x + 265 * this.size / 100) };
		int[] y1 = { (int) (this.y + 50 * this.size / 100), (int) (this.y + 50 * this.size / 100),
				(int) (this.y - 100 * this.size / 100), (int) (this.y - 100 * this.size / 100) };
		graphics.fillPolygon(x1, y1, 4);
		int[] x2 = { (int) (this.x + 220 * this.size / 100), (int) (this.x + 220 * this.size / 100),
				(int) (this.x + 320 * this.size / 100), (int) (this.x + 320 * this.size / 100) };
		int[] y2 = { (int) (this.y - 100 * this.size / 100), (int) (this.y - 110 * this.size / 100),
				(int) (this.y - 100 * this.size / 100), (int) (this.y - 90 * this.size / 100) };
		graphics.fillPolygon(x2, y2, 4);
	}

	private void color() {
		switch (this.color) {
		case BLUE:
			graphics.setColor(Color.blue);
			break;
		case RED:
			graphics.setColor(Color.red);
			break;
		case BLACK:
			graphics.setColor(Color.black);
			break;
		case GREEN:
			graphics.setColor(Color.green);
			break;
		case ORANGE:
			graphics.setColor(Color.orange);
			break;
		case YELLOW:
			graphics.setColor(Color.yellow);
			break;
		case PURPLE:
			graphics.setColor(Color.magenta);
			break;
		case WHITE:
			graphics.setColor(Color.white);
			break;
		default:
			break;
		}
	}

	private void armchair() {
		int[] x2 = { (int) (this.x + 23 * this.size / 20), (int) (this.x + 18 * this.size / 10),
				(int) (this.x + 23 * this.size / 20) };
		int[] y2 = { (int) (this.y - 88 * this.size / 100), (int) (this.y - 75 * this.size / 100),
				(int) (this.y - 55 * this.size / 100) };
		graphics.fillPolygon(x2, y2, 3);
	}

	private void armchairholder() {
		graphics.setColor(Color.black);
		int[] x1 = { (int) (this.x + 14 * this.size / 10), (int) (this.x + 13 * this.size / 10),
				(int) (this.x + 14 * this.size / 10), (int) (this.x + 15 * this.size / 10) };
		int[] y1 = { (int) (this.y - 75 * this.size / 100), (int) (this.y - 75 * this.size / 100),
				(int) (this.y + 6 * this.size / 10), (int) (this.y + 6 * this.size / 10) };
		graphics.fillPolygon(x1, y1, 4);
	}

	private void pedals() {
		graphics.setColor(Color.black);
		graphics.fillOval((int) (this.x + 25 * this.size / 20), (int) (this.y + this.size * 2 / 5),
				(int) (this.size * 2 / 5), (int) (this.size * 2 / 5));
		int[] x1 = { (int) (this.x + this.size * 17 / 10), (int) (this.x + 18 * this.size / 10),
				(int) (this.x + 12 * this.size / 10), (int) (this.x + 11 * this.size / 10) };
		int[] y1 = { (int) (this.y + 9 * this.size / 10), (int) (this.y + 9 * this.size / 10),
				(int) (this.y + 3 * this.size / 10), (int) (this.y + 3 * this.size / 10) };
		graphics.fillPolygon(x1, y1, 4);
		int[] x2 = { (int) (this.x + 33 * this.size / 20), (int) (this.x + 37 * this.size / 20),
				(int) (this.x + 37 * this.size / 20), (int) (this.x + 33 * this.size / 20) };
		int[] y2 = { (int) (this.y + 93 * this.size / 100), (int) (this.y + 93 * this.size / 100),
				(int) (this.y + 88 * this.size / 100), (int) (this.y + 88 * this.size / 100) };
		graphics.fillPolygon(x2, y2, 4);
		int[] x3 = { (int) (this.x + 25 * this.size / 20), (int) (this.x + 21 * this.size / 20),
				(int) (this.x + 21 * this.size / 20), (int) (this.x + 25 * this.size / 20) };
		int[] y3 = { (int) (this.y + 33 * this.size / 100), (int) (this.y + 33 * this.size / 100),
				(int) (this.y + 28 * this.size / 100), (int) (this.y + 28 * this.size / 100) };
		graphics.fillPolygon(x3, y3, 4);
	}

	private void skeleton() {
		int[] x1 = { (int) (this.x + this.size / 2), (int) (this.x + this.size * 3 / 5),
				(int) (this.x + this.size * 3 / 2), (int) (this.x + this.size * 7 / 5) };
		int[] y1 = { (int) (this.y + this.size / 2), (int) (this.y + this.size / 2), (int) (this.y - this.size * 2 / 5),
				(int) (this.y - this.size * 2 / 5) };
		graphics.fillPolygon(x1, y1, 4);
		int[] x2 = { (int) (this.x + this.size / 2), (int) (this.x + this.size * 3 / 5),
				(int) (this.x + this.size * 3 / 2), (int) (this.x + this.size * 7 / 5) };
		int[] y2 = { (int) (this.y + this.size / 2), (int) (this.y + this.size * 3 / 5),
				(int) (this.y + this.size * 7 / 10), (int) (this.y + this.size * 3 / 5) };
		graphics.fillPolygon(x2, y2, 4);
		int[] x3 = { (int) (this.x + this.size * 3 / 2), (int) (this.x + this.size * 7 / 5),
				(int) (this.x + this.size * 53 / 20), (int) (this.x + this.size * 55 / 20) };
		int[] y3 = { (int) (this.y + this.size * 7 / 10), (int) (this.y + this.size * 3 / 5),
				(int) (this.y - this.size * 15 / 20), (int) (this.y - this.size * 15 / 20) };
		graphics.fillPolygon(x3, y3, 4);
		int[] x4 = { (int) (this.x + this.size * 53 / 20), (int) (this.x + this.size * 53 / 20),
				(int) (this.x + this.size * 7 / 5), (int) (this.x + this.size * 7 / 5) };
		int[] y4 = { (int) (this.y - this.size * 15 / 20), (int) (this.y - this.size * 13 / 20),
				(int) (this.y - this.size * 3 / 10), (int) (this.y - this.size * 2 / 5) };
		graphics.fillPolygon(x4, y4, 4);
	}

	private void wheels() {
		graphics.setColor(Color.black);
		graphics.fillOval(this.x, this.y, (int) this.size, (int) this.size);
		graphics.fillOval((int) (this.x + (this.size * 25 / 10)), this.y, (int) this.size, (int) this.size);
		graphics.setColor(Color.white);
		graphics.fillOval((int) (this.x + (this.size / 10)), (int) (this.y + (this.size / 10)),
				(int) (this.size * 4 / 5), (int) (this.size * 4 / 5));
		graphics.fillOval((int) (this.x + (this.size * 25 / 10) + (this.size / 10)), (int) (this.y + (this.size / 10)),
				(int) (this.size * 4 / 5), (int) (this.size * 4 / 5));
	}

	private void pinions() {
		graphics.setColor(Color.black);
		graphics.fillOval((int) (this.x + this.size * 2 / 5), (int) (this.y + this.size * 2 / 5),
				(int) (this.size * 1 / 5), (int) (this.size * 1 / 5));
		graphics.fillOval((int) (this.x + (this.size * 29 / 10)), (int) (this.y + this.size * 2 / 5),
				(int) (this.size * 1 / 5), (int) (this.size * 1 / 5));
	}

	private void rotationAction() {
		this.graphics.transform(AffineTransform.getRotateInstance(Math.toRadians(this.direction),
				this.x+ (this.size * 7 / 4), this.y));
	}

	private void restoreRotationAction() {
		this.graphics.transform(AffineTransform.getRotateInstance(Math.toRadians(-this.direction),
				this.x+ (this.size * 7 / 4), this.y));
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
