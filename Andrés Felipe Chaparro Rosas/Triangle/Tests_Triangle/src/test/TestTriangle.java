package test;

import com.afcr.area.logic.Triangle;

/**
 * Clase TestTriangle
 * Fecha = 22 de febrero de 2018
 * @since 1.8
 * @author Andrés Felipe Chaparro Rosas
 */
public class TestTriangle {
	public static void main(String[] args) {
		Triangle triangle = new Triangle(3, 4, 5);
		System.out.println("Caso 1 : "+(triangle.triangleArea()==6?"Correcto":"Error"));
		triangle = new Triangle(100, 50, 50);
		System.out.println("Caso 2 : "+(triangle.triangleArea()==75?"Correcto":"Error"));
	}
}
