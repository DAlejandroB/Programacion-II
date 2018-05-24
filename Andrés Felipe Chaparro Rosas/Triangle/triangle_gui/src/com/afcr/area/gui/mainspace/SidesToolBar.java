package com.afcr.area.gui.mainspace;

import com.afcr.area.controller.TriangleListener;
import com.afcr.area.gui.constants.Commands;

import javax.swing.JLabel;
import javax.swing.JToolBar;

import com.afcr.area.gui.containers.HintJTextField;
import com.afcr.area.logic.Triangle;
import com.afcr.geometry.utilities.Utilities;

import java.awt.Dimension;

import javax.swing.JButton;

public class SidesToolBar extends JToolBar {
	private JLabel resultLabel;
	private JButton calculateButton;
	private HintJTextField sideAField;
	private HintJTextField sideBField;
	private HintJTextField sideCField;

	public SidesToolBar(String[] names) {
		super();
		this.sideAField = new HintJTextField(names[0]);
		this.sideBField = new HintJTextField(names[1]);
		this.sideCField = new HintJTextField(names[2]);
		this.calculateButton = Utilities.createButton(Commands.CALCULATE_AREA, new Dimension(15,15));
		this.resultLabel = new JLabel("" + 0, JLabel.CENTER);
		init();
	}

	private void init() {
		this.calculateButton.addActionListener(TriangleListener.getInstance());
		this.calculateButton.setActionCommand(Commands.CALCULATE_AREA.toString());
		this.calculateButton.setToolTipText(Commands.CALCULATE_AREA.getToolTipText());
		this.add(sideAField);
		this.add(sideBField);
		this.add(sideCField);
		this.add(calculateButton);
		this.add(resultLabel);
	}

	public void updateResult() {
		resultLabel.setText(Triangle.triangleArea(getSides()[0], getSides()[1], getSides()[2]) + "");
	}

	private double parseDouble(String s) {
		try {
			return Double.parseDouble(s);
		} catch (NumberFormatException e) {
			return 100;
		}
	}

	public void updateSides(String[] data) {
		sideAField.setText(data[0]);
		sideBField.setText(data[1]);
		sideCField.setText(data[2]);
	}

	public double[] getSides() {
		return new double[] { parseDouble(sideAField.getText()), parseDouble(sideBField.getText()),
				parseDouble(sideCField.getText()) };
	}
}
