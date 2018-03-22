package com.afcr.area.ui.console;

/**
 * Clase FormResult
 * 
 * @author Andrés Felipe Chaparro Rosas
 * @since 1.8
 *
 */
public class FormOutputTriangle {
	
	/**
	 * Devuelve el resultado concatenado con los lados del triangulo
	 *  
	 * @param sideA
	 * 			lado A
	 * @param sideB
	 * 			lado B
	 * @param sideC
	 * 			lado C
	 * @param area
	 * 			area
	 */
	public void showResult(double sideA, double sideB, double sideC, double area) {
		System.out.println(
				"\nEl area del triangulo de lados " + 
						sideA + ", " + sideB + ", " + sideC + " es igual a " + area + ".\n");
	}

	/**
	 * Muestra una advertencia cuando los lados no son de un triangulo
	 */
	public void showNotResult(double sideA, double sideB, double sideC) {
		System.out.println(
				"\nLos datos " + sideA + ", " + sideB + ", " + sideC + 
				" no corresponden a un triangulo.\n");
	}

	/**
	 * Muestra el texto de ayuda de la aplicacion
	 */
	public void showHelp() {
		System.out.println(ConstantsConsole.HELP);
	}
	
	/**
	 * Muestra el texto de "acerca de" de la aplicacion
	 */
	public void showAbout() {
		System.out.println(ConstantsConsole.ABOUT);
	}

	public void showNotTriangle() {
		System.out.println("\nNo se han introducido los valores del triangulo\n"
				+ "Presione la tecla [i] para introducirlos y vuelva a intentarlo\n");
		
	}
}
