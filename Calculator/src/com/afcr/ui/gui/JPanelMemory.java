package com.afcr.ui.gui;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class JPanelMemory extends JPanel {
	private static final long serialVersionUID = 1L;
	
	public JPanelMemory() {
		super();
		init();
	}
	
	private void init() {
		this.setLayout(new GridLayout(1,4,5,0));
		this.setPreferredSize(new Dimension(1,25));
		this.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 0));
		this.setBackground(MyColor.WINDOWS_SEVEN_APPS);
		this.add(new MyJButton("MC").setMyFont(new Font("Consolas", Font.PLAIN, 12)));
		this.add(new MyJButton("MR").setMyFont(new Font("Consolas", Font.PLAIN, 12)));
		this.add(new MyJButton("MS").setMyFont(new Font("Consolas", Font.PLAIN, 12)));
		this.add(new MyJButton("M+").setMyFont(new Font("Consolas", Font.PLAIN, 12)));
		this.add(new MyJButton("M-").setMyFont(new Font("Consolas", Font.PLAIN, 12)));
	}
}
