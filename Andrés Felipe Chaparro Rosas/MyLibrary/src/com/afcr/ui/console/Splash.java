package com.afcr.ui.console;

/**
 * Clase Splash
 * 
 * @author Andrés Felipe Chaparro Rosas
 *
 */
public class Splash {
	private  String[] constants;
	
	/**
	 * establece las constantes a mostrar
	 * @param constants
	 */
	public Splash(String[] constants) {
		this.constants=constants;
	}
	/**
	 * Muestra la pantalla de presentacion
	 * 
	 * @param width
	 *            cantidad
	 * @param border
	 *            tipo
	 */
	public void show() {
		int width = 30;
		char border = '*';
		MyString myString = new MyString();
		System.out.println(myString.characterLine(width, border));
		for (int i = 0; i < constants.length; i++) {
			System.out.println(
					myString.wrapText(
							myString.centerText(constants[i], width), width, border));
		}
		System.out.println(myString.characterLine(width, border));
	}
}
