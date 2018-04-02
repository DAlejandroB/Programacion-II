package com.uptc.cristancho.graphics.GUI;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

/**
 * Clase Figure, encargada de graficar el robot Fecha: 16/03/2018
 * 
 * @author Fabian Alejandro Cristancho Rincon
 *
 */

public class Figure {
	
	//Hacer que el robot rote, dependiendo del grado de rotacion que se le de (90, 180, 45)

	private Graphics2D graphics;
	private int size;
	private Point point;
	private double rotation;

	/**
	 * Constructor encargado de asignarle un valor al tamaño y coordenadas del robot
	 * 
	 * @param size
	 *            Tamaño de la figura
	 * @param point
	 *            Coordenada de la figura
	 */

	public Figure(int size, Point point, double rotation) {
		this.size = size;
		this.point = point;
		this.rotation = rotation;
	}
	
	/**
	 * Obtiene un grafico encargado de construir el robot
	 * @return Grafico que construye el robot
	 */
	
	public Graphics2D getGraphics() {
		return this.graphics;
	}

	/**
	 * Asigna un determinado grafico para la construccion del robot
	 * 
	 * @param graphics
	 *            Grafico asignado
	 */

	public void setGraphics(Graphics2D graphics) {
		this.graphics = graphics;
	}
	
	/**
	 * Obtiene el tamaño establecido para las dimensiones del robot
	 * @return Tamaño de cabeza del robot
	 */
	
	public int getSize() {
		return size;
	}
	
	/**
	 * Obtiene las coordenadas en las que va a estar ubicado el robot
	 * @return Coordenadas x e y de cabeza del robot
	 */

	public Point getPoint() {
		return point;
	}
	
	/**
	 * Obtiene la rotacion que se le da al robot
	 * @return Grados de rotacion del robot
	 */

	public double getRotation() {
		return rotation;
	}

	/**
	 * Encargado de construir el sombrero del robot mediante un triangulo, con ayuda
	 * del poligono
	 */
	
	private void hat() {
		int[] hatX1 = { this.point.x + this.size / 2, this.point.x, this.point.x + this.size };
		int[] hatY1 = { this.point.y - this.size * 7 / 8, this.point.y, this.point.y };

		graphics.setColor(new Color(219, 32, 32));
		graphics.fillPolygon(hatX1, hatY1, 3);
	}

	/**
	 * Encargado de construir la cara del robot, con ayuda de un cuadrado
	 */

	private void face() {
		graphics.setColor(new Color(113, 126, 140));
		graphics.fillRect(this.point.x, this.point.y, this.size, this.size);
	}

	/**
	 * Encargado de construir las orejas del robot, con ayuda de arcos
	 */

	private void ears() {
		graphics.setColor(new Color(252, 88, 93));
		graphics.fillArc(this.point.x - this.size / 4, this.point.y + this.size / 4, this.size / 2, this.size / 4, 90,
				180);
		graphics.fillArc(this.point.x + this.size * 3 / 4, this.point.y + this.size / 4, this.size / 2, this.size / 4,
				90, -180);
	}

	/**
	 * Encargado de construir los ojos del robot, a partir de cuadrados, y poligonos
	 * de rombos para las pupilas
	 */

	private void eyes() {
		int[] eye1X = { this.point.x + this.size / 4, (int) (this.point.x + this.size * 1.5 / 8),
				this.point.x + this.size / 4, (int) (this.point.x + this.size * 2.5 / 8) };
		int[] eye1Y = { (int) (this.point.y + this.size * 2.5 / 8), this.point.y + this.size * 3 / 8,
				(int) (this.point.y + this.size * 3.5 / 8), this.point.y + this.size * 3 / 8 };
		int[] eye2X = { this.point.x + this.size * 3 / 4, (int) (this.point.x + this.size * 5.5 / 8),
				this.point.x + this.size * 3 / 4, (int) (this.point.x + this.size * 6.5 / 8) };
		int[] eye2Y = { (int) (this.point.y + this.size * 2.5 / 8), this.point.y + this.size * 3 / 8,
				(int) (this.point.y + this.size * 3.5 / 8), this.point.y + this.size * 3 / 8 };

		graphics.setColor(new Color(211, 211, 211));
		graphics.fillRect(this.point.x + this.size / 8, this.point.y + this.size / 4, this.size / 4, this.size / 4);
		graphics.fillRect(this.point.x + this.size * 5 / 8, this.point.y + this.size / 4, this.size / 4, this.size / 4);
		graphics.setColor(new Color(0, 0, 0));
		graphics.fillPolygon(eye1X, eye1Y, 4);
		graphics.fillPolygon(eye2X, eye2Y, 4);
	}

