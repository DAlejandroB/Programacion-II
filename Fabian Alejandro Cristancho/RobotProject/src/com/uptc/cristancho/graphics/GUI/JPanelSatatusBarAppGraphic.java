package com.uptc.cristancho.graphics.GUI;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Clase JPanelSatatusBarAppGraphic que muestra informacion en la barra de
 * estado Fecha: 16/03/2018
 * 
 * @author Fabian Alejandro Cristancho Rincon
 *
 */

public class JPanelSatatusBarAppGraphic extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Constructor que inicializa metodos necesarios
	 */

	public JPanelSatatusBarAppGraphic() {
		super();
		init();
	}

	/**
	 * Metodo que crea un borde y asigna un texto a la barra de estado
	 */

	private void init() {
		this.setBorder(BorderFactory.createEtchedBorder());
		this.add(new JLabel("Fabian Alejandro Cristancho Rincon          Cod. 201710254"));
	}

}
