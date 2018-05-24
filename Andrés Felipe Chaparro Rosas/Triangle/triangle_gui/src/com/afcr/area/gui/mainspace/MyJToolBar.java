package com.afcr.area.gui.mainspace;

import javax.swing.JButton;
import javax.swing.JToolBar;

import com.afcr.area.controller.TriangleListener;

public class MyJToolBar extends JToolBar{
	public MyJToolBar() {
		super();
		init();
	}
	
	private void init() {
		JButton button = new JButton("X");
		button.setActionCommand("X");
		button.addActionListener(TriangleListener.getInstance());
		add(button);
		JButton button2 = new JButton("Y");
		button.setActionCommand("Y");
		button2.addActionListener(TriangleListener.getInstance());
		add(button2);
	}
}
