package com.afcr.ui.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class MyJButton extends JButton {
	private static final long serialVersionUID = 1L;
	
	public MyJButton() {
		super();
		sizeDefault();
	}
	
	public MyJButton(String string) {
		super(string);
		setMargin(new Insets(0, 0, 0, 0));
		sizeDefault();
	}
	
	public MyJButton setMyFont(Font font) {
		this.setFont(font);
		return this;
	}
	
	public MyJButton disableMyButton() {
		this.setEnabled(false);
		return this;
	}
	
	public MyJButton setMyBorder(int top, int left, int bottom, int right) {
		this.setBorder(BorderFactory.createEmptyBorder(top, left, bottom, right));
		return this;
	}
	
	public MyJButton setColorMyButton(Color bg) {
		this.setBackground(bg);
		return this;
	}
	
	public MyJButton setMySize(int x, int y) {
		return setMySize(x, y, MyColor.WINDOWS_SEVEN_FONT);
	}
	
	public MyJButton setMySize(int x, int y, Color color) {
		this.setPreferredSize(new Dimension(x,y));
		this.setForeground(color);
		return this;
	}
	
	private void sizeDefault() {
		this.setPreferredSize(new Dimension(38,30));
	}
}
