package com.afcr.intersection.ui.console;

/**
 * Clase FormResult
 * 
 * @author Andrés Felipe Chaparro Rosas
 * @since 1.8
 *
 */
public class FormResult {
	/**
	 * Devuelve el resultado concatenado con los puntos de la circunferencia
	 * 
	 * @param pointXA
	 *            punto XA
	 * @param pointYA
	 *            punto YA
	 * @param radioA
	 *            radio A
	 * @param pointXB
	 *            punto XB
	 * @param pointYB
	 *            punto YB
	 * @param radioB
	 *            radio B
	 * @param intersect
	 *            resultado
	 */
	public void showResult(double pointXA, double pointYA, double radioA, double pointXB, double pointYB, double radioB,
			boolean intersect) {
		System.out.println("El circulo A con radio "  + radioA +" y centro en ("+ pointXA + ", " + pointYA +") "
				+ (intersect ? "INTERSECA" : "NO INTERSECA")
				+ " con el circulo B con radio " + radioB + " y centro en (" + pointXB + ", " + pointYB+")");
	}

	/**
	 * Muestra una advertencia cuando el objeto no ha sido inicializado
	 */
	public void showNotResult() {
		System.out.println(
				"Los circulos no han sido definidos\nIngrese los datos con la tecla [i] " 
		+ "\nIntentelo de nuevo");
	}

	/**
	 * Muestra el texto de ayuda de la aplicacion
	 */
	public void showHelp() {
		System.out.println(Constants.HELP);
	}
}
