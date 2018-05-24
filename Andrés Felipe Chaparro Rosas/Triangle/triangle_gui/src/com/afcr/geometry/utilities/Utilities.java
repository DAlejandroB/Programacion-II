package com.afcr.geometry.utilities;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import com.afcr.area.controller.TriangleListener;
import com.afcr.area.gui.constants.Commands;

public class Utilities {
	public static double calculateAreaPixelTriangle(Point pointA, Point pointB, Point pointC) {
		return (pointA.getX() - pointC.getX()) * (pointB.getY() -pointC.getY())- 
				(pointA.getY() -pointC.getY()) * (pointB.getX() - pointC.getX());
	}

	public static boolean isInTriangle(Point pointA, Point pointB, Point pointC, Point currentPoint) {
		if (calculateAreaPixelTriangle(pointA, pointB, pointC) >= 0)
			return calculateAreaPixelTriangle(pointA, pointB, currentPoint) >= 0
					&& calculateAreaPixelTriangle(pointB, pointC, currentPoint) >= 0
					&& calculateAreaPixelTriangle(pointC, pointA, currentPoint) >= 0;
		return calculateAreaPixelTriangle(pointA, pointB, currentPoint) <= 0
				&& calculateAreaPixelTriangle(pointB, pointC, currentPoint) <= 0
				&& calculateAreaPixelTriangle(pointC, pointA, currentPoint) <= 0;
	}

	public static boolean isInCircle(Point point, Point currentPoint, double radio) {
		return Math.hypot(point.x - currentPoint.x, point.y - currentPoint.y) <= radio;
	}
	
	public static Point calculateMovePoint(Point oldPoint, Point currentPoint) {
		return new Point(currentPoint.x-oldPoint.x, currentPoint.y-oldPoint.y);
	}
	
	public static JButton createButton(Commands commands, Dimension d){
		JButton button = new JButton();
		button.addActionListener(TriangleListener.getInstance());
		button.setActionCommand(commands.toString());
		button.setBounds(0, 0, d.width, d.height);
		button.setIcon(new ImageIcon(new ImageIcon(new Utilities().getMyClass().getResource(commands.getPathFile())).getImage().getScaledInstance(button.getWidth(), button.getHeight(), Image.SCALE_AREA_AVERAGING)));
		button.setToolTipText(commands.getToolTipText());
		return button;
	}
	
	private Class<? extends Utilities> getMyClass() {
		return getClass();
	}
}