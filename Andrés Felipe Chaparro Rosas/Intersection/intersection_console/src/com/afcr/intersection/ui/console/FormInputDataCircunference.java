package com.afcr.intersection.ui.console;

import com.afcr.ui.console.FormInputData;

/**
 * Clase FormInputDataCircunference
 * @author Andrés Felipe Chaparro Rosas
 * @since 1.8
 */
public class FormInputDataCircunference {
	private double pointXA;
	private double pointYA;
	private double pointXB;
	private double pointYB;
	private double radioA;
	private double radioB;

	/**
	 * Pide el ingreso de un valor numerico y hasta que este lo sea lo retorna
	 * @param pointName Nombre del punto en el plano
	 * @return valor del punto
	 */
	public double showPoint(String pointName) {
		FormInputData formInputData = new FormInputData();
		boolean ok;
		do {
			ok = true;
			try {
				return formInputData.showDoubleLabel("Digite el valor de " + pointName + ", y de enter : ");
			} catch (NumberFormatException e) {
				System.out.println("Lo que usted digitó no es un número" + "\nDigite unicamente digitos numericos y "
						+ "\ncomo separador de decimales utilice el punto" + "\nIntentelo de nuevo");
				ok = false;
			}
		} while (!ok);
		return 0;
	}

	/**
	 * Pide el ingreso de un valor numerico y hasta que este lo sea lo retorna
	 * @param radioName Nombre del radio de la circunferencia
	 * @return valor del radio
	 */
	private double showRadio(char radioName) {
		FormInputData formInputData = new FormInputData();
		boolean ok;
		do {
			ok = true;
			try {
				return formInputData.showDoubleLabel("Digite el valor del radio "+radioName+" y de enter : ");
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
	public void showPoints() {
		this.pointXA = showPoint("XA");
		this.pointYA = showPoint("YA");
		this.radioA = showRadio('A');
		this.pointXB = showPoint("XB");
		this.pointYB = showPoint("YB");
		this.radioB = showRadio('B');
	}

	/**
	 * Obtiene el valor del punto XA
	 * @return punto XA 
	 */
	public double getPointXA() {
		return pointXA;
	}

	/**
	 * Obtiene el valor del punto YA
	 * @return punto YA
	 */
	public double getPointYA() {
		return pointYA;
	}

	/**
	 * Obtiene el valor del punto XB
	 * @return punto XB
	 */
	public double getPointXB() {
		return pointXB;
	}

	/**
	 * Obtiene el valor del punto YB
	 * @return punto YB
	 */
	public double getPointYB() {
		return pointYB;
	}

	/**
	 * Obtiene el valor del radio A
	 * @return radio A
	 */
	public double getRadioA() {
		return radioA;
	}

	/**
	 * Obtiene el valor del radio B
	 * @return radio B
	 */
	public double getRadioB() {
		return radioB;
	}
}
