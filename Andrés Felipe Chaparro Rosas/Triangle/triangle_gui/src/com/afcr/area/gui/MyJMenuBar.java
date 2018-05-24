package com.afcr.area.gui;

import java.awt.Color;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyJMenuBar extends JMenuBar {
	private JMenu triangleMenu;
	private JMenu areaMenu;
	private JMenu optionMenu;
	private JMenu helpMenu;

	public MyJMenuBar() {
		this.triangleMenu = new JMenu("Triangulo");
		this.areaMenu = new JMenu("Area");
		this.optionMenu = new JMenu("Opciones");
		this.helpMenu = new JMenu("Ayuda");
		this.init();
	}

	private void init() {
		this.addTriangleMenuItems();
		this.addAreaMenuItems();
		this.addOptionMenuItems();
		this.addHelpMenuItems();
		this.setBackground(Color.WHITE);
		this.add(triangleMenu);
		this.add(areaMenu);
		this.add(optionMenu);
		this.add(helpMenu);
	}

	private void addTriangleMenuItems() {
		this.triangleMenu.setBackground(Color.WHITE);
		this.triangleMenu.add(new JMenuItem(""));
	}

	private void addAreaMenuItems() {
		this.areaMenu.setBackground(Color.WHITE);
		this.areaMenu.add(new JMenuItem(""));
	}

	private void addOptionMenuItems() {
		this.optionMenu.setBackground(Color.WHITE);
		this.optionMenu.add(new JMenuItem(""));
	}

	private void addHelpMenuItems() {
		this.helpMenu.setBackground(Color.WHITE);
		this.helpMenu.add(new JMenuItem("Ayuda"));
		this.helpMenu.add(new JMenuItem("Acerca de"));
	}
}
