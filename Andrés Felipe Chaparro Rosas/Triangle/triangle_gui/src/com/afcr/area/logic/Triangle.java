package com.afcr.area.logic;

import com.afcr.geometry.Coordenate;

/**
 * Clase triangle Fecha = 22 de febrero de 2018
 *
 * @since 1.8
 * @author Andr�s Felipe Chaparro Rosas
 */
public class Triangle {

	protected double sideA;
	protected double sideB;
	protected double sideC;

	private Coordenate coordenate1;
	private Coordenate coordenate2;
	private Coordenate coordenate3;

	/**
	 * Introduce las cooordenadas
	 * 
	 * @param pointXOne
	 *            punto X uno
	 * @param pointYOne
	 *            punto Y uno
	 * @param pointXTwo
	 *            punto X dos
	 * @param pointYTwo
	 *            punto Y dos
	 * @param pointXThree
	 *            punto X tres
	 * @param pointYThree
	 *            punto Y tres
	 */
	public Triangle(double pointXOne, double pointYOne, double pointXTwo, double pointYTwo, double pointXThree,
			double pointYThree) {
		this.coordenate1 = new Coordenate(pointXOne, pointYOne);
		this.coordenate2 = new Coordenate(pointXTwo, pointYTwo);
		this.coordenate3 = new Coordenate(pointXThree, pointYThree);

		this.sideA = this.coordenate1.distance(this.coordenate2);
		this.sideB = this.coordenate2.distance(this.coordenate3);
		this.sideC = this.coordenate3.distance(this.coordenate1);
	}

	/**
	 * Clase contenedora de los datos basicos de una circunferencia
	 *
	 * @param sideOne
	 *            Lado uno de un triangulo
	 * @param sideTwo
	 *            Lado dos de un triangulo
	 * @param sideThree
	 *            Lado tres de un triangulo
	 */
	public Triangle(double sideOne, double sideTwo, double sideThree) {
		this.sideA = sideOne;
		this.sideB = sideTwo;
		this.sideC = sideThree;
	}

	public static double triangleArea(double sideA, double sideB, double sideC) {
		double semiperimeter = (sideA + sideB + sideC) / 2;
		return Math.sqrt(semiperimeter * (semiperimeter - sideA) * (semiperimeter - sideB) * (semiperimeter - sideC));
	}

	/**
	 * Metodo que calcula el semiperimetro y posteriormente el area del triangulo
	 *
	 * @return area del triangulo
	 */
	public double triangleArea() {
		return Triangle.triangleArea(this.sideA, this.sideB, this.sideC);
	}

	/**
	 * Metodo que retorna el valor del lado uno del triangulo
	 *
	 * @return lado uno
	 */
	public double getSideA() {
		return this.sideA;
	}

	/**
	 * Metodo que retorna el valor del lado dos del triangulo
	 *
	 * @return lado dos
	 */
	public double getSideB() {
		return this.sideB;
	}

	/**
	 * Metodo que retorna el valor del lado tres del triangulo
	 *
	 * @return lado tres
	 */
	public double getSideC() {
		return this.sideC;
	}

	public Triangle setSideOne(double sideOne) {
		this.sideA = sideOne;
		return this;
	}

	public Triangle setSideTwo(double sideTwo) {
		this.sideB = sideTwo;
		return this;
	}

	public Triangle setSideThree(double sideThree) {
		this.sideC = sideThree;
		return this;
	}
}