	/**
	 * Encargado de construir la boca del robot mediante un rectangulo, y una linea
	 * para los dientes
	 */

	private void mouth() {
		graphics.setColor(Color.BLACK);
		graphics.fillRect(this.point.x + this.size / 8, this.point.y + this.size * 5 / 8, this.size * 3 / 4,
				this.size / 4);
		graphics.setColor(Color.WHITE);
		graphics.drawLine(this.point.x + this.size / 8, this.point.y + this.size * 3 / 4,
				this.point.x + this.size * 7 / 8, this.point.y + this.size * 3 / 4);
	}

	/**
	 * Encargado de construir la columna del robot, a traves de un rectangulo
	 */

	private void column() {
		graphics.setColor(new Color(111, 111, 111));
		graphics.fillRect(this.point.x + this.size * 3 / 8, this.point.y + this.size, this.size / 4,
				this.size * 11 / 4);
	}

	/**
	 * Encargado de construir el tronco del robot, junto con un cajon, con ayuda de
	 * cuadrados
	 */

	private void trunk() {
		graphics.setColor(new Color(113, 126, 140));
		graphics.fillRect(this.point.x - this.size / 8, this.point.y + this.size * 11 / 8, this.size * 5 / 4,
				this.size * 5 / 4);
		graphics.setColor(new Color(99, 99, 99));
		graphics.drawRect(this.point.x, this.point.y + this.size * 3 / 2, this.size, this.size);
		graphics.fillRect((int) (this.point.x + this.size * 0.3 / 8), (int) (this.point.y + this.size * 12.3 / 8),
				(int) (this.size * 7.6 / 8), (int) (this.size * 7.6 / 8));
		graphics.setColor(Color.BLACK);
		graphics.fillOval((int) (this.point.x + this.size * 6.5 / 8), (int) (this.point.y + this.size * 15.5 / 8),
				this.size / 8, this.size / 8);
	}

	/**
	 * Encargado de construir los hombros del robot con ayuda de rectangulos
	 */

	private void shoulder() {
		graphics.setColor(Color.BLACK);
		graphics.fillRect(this.point.x - this.size * 3 / 8, this.point.y + this.size * 3 / 2, this.size / 4,
				this.size * 5 / 8);
		graphics.fillRect(this.point.x + this.size * 9 / 8, this.point.y + this.size * 3 / 2, this.size / 4,
				this.size * 5 / 8);
		graphics.fillRect(this.point.x - this.size / 2, this.point.y + this.size * 13 / 8, this.size / 8,
				this.size * 3 / 8);
		graphics.fillRect((int) (this.point.x + this.size * 11.1 / 8), this.point.y + this.size * 13 / 8, this.size / 8,
				this.size * 3 / 8);
	}

	/**
	 * Encargado de construir los brazos del robot, mediante rectangulos
	 */

	private void arms() {
		graphics.setColor(new Color(113, 126, 140));
		graphics.fillRect(this.point.x - this.size * 3 / 4, (int) (this.point.y + this.size * 7 / 4), this.size / 4,
				this.size / 8);
		graphics.fillRect(this.point.x + this.size * 3 / 2, (int) (this.point.y + this.size * 7 / 4), this.size / 4,
				this.size / 8);
		graphics.fillRect(this.point.x - this.size * 3 / 4, (int) (this.point.y + this.size * 7 / 4), this.size / 8,
				(int) (this.size * 7 / 8));
		graphics.fillRect(this.point.x + this.size * 7 / 4, (int) (this.point.y + this.size * 7 / 4), this.size / 8,
				(int) (this.size * 7 / 8));
	}

	/**
	 * Encargado de construir las manos del robot, con ayuda de poligonos
	 * irregulares
	 */

