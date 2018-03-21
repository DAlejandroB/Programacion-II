package com.afcr.ui.gui;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class JPanelRadioButtonSysNum extends JPanel{
	private static final long serialVersionUID = 1L;

	public JPanelRadioButtonSysNum() {
		super();
		init();
	}

	private void init() {
		ButtonGroup buttonGroup = new ButtonGroup();
		JRadioButton qwordRadioButton = new JRadioButton("Hexa");
		JRadioButton dwordRadioButton = new JRadioButton("Dec",true);
		JRadioButton wordRadioButton = new JRadioButton("Oct");
		JRadioButton byteRadioButton = new JRadioButton("Bin");
		qwordRadioButton.setBackground(MyColor.WINDOWS_SEVEN_APPS);
		dwordRadioButton.setBackground(MyColor.WINDOWS_SEVEN_APPS);
		wordRadioButton.setBackground(MyColor.WINDOWS_SEVEN_APPS);
		byteRadioButton.setBackground(MyColor.WINDOWS_SEVEN_APPS);
		buttonGroup.add(qwordRadioButton);
		buttonGroup.add(dwordRadioButton);
		buttonGroup.add(wordRadioButton);
		buttonGroup.add(byteRadioButton);
		this.setLayout(new GridLayout(4,1));
		this.setBackground(MyColor.WINDOWS_SEVEN_APPS);
		this.setBorder(BorderFactory.createLineBorder(MyColor.WINDOWS_SEVEN_BORDER));
		this.add(qwordRadioButton);
		this.add(dwordRadioButton);
		this.add(wordRadioButton);
		this.add(byteRadioButton);
	}

}
