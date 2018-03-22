package com.afcr.area.ui.commandline;

public class TriangleCLUI {
	private double sideA;
	private double sideB;
	private double sideC;

	public TriangleCLUI() {
		sideA = 0;
		sideB = 0;
		sideC = 0;
	}

	public double getDouble(String string) {
		try {
			return Double.parseDouble(string);
		} catch (NumberFormatException e) {
			System.out.printf("El valor %s no es un numero\n", string);
			return 0;
		}
	}

	public boolean inputData(String[] data) {
		if (data.length != 3) {
			if (data.length == 0) {
				System.out.println("No se introdujeron valores");
			} else {
				System.out.println("No se introdujeron 3 valores");
			}
			
			System.out.println("Uso : java -jar Triangulo.jar ladoA ladoB ladoC");
			System.out.println("donde cada lado tiene valor numerico real");
			return false;
		} else {
			sideA = getDouble(data[0]);
			sideB = getDouble(data[1]);
			sideC = getDouble(data[2]);
			return true;
		}
	}

	public void showResult(double area) {
		System.out.printf("El area del triangulo de lados %.2f, %.2f, %.2f es "+area+"\n", sideA, sideB, sideC);
	
	}

	public double getSideA() {
		return sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public double getSideC() {
		return sideC;
	}

}
