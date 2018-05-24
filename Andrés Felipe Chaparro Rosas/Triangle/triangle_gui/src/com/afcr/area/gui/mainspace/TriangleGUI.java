package com.afcr.area.gui.mainspace;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

import com.afcr.area.logic.Triangle;

public class TriangleGUI extends Triangle {

	private Graphics2D g;
	protected int x, y;
	protected double thetaAngle, scala;
	protected Point pointA, pointB, pointC, olderPointA, olderPointB, olderPointC;
	protected Color color;
	protected boolean isPointVisible;
	protected Point rotationPoint;

	public TriangleGUI(int x, int y, double sideA, double sideB, double sideC, double angle, double scala,
			Color color) {
		super(sideA, sideB, sideC);
		this.x = x;
		this.y = y;
		this.thetaAngle = angle;
		this.scala = scala;
		this.color = color;
		this.rotationPoint = new Point(-10, -10);
		this.isPointVisible = true;
		this.init();
	}

	private void init() {
		this.pointA = new Point(x, y);
		this.calculateTriangle();
	}

	public void setGraphics2d(Graphics2D graphics2d) {
		this.g = graphics2d;
	}

	public void buildTriangle() {
		this.g.setColor(color);
		this.g.fillPolygon(new int[] { pointA.x, pointB.x, pointC.x }, new int[] { pointA.y, pointB.y, pointC.y }, 3);
	}

	public void buildTrianglePoints() {
		this.buildPoint(pointA);
		this.buildPoint(pointB);
		this.buildPoint(pointC);
	}

	public void buildPoint(Point point, int radio, Color color) {
		this.g.setColor(color);
		this.g.fillOval(point.x - radio, point.y - radio, 2 * radio, 2 * radio);
	}

	public void buildPoint(Point point) {
		this.buildPoint(point, 5, Color.red);
	}

	protected void updateMove(Point currentPoint) {
		this.pointA = new Point((pointA.x + currentPoint.x) - olderPointA.x,
				(pointA.y + currentPoint.y) - olderPointA.y);
		this.olderPointA = currentPoint;
		this.calculateTriangle();
	}

	protected void calculateTriangle() {
		double betaAngle = Math.acos((Math.pow(this.sideA, 2) + Math.pow(this.sideB, 2) - Math.pow(this.sideC, 2))
				/ (2 * this.sideA * this.sideB));
		this.pointB = new Point(
				(int) (this.pointA.x + (this.sideA * Math.cos(Math.toRadians(this.thetaAngle))) * this.scala),
				(int) (this.pointA.y + (this.sideA * Math.sin(Math.toRadians(this.thetaAngle))) * this.scala));
		this.pointC = new Point(
				(int) (this.pointA.x
						+ (this.sideB * Math.cos(betaAngle + Math.toRadians(this.thetaAngle))) * this.scala),
				(int) (this.pointA.y
						+ (this.sideB * Math.sin(betaAngle + Math.toRadians(this.thetaAngle))) * this.scala));
	}

	protected void updateStrecthA(Point currentPoint) {
		pointA = new Point((this.pointA.x + currentPoint.x) - this.olderPointA.x,
				(this.pointA.y + currentPoint.y) - this.olderPointA.y);
		this.olderPointA = currentPoint;
		this.updateSides();
	}

	protected void updateStrecthB(Point currentPoint) {
		this.pointB = new Point((this.pointB.x + currentPoint.x) - this.olderPointB.x,
				(this.pointB.y + currentPoint.y) - this.olderPointB.y);
		this.olderPointB = currentPoint;
		this.updateSides();
	}

	protected void updateStrecthC(Point currentPoint) {
		this.pointC = new Point((this.pointC.x + currentPoint.x) - this.olderPointC.x,
				(this.pointC.y + currentPoint.y) - this.olderPointC.y);
		this.olderPointC = currentPoint;
		this.updateSides();
	}

	protected void updateSides() {
		this.sideA = Math.hypot(this.pointA.x - this.pointB.x, this.pointA.y - this.pointB.y);
		this.sideB = Math.hypot(this.pointA.x - this.pointC.x, this.pointA.y - this.pointC.y);
		this.sideC = Math.hypot(this.pointB.x - this.pointC.x, this.pointB.y - this.pointC.y);
		this.updateAngle();
	}

	private void updateAngle() {
		this.thetaAngle = Math.toDegrees(Math.acos((Math.pow(this.pointA.x - this.pointB.x, 2) + Math.pow(this.sideA, 2)
				- Math.pow(this.pointA.y - this.pointB.y, 2))
				/ (2 * this.sideA * Math.abs(this.pointA.x - this.pointB.x))));
		if (this.pointB.y - this.pointA.y < 0)
			this.thetaAngle = this.thetaAngle * -1;
		if (this.pointB.x - this.pointA.x < 0)
			this.thetaAngle = (180 - this.thetaAngle);
	}
}
