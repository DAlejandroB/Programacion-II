package com.afcr.area.logic;

import com.afcr.geometry.Coordenate;

/**
 * Clase triangle Fecha = 22 de febrero de 2018
 *
 * @since 1.8
 * @author Andr�s Felipe Chaparro Rosas
 */
public class Triangle {

    private double sideOne;
    private double sideTwo;
    private double sideThree;
    
    private Coordenate coordenate1;
    private Coordenate coordenate2;
    private Coordenate coordenate3;
    /**
     * Introduce las cooordenadas
     * @param pointXOne punto X uno
     * @param pointYOne punto Y uno
     * @param pointXTwo punto X dos
     * @param pointYTwo punto Y dos
     * @param pointXThree punto X tres
     * @param pointYThree  punto Y tres
     */
    public Triangle(double pointXOne, double pointYOne,
            double pointXTwo, double pointYTwo,
            double pointXThree, double pointYThree) {
        coordenate1= new Coordenate(pointXOne, pointYOne);
        coordenate2= new Coordenate(pointXTwo, pointYTwo);
        coordenate3= new Coordenate(pointXThree, pointYThree);
        
        sideOne=coordenate1.distance(coordenate2);
        sideTwo=coordenate2.distance(coordenate3);
        sideThree=coordenate3.distance(coordenate1);
    }

    /**
     * Clase contenedora de los datos basicos de una circunferencia
     *
     * @param sideOne Lado uno de un triangulo
     * @param sideTwo Lado dos de un triangulo
     * @param sideThree Lado tres de un triangulo
     */
    public Triangle(double sideOne, double sideTwo, double sideThree) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    /**
     * Metodo que calcula el semiperimetro y posteriormente el area del
     * triangulo
     *
     * @return area del triangulo
     */
    public double triangleArea() {
        double semiperimeter = (this.sideOne + this.sideTwo + this.sideThree) / 2;
        return Math.sqrt(
                semiperimeter
                * (semiperimeter - this.sideOne)
                * (semiperimeter - this.sideTwo)
                * (semiperimeter - this.sideThree));
    }

    /**
     * Metodo que retorna el valor del lado uno del triangulo
     *
     * @return lado uno
     */
    public double getSideOne() {
        return sideOne;
    }

    /**
     * Metodo que retorna el valor del lado dos del triangulo
     *
     * @return lado dos
     */
    public double getSideTwo() {
        return sideTwo;
    }

    /**
     * Metodo que retorna el valor del lado tres del triangulo
     *
     * @return lado tres
     */
    public double getSideThree() {
        return sideThree;
    }

	public Triangle setSideOne(double sideOne) {
		this.sideOne = sideOne;
		return this;
	}

	public Triangle setSideTwo(double sideTwo) {
		this.sideTwo = sideTwo;
		return this;
	}

	public Triangle setSideThree(double sideThree) {
		this.sideThree = sideThree;
		return this;
	}
}
