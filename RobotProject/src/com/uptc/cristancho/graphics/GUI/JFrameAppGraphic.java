package com.uptc.cristancho.graphics.GUI;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 * Clase JFrameAppGraphic que extinede de la clase JFrame de Java Fecha:
 * 16/03/2018
 * 
 * @author Fabian Alejandro Cristancho Rincon
 *
 */

public class JFrameAppGraphic extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanelSatatusBarAppGraphic jPanelSatatusBarAppGraphic;
	private JPanelWorkArea jPanelWorkArea;

	/**
	 * Constructor que inicializa objetos
	 * 
	 * @param figure
	 *            Figura asignada al Frame
	 */

	public JFrameAppGraphic(Figure figure) {
		super(Constant.APP_NAME);
		this.jPanelSatatusBarAppGraphic = new JPanelSatatusBarAppGraphic();
		this.jPanelWorkArea = new JPanelWorkArea(figure);
		init();
	}

	/**
	 * Organiza los componentes que van dentro del Frame
	 */
	private void init() {
		this.setLayout(new BorderLayout());
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		this.add(jPanelSatatusBarAppGraphic, BorderLayout.SOUTH);
		this.add(jPanelWorkArea, BorderLayout.CENTER);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
