package com.afcr.ui.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class JPanelDevCalculator extends JPanel {
	private static final long serialVersionUID = 1L;
	private JPanelResultLabel jPanelResultLabel;
	private JPanelNumBin jPanelNumBin;
	private JPanelRadioButtonSysNum jPanelRadioButtonSysNum;
	private JPanelRadioButtonSysBin jPanelRadioButtonSysBin;
	private JPanelLogicDev jPanelLogicDev;
	private JPanelHexLetter jPanelHexLetter;
	private JPanelMemory jPanelMemory;
	private JPanelAnotherTool jPanelAnotherTool;
	private JPanelEndButton jPanelEndButton;
	private JPanelLogicMath jPanelLogicMath;
	private JPanelClear jPanelClear;
	private JPanelNumber jPanelNumber;
	
	public JPanelDevCalculator() {
		super();
		this.jPanelRadioButtonSysNum = new JPanelRadioButtonSysNum();
		this.jPanelRadioButtonSysBin = new JPanelRadioButtonSysBin();
		this.jPanelNumBin = new JPanelNumBin();
		this.jPanelResultLabel = new JPanelResultLabel();
		this.jPanelLogicDev = new JPanelLogicDev();
		this.jPanelHexLetter = new JPanelHexLetter();
		this.jPanelMemory = new JPanelMemory();
		this.jPanelAnotherTool = new JPanelAnotherTool();
		this.jPanelEndButton = new JPanelEndButton();
		this.jPanelLogicMath = new JPanelLogicMath();
		this.jPanelClear = new JPanelClear();
		this.jPanelNumber = new JPanelNumber();
		init();
	}
	
	private void init() {
		this.setLayout(new BorderLayout());
		this.setBackground(MyColor.WINDOWS_SEVEN_APPS);
		this.setBorder(BorderFactory.createEmptyBorder(12,12,12,12));
		
		JPanel panel = new JPanel(new GridLayout(2,1,0,5));
		panel.setBackground(MyColor.WINDOWS_SEVEN_APPS);
		panel.setPreferredSize(new Dimension(72,1));
		panel.add(jPanelRadioButtonSysNum);
		panel.add(jPanelRadioButtonSysBin);
		panel.setBackground(MyColor.WINDOWS_SEVEN_APPS);
		this.add(panel, BorderLayout.WEST);
		
		JPanel panelResults = new JPanel(new BorderLayout());
		panelResults.add(jPanelResultLabel, BorderLayout.NORTH);
		panelResults.add(jPanelNumBin, BorderLayout.SOUTH);
		this.add(panelResults, BorderLayout.NORTH);
		
		JPanel panelOperations = new JPanel(new BorderLayout());
		
		JPanel panelLeft = new JPanel(new BorderLayout());
		panelLeft.add(jPanelLogicDev, BorderLayout.WEST);
		panelLeft.add(jPanelHexLetter, BorderLayout.CENTER);
		panelOperations.add(panelLeft, BorderLayout.WEST);
		JPanel panelNumberlogic = new JPanel(new BorderLayout());
		panelNumberlogic.add(jPanelMemory,BorderLayout.NORTH);
		panelNumberlogic.add(jPanelAnotherTool, BorderLayout.EAST);
		JPanel panelNumber = new JPanel(new BorderLayout());
		JPanel centerpanel = new JPanel(new BorderLayout());
		centerpanel.add(jPanelNumber, BorderLayout.CENTER);
		centerpanel.add(jPanelEndButton, BorderLayout.SOUTH);
		panelNumber.add(centerpanel, BorderLayout.CENTER);
		panelNumber.add(jPanelLogicMath, BorderLayout.EAST);
		panelNumber.add(jPanelClear, BorderLayout.NORTH);
		panelNumberlogic.add(panelNumber);
		panelOperations.add(panelNumberlogic,BorderLayout.CENTER);
		this.add(panelOperations, BorderLayout.CENTER);
	}
}
