package com.afcr.area.controller;

import com.afcr.area.gui.MyWindow;
import com.afcr.area.gui.constants.Commands;
import com.afcr.area.gui.constants.ConstantsGUI_ES;

import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class TriangleListener
		implements ActionListener, ChangeListener, MouseListener, MouseMotionListener, MouseWheelListener {

	private static TriangleListener triangleListener = null;
	private boolean dragging = false;
	private MyWindow window;

	private TriangleListener() {
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (Commands.valueOf(e.getActionCommand())) {
		case CALCULATE_AREA:
			this.window.getMainPanel().getSidesToolBar().updateResult();
			break;
		case CLOSE:
			System.exit(0);
			break;
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getButton() == 3)
			setMessageToStatusLabel(ConstantsGUI_ES.ROTATE);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if (e.getButton() == 3) {
			paintRotationPoint(e);
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if (e.getButton() == 3)
		window.getMainPanel().getWorkAreaPanel().repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
		setMessageToStatusLabel("");
		window.getMainPanel().getMyStatusBar().setMessageToMoveLabel("");
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		showPosition(e);
		if (window.getMainPanel().getWorkAreaPanel().isInRotationPoint(e.getPoint())) {
			setMessageToStatusLabel(ConstantsGUI_ES.ROTATING);
			window.getMainPanel().getWorkAreaPanel().updateAngle(e.getPoint());
		}else if (window.getMainPanel().getWorkAreaPanel().isInTrianglePoints(e.getPoint())) {
			String pointName = window.getMainPanel().getWorkAreaPanel().getPointName(e.getPoint());
			setMessageToStatusLabel(ConstantsGUI_ES.STRETCHING + pointName);
			switch (pointName) {
			case ConstantsGUI_ES.POINT_A:
				if (!dragging) {
					window.getMainPanel().getWorkAreaPanel().setOlderPointA(e.getPoint());
					dragging = true;
				} else {
					window.getMainPanel().getWorkAreaPanel().stretchPointA(e.getPoint());
				}
				break;
			case ConstantsGUI_ES.POINT_B:
				if (!dragging) {
					window.getMainPanel().getWorkAreaPanel().setOlderPointB(e.getPoint());
					dragging = true;
				} else {
					window.getMainPanel().getWorkAreaPanel().stretchPointB(e.getPoint());
				}
				break;
			case ConstantsGUI_ES.POINT_C:
				if (!dragging) {
					window.getMainPanel().getWorkAreaPanel().setOlderPointC(e.getPoint());
					dragging = true;
				} else {
					window.getMainPanel().getWorkAreaPanel().stretchPointC(e.getPoint());
				}
				break;

			}
			window.getMainPanel().getSidesToolBar().updateSides(window.getMainPanel().getWorkAreaPanel().getSides());
			window.getMainPanel().getWorkAreaPanel().repaint();
		} else if (window.getMainPanel().getWorkAreaPanel().isInTriangle(e.getPoint())) {
			moveTriangle(e);
		}

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		showPosition(e);
		setMessageToStatusLabel("");
		if (window.getMainPanel().getWorkAreaPanel().isInTrianglePoints(e.getPoint())) {
			window.getMainPanel().getWorkAreaPanel().setCursor(new Cursor(Cursor.HAND_CURSOR));
			setMessageToStatusLabel(
					ConstantsGUI_ES.STRETCH + window.getMainPanel().getWorkAreaPanel().getPointName(e.getPoint()));
		} else if (window.getMainPanel().getWorkAreaPanel().isInTriangle(e.getPoint())) {
			window.getMainPanel().getWorkAreaPanel().setCursor(new Cursor(Cursor.MOVE_CURSOR));
			setMessageToStatusLabel(ConstantsGUI_ES.MOVE);
		} else {
			window.getMainPanel().getWorkAreaPanel().setCursor(new Cursor(1));
		}
		dragging = false;
	}

	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		window.getMainPanel().getMyStatusBar().setMessageToStatusLabel("Zoom");
		if (e.getWheelRotation() < 0) {
			window.getMainPanel().getMyStatusBar().getZoomSlider()
					.setValue(window.getMainPanel().getMyStatusBar().getZoomSlider().getValue() + 2);
			window.getMainPanel().getWorkAreaPanel().updateScala(0.02);
		} else {
			window.getMainPanel().getMyStatusBar().getZoomSlider()
					.setValue(window.getMainPanel().getMyStatusBar().getZoomSlider().getValue() - 2);
			window.getMainPanel().getWorkAreaPanel().updateScala(-0.02);
		}
		window.getMainPanel().getSidesToolBar().updateSides(window.getMainPanel().getWorkAreaPanel().getSides());
		window.getMainPanel().getWorkAreaPanel().repaint();
	}

	public static TriangleListener getInstance() {
		if (triangleListener == null) {
			triangleListener = new TriangleListener();
		}
		return triangleListener;
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		window.getMainPanel().getMyStatusBar().setValueToPorcentLabel(((JSlider) e.getSource()).getValue());

	}

	public void setWindow(MyWindow window) {
		this.window = window;
	}

	private void paintRotationPoint(MouseEvent e) {
			window.getMainPanel().getWorkAreaPanel().setRotationPoint(e.getPoint());
			window.getMainPanel().getWorkAreaPanel().repaint();
	}

	private void moveTriangle(MouseEvent e) {
		window.getMainPanel().getWorkAreaPanel().setCursor(new Cursor(13));
		setMessageToStatusLabel(ConstantsGUI_ES.MOVING);
		if (!dragging) {
			window.getMainPanel().getWorkAreaPanel().setOlderPointA(e.getPoint());
			dragging = true;
		} else {
			window.getMainPanel().getWorkAreaPanel().updatePoints(e.getPoint());
			window.getMainPanel().getWorkAreaPanel().repaint();
		}
	}

	private void setMessageToStatusLabel(String message) {
		window.getMainPanel().getMyStatusBar().setMessageToStatusLabel(message);
	}

	private void showPosition(MouseEvent e) {
		window.getMainPanel().getMyStatusBar()
				.setMessageToMoveLabel(e.getX() + ", " + e.getY() + ConstantsGUI_ES.PIXELS);
	}
}
