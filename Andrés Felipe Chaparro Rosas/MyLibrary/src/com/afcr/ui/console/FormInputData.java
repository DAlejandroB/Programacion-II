package com.afcr.ui.console;

/**
 * Clase FormInputData
 * 
 * @author Andrés Felipe Chaparro Rosas
 * @since 1.8
 */
public class FormInputData extends MyInput {
	
	public long showLongLabel(String message)throws NumberFormatException {
		System.out.print(message);
		return readLong();
	}
	/**
	 * Muestra un mensaje antes de pedir el dato numerico entero
	 * @param message mensaje 
	 * @return dato numerico real
	 * @throws NumberFormatException por contener un numero
	 */
	public int showIntLabel(String message) throws NumberFormatException {
		System.out.print(message);
		return readInt();
	}

	/**
	 * Muestra un mensaje antes de pedir el dato numerico real
	 * @param message mensaje--
	 * @return numero real
	 * @throws NumberFormatException por contener un numero
	 */
	public double showDoubleLabel(String message) throws NumberFormatException {
		System.out.print(message);
		return readDouble();
	}

	/**
	 * Muestra un mensaje antes de pedir la cadena de caracteres
	 * @param message mensaje
	 * @return cadena de caracteres
	 */
	public String showStringLabel(String message) {
		System.out.print(message);
		return readString();
	}
}
