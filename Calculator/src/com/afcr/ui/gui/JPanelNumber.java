package com.afcr.ui.gui;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class JPanelNumber extends JPanel{
	
	private static final long serialVersionUID = 1L;

	public JPanelNumber() {
		super();
		init();
	}

	private void init() {
		this.setLayout(new GridLayout(3,3,5,5));
		this.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 0));
		this.setBackground(MyColor.WINDOWS_SEVEN_APPS);
		this.add(new MyJButton("7").setMyFont(new Font("Consolas", Font.PLAIN, 16)));
		this.add(new MyJButton("8").setMyFont(new Font("Consolas", Font.PLAIN, 16)));
		this.add(new MyJButton("9").setMyFont(new Font("Consolas", Font.PLAIN, 16)));
		this.add(new MyJButton("4").setMyFont(new Font("Consolas", Font.PLAIN, 16)));
		this.add(new MyJButton("5").setMyFont(new Font("Consolas", Font.PLAIN, 16)));
		this.add(new MyJButton("6").setMyFont(new Font("Consolas", Font.PLAIN, 16)));
		this.add(new MyJButton("1").setMyFont(new Font("Consolas", Font.PLAIN, 16)));
		this.add(new MyJButton("2").setMyFont(new Font("Consolas", Font.PLAIN, 16)));
		this.add(new MyJButton("3").setMyFont(new Font("Consolas", Font.PLAIN, 16)));
	}
}
