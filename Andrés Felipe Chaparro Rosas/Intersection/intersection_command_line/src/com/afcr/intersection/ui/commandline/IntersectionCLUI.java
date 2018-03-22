package com.afcr.intersection.ui.commandline;

public class IntersectionCLUI {
	private double radioA;
	private double radioB;
	private double XA;
	private double YA;
	private double XB;
	private double YB;
	
	/**
	 * Constructor que inicializa los atributos
	 */
	public IntersectionCLUI() {
		radioA = 0;
		radioB = 0;
		XA = 0;
		YA = 0;
		XB = 0;
		YB = 0;
	}

	/**
	 * Obtiene una cadena de caractores e intenta cambiarla a double
	 * @param string
	 * @return
	 */
	public double getDouble(String string) {
		try {
			return Double.parseDouble(string);
		} catch (NumberFormatException e) {
			System.out.printf("El valor %s no es un numero\n", string);
			return 0;
		}
	}

	/**
	 * Muestra un mensaje de vuleta dependiendo del valor entrante
	 * @param data datos a evaluar
	 * @return funcionalidad correcta
	 */
	public boolean inputData(String[] data) {
		if (data.length != 6) {
			if (data.length == 0) {
				System.out.println("No se introdujeron valores");
			} else {
				System.out.println("No se introdujeron 6 valores");
			}
			
			System.out.println("Uso : java -jar Triangulo.jar radioA XA YA radioB XB YB");
			System.out.println("donde cada lado tiene valor numerico real");
			return false;
		} else {
			radioA = getDouble(data[0]);
			XA = getDouble(data[1]);
			YA = getDouble(data[2]);
			radioB = getDouble(data[3]);
			XB = getDouble(data[4]);
			YB = getDouble(data[5]);
			return true;
		}
	}

	/**
	 * Muestra el resultado de la validacion
	 * @param result
	 */
	public void showResult(boolean result) {
		System.out.printf("La circunferencia A con radio %.2f y centro(%.2f, %.2f) "
				+ (result?"INTERSECA":"NO INTERSECA")
				+" con la circunfererncia B con radio %.2f y centro(%.2f, %.2f)\n", radioA, XA, YA, radioB, XB, YB);
	}

	/**
	 * Obtiene el radio A
	 * @return radio A
	 */
	public double getRadioA() {
		return radioA;
	}

	/**
	 * Obtiene el radio B
	 * @return radio B
	 */
	public double getRadioB() {
		return radioB;
	}

	/**
	 * Obtiene X A
	 * @return X A
	 */
	public double getXA() {
		return XA;
	}
	
	/**
	 * Obtiene Y A
	 * @return Y A
	 */
	public double getYA() {
		return YA;
	}

	/**
	 * Obtiene X B
	 * @return X B
	 */
	public double getXB() {
		return XB;
	}

	/**
	 * Obtiene Y B
	 * @return Y B
	 */
	public double getYB() {
		return YB;
	}
	
	
}
