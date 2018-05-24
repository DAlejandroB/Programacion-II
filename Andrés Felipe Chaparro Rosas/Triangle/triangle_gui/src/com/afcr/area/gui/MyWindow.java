package com.afcr.area.gui;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import com.afcr.area.controller.TriangleListener;
import com.afcr.area.gui.constants.ConstantsGUI_ES;
import com.afcr.area.gui.mainspace.MainPanel;

public class MyWindow extends JFrame {
	private MyJMenuBar menuBar;
	private MainPanel mainPanel;

	public MyWindow() {
		this.menuBar = new MyJMenuBar();
		this.mainPanel = new MainPanel();
		init();
	}

	private void init() {
		this.setTitle(ConstantsGUI_ES.APPNAME);
		this.setSize(640, 480);
		this.setIconImage(new ImageIcon(this.getClass().getResource("/res/images/app_icon.png")).getImage());
		this.setJMenuBar(this.menuBar);
		this.add(this.mainPanel);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		TriangleListener.getInstance().setWindow(this);
	}

	public MainPanel getMainPanel() {
		return this.mainPanel;
	}
}
