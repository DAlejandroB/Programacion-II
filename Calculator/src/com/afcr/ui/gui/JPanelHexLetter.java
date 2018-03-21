package com.afcr.ui.gui;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class JPanelHexLetter extends JPanel {
	
	private static final long serialVersionUID = 1L;

	public JPanelHexLetter() {
		super();
		init();
	}
	
	private void init() {
		this.setLayout(new GridLayout(6,1,0,5));
		this.setPreferredSize(new Dimension(38,1));
		this.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 0));
		this.setBackground(MyColor.WINDOWS_SEVEN_APPS);
		this.add(new MyJButton("A").setMyFont(new Font("Consolas", Font.PLAIN, 16)));
		this.add(new MyJButton("B").setMyFont(new Font("Consolas", Font.PLAIN, 16)));
		this.add(new MyJButton("C").setMyFont(new Font("Consolas", Font.PLAIN, 16)));
		this.add(new MyJButton("D").setMyFont(new Font("Consolas", Font.PLAIN, 16)));
		this.add(new MyJButton("E").setMyFont(new Font("Consolas", Font.PLAIN, 16)));
		this.add(new MyJButton("F").setMyFont(new Font("Consolas", Font.PLAIN, 16)));
	}
}
