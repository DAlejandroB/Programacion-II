package com.afcr.area.ui.console;

import com.afcr.ui.console.FormInputData;

/**
 * Clase FormInputDataTriangle
 * @author Andrés Felipe Chaparro Rosas
 * @since 1.8
 */
public class FormInputDataTriangle {
	private double sideA;
	private double sideB;
	private double sideC;

	/**
	 * Pide el ingreso de un valor numerico y hasta que este lo sea lo retorna
	 * @param pointName Nombre del lado del triangulo
	 * @return valor del lado
	 */
	public double showSide(char sideName) {
		FormInputData formInputData = new FormInputData();
		boolean ok;
		do {
			ok = true;
			try {
				return formInputData.showDoubleLabel("Digite el valor de" 
						+ " la longitud del lado " 
						+ sideName + ", y de enter : ");
			} catch (NumberFormatException e) {
				System.out.println("Lo que usted digitó no es un número" + "\nDigite unicamente digitos numericos y "
						+ "\ncomo separador de decimales utilice el punto" + "\nIntentelo de nuevo");
				ok = false;
			}
		} while (!ok);
		return 0;
	}
	
	/**
	 * Pide los valores de los datos necesarios en orden y los aloja
	 * en su respectivo atributo
	 */
	public void showSides() {
		this.sideA = showSide('A');
		this.sideB = showSide('B');
		this.sideC = showSide('C');
	}
	
	/**
	 * Obtiene el valor del lado A
	 * @return lado A
	 */
	public double getSideA() {
		return sideA;
	}
	
	/**
	 * Obtiene el valor del lado B
	 * @return lado B
	 */
	public double getSideB() {
		return sideB;
	}

	/**
	 * Obtiene el valor del ladoC
	 * @return lado C
	 */
	public double getSideC() {
		return sideC;
	}
}
