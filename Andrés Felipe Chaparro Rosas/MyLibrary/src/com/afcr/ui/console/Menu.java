package com.afcr.ui.console;

import com.afcr.ui.console.MyInput;
import com.afcr.ui.console.Option;

public class Menu {
	private Option[] options;

	/**
	 * Constructor que inicializa las opciones options
	 * 
	 * @param options
	 */
	public Menu(Option[] options) {
		this.options = options;
	}

	/**
	 * Retorna cada identificador separados por una coma
	 * 
	 * @return opciones ordenadas en un string
	 */
	private String identifiersOption() {
		String identifiers = "";
		for (int i = 0; i < options.length; i++) {
			identifiers += options[i].getIdentifer() + ",";
		}
		return identifiers.substring(0, (options.length * 2) - 1);
	}

	/**
	 * Busca por medio de la opcion el comando a ejecutar
	 * 
	 * @param option
	 *            opcion
	 * @return comando
	 */
	private String getComandOf(char option) {
		for (int i = 0; i < options.length; i++) {
			if (options[i].getIdentifer() == option) {
				return options[i].getAction();
			}
		}
		return null;
	}

	/**
	 * Muestra una pantalla de menu
	 * 
	 * @param width
	 *            cantidad
	 * @param border
	 *            tipo
	 * @return opcion seleccionada
	 */
	public String show() {
		char identifier;
		String comand;
		System.out.println();
		do {
			for (int i = 0; i < options.length; i++) {
				options[i].show();
			}
			System.out.print("Digite la opcion deseada [" + identifiersOption() + "] : ");
			identifier = new MyInput().readChar();
			comand = getComandOf(identifier);
			System.out.println();
			if (comand == null) {
				System.out.println("\nEl caracter introducido no pertenece a las opciones");
				System.out.println("Intentelo de nuevo\n");
			}
		} while (comand == null);
		return comand;
	}
}
