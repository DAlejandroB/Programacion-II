package com.afcr.iomanager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Clase IOManager
 * Fecha = 22 de febrero de 2018
 * @since 1.8
 * @author Andrés Felipe Chaparro Rosas
 */
public class IOManager {
	private BufferedReader br;
	/**
	 * Clase que maneja excepciones de entrada y salida
	 */
	public IOManager() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public double readDouble(String message) {
		double number=0;
		System.out.println(message);
		try {
			number = Double.parseDouble(br.readLine());
		} catch (NumberFormatException e) {
		} catch (IOException e) {
		}
		
		return number;
	}

	public double readDouble() {
		double number=0;
		try {
			number = Double.parseDouble(br.readLine());
		} catch (NumberFormatException e) {
		} catch (IOException e) {
		}
		
		return number;
	}

	public int readInteger(String message) {
		int number=0;
		System.out.println(message);
		try {
			number = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
		} catch (IOException e) {
		}
		
		return number;
	}
	
	public int readInteger() {
		int number=0;
		try {
			number = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
		} catch (IOException e) {
		}
		
		return number;
	}

	public float readFloat(String message) {
		float number=0;
		System.out.println(message);
		try {
			number = Float.parseFloat(br.readLine());
		} catch (NumberFormatException e) {
		} catch (IOException e) {
		}
		
		return number;
	}
	
	public float readFloat() {
		float number=0;
		try {
			number = Float.parseFloat(br.readLine());
		} catch (NumberFormatException e) {
		} catch (IOException e) {
		}
		
		return number;
	}

	public String readString(String message) {
		String text = "";
		System.out.println(message);
		try {
			text = br.readLine();
		} catch (IOException e) {
		}
		return text;
	}
	public String readString() {
		String text = "";
		try {
			text = br.readLine();
		} catch (IOException e) {
		}
		return text;
	}
	
	public char readChar(String message) {
		char character=' ';
		System.out.println(message);
		try {
			character = br.readLine().charAt(0);
		} catch (IOException e) {
		}
		return character;
	}
	
	public char readChar() {
		char character=' ';
		try {
			character = br.readLine().charAt(0);
		} catch (IOException e) {
		}
		return character;
	}
	
	public String orderChar(char[] charArray) {
		return new String(charArray);
	}
}
