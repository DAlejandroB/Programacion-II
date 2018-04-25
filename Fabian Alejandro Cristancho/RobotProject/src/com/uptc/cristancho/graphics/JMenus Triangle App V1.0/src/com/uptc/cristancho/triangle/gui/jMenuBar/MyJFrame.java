package com.uptc.cristancho.triangle.gui.jMenuBar;

import javax.swing.JFrame;

/**
 * Clase MyJFrame, encargada de reunir los componentes y JPaneles de la
 * aplicación
 * 
 * @author Fabian Alejandro Cristancho Rincón Fecha: 19/04/2018
 *
 */

public class MyJFrame extends JFrame {

	private MyMenuOnPanel myJPanelFigure;
	MyJMenuBar myJMenuBar;

	/**
	 * Constructor de la clase
	 */

	public MyJFrame() {
		super(Constant.APPNAME);
		this.myJPanelFigure = new MyMenuOnPanel();
		this.myJMenuBar = new MyJMenuBar();
		init();
	}

	/**
	 * Encargado de iniciar el JFrame con sus respectivos paneles y componentes
	 */

	private void init() {
		setSize(Constant.DIMENSION_FRAME);
		add(myJPanelFigure);
		setJMenuBar(myJMenuBar);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}

}
