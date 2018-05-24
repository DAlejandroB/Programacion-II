package com.afcr.area.gui.mainspace;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

import javax.swing.JPanel;

import com.afcr.area.controller.TriangleListener;
import com.afcr.area.gui.constants.ConstantsGUI_ES;
import com.afcr.geometry.utilities.Utilities;

public class WorkAreaPanel extends JPanel {
	private TriangleGUI triangleGUI;

	public WorkAreaPanel() {
		this(new TriangleGUI(100, 100, 100, 100,100, 0, 1, Color.black));
	}
	
	public WorkAreaPanel(TriangleGUI triangleGUI) {
		super();
		this.triangleGUI = triangleGUI;
		this.init();
	}

	private void init() {
		this.setBackground(Color.white);
		this.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
		this.addMouseListener(TriangleListener.getInstance());
		this.addMouseMotionListener(TriangleListener.getInstance());
		this.addMouseWheelListener(TriangleListener.getInstance());
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		this.triangleGUI.setGraphics2d((Graphics2D) g);
		this.triangleGUI.buildTriangle();
		this.triangleGUI.buildTrianglePoints();
		this.changeVisibilityPoint(triangleGUI.rotationPoint);
	}

	public void changeVisibilityPoint(Point point) {
		if (!this.triangleGUI.isPointVisible) {
			this.triangleGUI.buildPoint(point);
			this.triangleGUI.isPointVisible = true;
		} else {
			this.setRotationPoint(new Point(-10, -10));
			this.triangleGUI.isPointVisible = false;
		}
	}

	public boolean isInTriangle(Point currentPoint) {
		return Utilities.isInTriangle(this.triangleGUI.pointA, this.triangleGUI.pointB, this.triangleGUI.pointC, currentPoint);
	}

	public boolean isInRotationPoint(Point currentPoint) {
		return Utilities.isInCircle(this.triangleGUI.rotationPoint, currentPoint, 3);
	}

	public boolean isInTrianglePoints(Point currentPoint) {
		return Utilities.isInCircle(this.triangleGUI.pointA, currentPoint, 5)
				| Utilities.isInCircle(this.triangleGUI.pointB, currentPoint, 5)
				| Utilities.isInCircle(this.triangleGUI.pointC, currentPoint, 5);
	}

	public String getPointName(Point currentPoint) {
		if (Utilities.isInCircle(this.triangleGUI.pointA, currentPoint, 5)) {
			return ConstantsGUI_ES.POINT_A;
		}
		if (Utilities.isInCircle(this.triangleGUI.pointB, currentPoint, 5)) {
			return ConstantsGUI_ES.POINT_B;
		}
		return ConstantsGUI_ES.POINT_C;
	}

	public void setRotationPoint(Point rotationPoint) {
		this.triangleGUI.rotationPoint = rotationPoint;
	}

	public void updatePoints(Point currentPoint) {
		this.triangleGUI.updateMove(currentPoint);
	}

	public void setOlderPointA(Point currentPoint) {
		this.triangleGUI.olderPointA = currentPoint;
	}

	public void stretchPointA(Point currentPoint) {
		this.triangleGUI.updateStrecthA(currentPoint);
	}

	public void setOlderPointB(Point currentPoint) {
		this.triangleGUI.olderPointB = currentPoint;
	}

	public void stretchPointB(Point currentPoint) {
		this.triangleGUI.updateStrecthB(currentPoint);
	}

	public void setOlderPointC(Point currentPoint) {
		this.triangleGUI.olderPointC = currentPoint;
	}

	public void stretchPointC(Point currentPoint) {
		this.triangleGUI.updateStrecthC(currentPoint);
	}

	public void updateScala(double increase) {
		if(this.triangleGUI.scala>=0&&this.triangleGUI.scala<=2) {
		this.triangleGUI.scala+=increase;
		if(this.triangleGUI.scala<0)
			this.triangleGUI.scala=0;
		}
		if(this.triangleGUI.scala>2) {
			this.triangleGUI.scala=2;
		}
		this.triangleGUI.calculateTriangle();	
	}

	public void setScala(double scala) {
		this.triangleGUI.scala = scala;
		this.triangleGUI.calculateTriangle();
	}
	
	public void updateAngle(Point currentPoint) {
		this.triangleGUI.thetaAngle-=(this.triangleGUI.rotationPoint.y-currentPoint.y)*2;
		this.triangleGUI.calculateTriangle();	
	}
	
	public String[] getSides() {
		return new String[] { this.triangleGUI.getSideA() + "", this.triangleGUI.getSideB() + "",
				this.triangleGUI.getSideC() + "" };
	}
}
