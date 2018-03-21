package com.afcr.ui.gui;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class JPanelEndButton  extends JPanel {
	
	private static final long serialVersionUID = 1L;
	public JPanelEndButton() {
		super();
		init();
	}
	
	private void init() {
		this.setLayout(new BorderLayout());
		//this.setPreferredSize(new Dimension(38,1));
		this.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 0));
		this.setBackground(MyColor.WINDOWS_SEVEN_APPS);
		JPanel panel = new JPanel(new GridLayout(1,1));
		panel.add(new MyJButton("0").setMyFont(new Font("Consolas", Font.PLAIN, 16)));
		panel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));
		this.add(panel, BorderLayout.CENTER);
		this.add(new MyJButton(".").setMyFont(new Font("Consolas", Font.PLAIN, 12)), BorderLayout.EAST);
	}
}
