package com.afcr.ui.gui;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

public class JMenuBarCalculator extends JMenuBar {

	private static final long serialVersionUID = 1L;

	public JMenuBarCalculator() {
		super();
		init();
	}

	private void init() {
		JMenu menuView = new JMenu("Ver");
		menuView.add(new JMenuItem("Estandar"));
		menuView.add(new JMenuItem("Cientifica"));
		menuView.add(new JMenuItem("Programador"));
		menuView.add(new JMenuItem("Estadistica"));
		menuView.add(new JSeparator());
		menuView.add(new JMenuItem("Historial"));
		menuView.add(new JMenuItem("Numero de digitos en grupo"));
		menuView.add(new JSeparator());
		menuView.add(new JMenuItem("Basicas"));
		menuView.add(new JMenuItem("Conversion de unidades"));
		menuView.add(new JMenuItem("Calculo de fecha"));
		menuView.add(new JMenuItem("Hojas de calculo"));

		JMenu menuEdition = new JMenu("Edicion");

		JMenu menuHelp = new JMenu("Ayuda");

		this.add(menuView);
		this.add(menuEdition);
		this.add(menuHelp);

	}
}