	private void hands() {
		graphics.setColor(new Color(35, 92, 132));
		int[] hand1X = { this.point.x - this.size * 3 / 4, this.point.x - this.size * 7 / 8,
				(int) (this.point.x - this.size * 6.5 / 8), this.point.x - this.size * 3 / 4,
				this.point.x - this.size * 5 / 8, (int) (this.point.x - this.size * 4.5 / 8),
				this.point.x - this.size / 2, this.point.x - this.size * 5 / 8 };
		int[] hand1Y = { this.point.y + this.size * 21 / 8, this.point.y + this.size * 11 / 4,
				this.point.y + this.size * 23 / 8, this.point.y + this.size * 11 / 4, this.point.y + this.size * 11 / 4,
				this.point.y + this.size * 23 / 8, this.point.y + this.size * 11 / 4,
				this.point.y + this.size * 21 / 8 };
		int[] hand2X = { this.point.x + this.size * 7 / 4, this.point.x + this.size * 13 / 8,
				(int) (this.point.x + this.size * 13.5 / 8), this.point.x + this.size * 7 / 4,
				this.point.x + this.size * 15 / 8, (int) (this.point.x + this.size * 15.5 / 8),
				this.point.x + this.size * 2, this.point.x + this.size * 15 / 8 };
		int[] hand2Y = { this.point.y + this.size * 21 / 8, this.point.y + this.size * 11 / 4,
				this.point.y + this.size * 23 / 8, this.point.y + this.size * 11 / 4, this.point.y + this.size * 11 / 4,
				this.point.y + this.size * 23 / 8, this.point.y + this.size * 11 / 4,
				this.point.y + this.size * 21 / 8 };

		graphics.fillPolygon(hand1X, hand1Y, 8);
		graphics.fillPolygon(hand2X, hand2Y, 8);
	}

	/**
	 * Encargado de construir el cinturon del robot, con un rectangulo
	 */

	private void belt() {
		graphics.setColor(new Color(188, 120, 24));
		graphics.fillRect(this.point.x, this.point.y + this.size * 21 / 8, this.size, this.size / 4);
	}

	/**
	 * Encargado de construir el soporte del robot, mediante rectangulos
	 */

	private void support() {
		graphics.setColor(new Color(93, 112, 112));
		graphics.fillRect(this.point.x - this.size / 4, this.point.y + this.size * 15 / 4, this.size * 3 / 2,
				this.size / 8);
		graphics.fillRect(this.point.x, this.point.y + this.size * 29 / 8, this.size, this.size / 8);
		graphics.fillRect(this.point.x - this.size / 4, this.point.y + this.size * 15 / 4, this.size / 8,
				this.size / 2);
		graphics.fillRect((int) (this.point.x + this.size * 9.1 / 8), this.point.y + this.size * 15 / 4, this.size / 8,
				this.size / 2);
		graphics.fillRect(this.point.x, this.point.y + this.size * 29 / 8, this.size / 8, this.size * 3 / 8);
		graphics.fillRect((int) (this.point.x + this.size * 7.1 / 8), this.point.y + this.size * 29 / 8, this.size / 8,
				this.size * 3 / 8);
	}

	/**
	 * Encargado de construir las ruedas que permiten el movimiento del robot,
	 * mediante circulos
	 */

	private void wheels() {
		graphics.setColor(new Color(0, 0, 0));
		graphics.fillOval((int) (this.point.x - this.size * 2.5 / 8), this.point.y + this.size * 17 / 4, this.size / 4,
				this.size / 4);
		graphics.fillOval((int) (this.point.x + this.size * 8.6 / 8), this.point.y + this.size * 17 / 4, this.size / 4,
				this.size / 4);
		graphics.fillOval((int) (this.point.x - this.size * 0.5 / 8), this.point.y + this.size * 4, this.size / 4,
				this.size / 4);
		graphics.fillOval((int) (this.point.x + this.size * 6.5 / 8), this.point.y + this.size * 4, this.size / 4,
				this.size / 4);
	}

	/**
	 * Encargado de ensamblar todas las partes del robot, y mostrarlo como una
	 * unidad
	 */

	public void show() {
		hat();
		face();
		ears();
		eyes();
		mouth();
		column();
		trunk();
		shoulder();
		arms();
		hands();
		belt();
		support();
		wheels();
	}
}
