package com.afcr.ui.gui;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class JPanelAnotherTool extends JPanel {
	
	private static final long serialVersionUID = 1L;

	public JPanelAnotherTool() {
		super();
		init();
	}
	
	private void init() {
		this.setLayout(new BorderLayout());
		//this.setPreferredSize(new Dimension(38,1));
		this.setBorder(BorderFactory.createEmptyBorder(5, 5, 0, 0));
		this.setBackground(MyColor.WINDOWS_SEVEN_APPS);
		JPanel jPanel = new JPanel(new GridLayout(3,1,0,5));
		jPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 5, 0));
		jPanel.add(new MyJButton("sq").setMyFont(new Font("Consolas", Font.PLAIN, 12)));
		jPanel.add(new MyJButton("%").setMyFont(new Font("Consolas", Font.PLAIN, 12)));
		jPanel.add(new MyJButton("1/x").setMyFont(new Font("Consolas", Font.PLAIN, 12)));
		this.add(jPanel, BorderLayout.NORTH);
		this.add(new MyJButton("=").setMyFont(new Font("Consolas", Font.PLAIN, 25)).setMySize(38, 81), BorderLayout.CENTER);
	}

}
