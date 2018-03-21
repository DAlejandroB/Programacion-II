package com.afcr.graphics.gui;

import java.awt.Color;
import java.awt.Graphics;

public class Figure {

	private Graphics graphics;
	private int size;

	public Figure(int size) {
		this.size = size;
	}

	public void show() {
		wheels();
		armchair();
		skeleton();
		pinions();
		handle();
		pedals();
	}

	private void wheels() {
		graphics.setColor(Color.black);
		graphics.fillOval(450, 400, 100, 100);
		graphics.fillOval(700, 400, 100, 100);
		graphics.setColor(Color.white);
		graphics.fillOval(460, 410, 80, 80);
		graphics.fillOval(710, 410, 80, 80);
	}

	private void armchair() {
		graphics.setColor(Color.black);
		int[] x1 = { 590, 580, 590, 600 };
		int[] y1 = { 325, 325, 460, 460 };
		graphics.fillPolygon(x1, y1, 4);
		graphics.setColor(Color.blue);
		int[] x2 = { 565, 630, 565};
		int[] y2 = { 312, 325, 345};
		graphics.fillPolygon(x2, y2, 3);
	}

	private void skeleton() {
		graphics.setColor(Color.red);
		int[] x1 = { 500, 510, 600, 590 };
		int[] y1 = { 450, 450, 360, 360 };
		graphics.fillPolygon(x1, y1, 4);
		int[] x2 = { 500, 510, 600, 590 };
		int[] y2 = { 450, 460, 470, 460 };
		graphics.fillPolygon(x2, y2, 4);
		int[] x3 = { 600, 590, 715, 725 };
		int[] y3 = { 470, 460, 325, 325 };
		graphics.fillPolygon(x3, y3, 4);
		int[] x4 = { 715, 715, 590, 590 };
		int[] y4 = { 325, 335, 370, 360 };
		graphics.fillPolygon(x4, y4, 4);
	}

	private void pinions() {
		graphics.setColor(Color.black);
		graphics.fillOval(490, 440, 20, 20);
		graphics.fillOval(740, 440, 20, 20);
	}

	private void handle() {
		graphics.setColor(Color.black);
		int[] x1 = { 745, 755, 725, 715};
		int[] y1 = { 450, 450, 300, 300 };
		graphics.fillPolygon(x1, y1, 4);
		int[] x2 = { 670, 670, 770, 770 };
		int[] y2 = { 300, 290, 300, 310 };
		graphics.fillPolygon(x2, y2, 4);
	}

	private void pedals() {
		graphics.setColor(Color.black);
		graphics.fillOval(575, 440, 40, 40);
		int[] x1 = {620, 630, 570, 560};
		int[] y1 = {490, 490, 430, 430};
		graphics.fillPolygon(x1, y1, 4);
		int[] x2 = { 615, 635, 635, 615 };
		int[] y2 = { 493, 493, 488, 488 };
		graphics.fillPolygon(x2, y2, 4);
		int[] x3 = { 575, 555, 555, 575 };
		int[] y3 = { 433, 433, 428, 428 };
		graphics.fillPolygon(x3, y3, 4);
	}
	
	public void setGraphics(Graphics graphics) {
		this.graphics = graphics;
	}
}
