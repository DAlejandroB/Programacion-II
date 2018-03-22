package test;

import com.afcr.ui.console.FormInputData;

public class TestFormInput {
	public static void main(String[] args) {
		FormInputData formInputData = new FormInputData();
		boolean ok;
		do {
			ok = true;
			try {
				System.out.println("El valor digitado es " + 
			formInputData.showDoubleLabel("Digite el valor de la longitud del lado A,"
									+ " y de enter : "));
			} catch (NumberFormatException e) {
				System.out.println("Lo que usted digitó no es un número" 
						+ "\nDigite unicamente digitos numericos y "
						+ "\ncomo separador de decimales utilice el punto" 
						+ "\nIntentelo de nuevo");
				ok = false;
			}
		} while (!ok);
	}
}
