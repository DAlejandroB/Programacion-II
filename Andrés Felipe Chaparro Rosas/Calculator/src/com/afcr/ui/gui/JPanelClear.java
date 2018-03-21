package com.afcr.ui.gui;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class JPanelClear extends JPanel{
	
	private static final long serialVersionUID = 1L;
	
	public JPanelClear() {
		super();
		init();
	}
	
	private void init() {
		this.setLayout(new GridLayout(1,4,5,0));
		this.setBorder(BorderFactory.createEmptyBorder(5, 5, 0, 0));
		this.setBackground(MyColor.WINDOWS_SEVEN_APPS);
		this.add(new MyJButton("<-").setMyFont(new Font("Consolas", Font.PLAIN, 12)));
		this.add(new MyJButton("CE").setMyFont(new Font("Consolas", Font.PLAIN, 12)));
		this.add(new MyJButton("C").setMyFont(new Font("Consolas", Font.PLAIN, 12)));
		this.add(new MyJButton("+-").setMyFont(new Font("Consolas", Font.PLAIN, 12)));
	}
}
