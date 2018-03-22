/**
 * 
 */
package com.afcr.ui.console;

import java.util.Scanner;

/**
 * @author Andrés Felipe Chaparro Rosas
 *
 */
public class MyInput {

	private Scanner scanner;

	/**
	 * 
	 */
	public MyInput() {
		this.scanner = new Scanner(System.in);
	}

	/**
	 * Captura la cadena de caracteres desde consola
	 * 
	 * @return cadena de caracteres
	 */
	public String readString() {
		return scanner.nextLine();
	}

	/**
	 * Captura un caracter desde consola
	 * 
	 * @return caracter
	 */
	public char readChar() {
		return readString().charAt(0);
	}

	/**
	 * Captura un numero con mayoria de decimales desde consola
	 * 
	 * @return numero decimals
	 * @throws NumberFormatException
	 *             por caracteres no validos
	 */
	public double readDouble() throws NumberFormatException {
		return Double.parseDouble(readString());
	}
	
	public int readInt() throws NumberFormatException{
		return Integer.parseInt(readString());
	}
	

	
	public long readLong() throws NumberFormatException {
		return Long.parseLong(readString());
	}
}
