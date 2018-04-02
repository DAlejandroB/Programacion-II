package com.uptc.cristancho.graphics.test;

import java.awt.Point;
import com.uptc.cristancho.graphics.GUI.Figure;
import com.uptc.cristancho.graphics.GUI.JFrameAppGraphic;

/**
 * Clase TestGraphic que ejecuta la figura del robot Fecha: 16/03/2018
 * 
 * @author Fabian Alejandro Cristancho Rincon
 *
 */

public class TestGraphic {

	/**
	 * Metodo principal que ejecuta la figura de la aplicacion
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		Figure figure = new Figure(110, new Point(583, 150), 0);
		new JFrameAppGraphic(figure);
	}

}
