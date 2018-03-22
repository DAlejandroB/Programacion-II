package com.afcr.graphics.gui;
import java.util.Random;
import java.lang.Math;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Figure {

	private Graphics graphics;
	private int size;

	public Figure(int size) {
		this.size = size;
	}

	public void show() {
		main();
	}

	private void main() {
		graphics.setColor(Color.BLACK);
		graphics.drawOval(0, 0, 300, 300);
		graphics.drawRect(0, 0, 300, 300);
		Random x = new Random();
		Random y = new Random();
		double c = 0;
		double r = 0;
		double pi = 0;
		double counter = 1000000;
			for(int i = 0; i < counter; i ++) {
				double x1 = x.nextInt(300);
				double y1 = y.nextInt(300);
				double d = this.calcDist(x1, y1, 150, 150);
				if(d > 150) {
					graphics.setColor(Color.GRAY);
					graphics.drawRect((int)x1,(int)y1, 1, 1);
					r ++;
				}
				else {
					graphics.setColor(Color.GREEN);
					graphics.drawRect((int)x1,(int)y1, 1, 1);
					c++;
				}
				pi = c/r;
				System.out.println(pi);
		}
		pi = c/r;
		graphics.setColor(new Color(255,23,64));
		graphics.drawString("c=" + c, 300, 10);
		graphics.drawString("r=" + r, 300, 20);
		System.out.println(pi);
		graphics.drawString("pi=" + pi, 300,30);
	}
	private double calcDist (double x1,double y1,double x2, double y2) {
		double dX = Math.abs(x2-x1);
		double dY = Math.abs(y2-y1);
		dX *= dX;
		dY *= dY;
		return Math.sqrt(dX+dY);
		}
	public void setGraphics(Graphics graphics) {
		this.graphics = graphics;
	}
}
