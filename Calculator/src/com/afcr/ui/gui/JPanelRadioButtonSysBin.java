package com.afcr.ui.gui;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class JPanelRadioButtonSysBin extends JPanel {
	private static final long serialVersionUID = 1L;

	public JPanelRadioButtonSysBin() {
		super();
		init();
	}

	private void init() {
		ButtonGroup buttonGroup = new ButtonGroup();
		JRadioButton hexaRadioButton = new JRadioButton("Qword",true);
		JRadioButton decRadioButton = new JRadioButton("Dword");
		JRadioButton octRadioButton = new JRadioButton("Word");
		JRadioButton binaRadioButton = new JRadioButton("Byte");
		hexaRadioButton.setBackground(MyColor.WINDOWS_SEVEN_APPS);
		decRadioButton.setBackground(MyColor.WINDOWS_SEVEN_APPS);
		octRadioButton.setBackground(MyColor.WINDOWS_SEVEN_APPS);
		binaRadioButton.setBackground(MyColor.WINDOWS_SEVEN_APPS);
		buttonGroup.add(hexaRadioButton);
		buttonGroup.add(decRadioButton);
		buttonGroup.add(octRadioButton);
		buttonGroup.add(binaRadioButton);
		this.setLayout(new GridLayout(4,1));
		this.setBackground(MyColor.WINDOWS_SEVEN_APPS);
		this.setBorder(BorderFactory.createLineBorder(MyColor.WINDOWS_SEVEN_BORDER));
		this.add(hexaRadioButton);
		this.add(decRadioButton);
		this.add(octRadioButton);
		this.add(binaRadioButton);
	}
}
