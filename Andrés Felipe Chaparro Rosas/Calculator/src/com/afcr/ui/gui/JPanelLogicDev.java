package com.afcr.ui.gui;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class JPanelLogicDev extends JPanel {

	private static final long serialVersionUID = 1L;

	public JPanelLogicDev() {
		super();
		init();
	}

	private void init() {
		this.setLayout(new GridLayout(6,2,5,5));
		this.setPreferredSize(new Dimension(75,1));
		this.setBackground(MyColor.WINDOWS_SEVEN_APPS);
		this.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 0));
		this.add(new MyJButton().disableMyButton().setColorMyButton(MyColor.WINDOWS_SEVEN_APPS));
		this.add(new MyJButton("Mod").setMyFont(new Font("Consolas", Font.PLAIN, 12)));
		this.add(new MyJButton("(").setMyFont(new Font("Consolas", Font.PLAIN, 12)));
		this.add(new MyJButton(")").setMyFont(new Font("Consolas", Font.PLAIN, 12)));
		this.add(new MyJButton("RoL").setMyFont(new Font("Consolas", Font.PLAIN, 12)));
		this.add(new MyJButton("RoR").setMyFont(new Font("Consolas", Font.PLAIN, 12)));
		this.add(new MyJButton("Or").setMyFont(new Font("Consolas", Font.PLAIN, 12)));
		this.add(new MyJButton("Xor").setMyFont(new Font("Consolas", Font.PLAIN, 12)));
		this.add(new MyJButton("Lsh").setMyFont(new Font("Consolas", Font.PLAIN, 12)));
		this.add(new MyJButton("Rsh").setMyFont(new Font("Consolas", Font.PLAIN, 12)));
		this.add(new MyJButton("Not").setMyFont(new Font("Consolas", Font.PLAIN, 12)));
		this.add(new MyJButton("And").setMyFont(new Font("Consolas", Font.PLAIN, 12)));
	}
}
