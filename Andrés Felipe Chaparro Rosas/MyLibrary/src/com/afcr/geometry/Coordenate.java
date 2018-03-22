package com.afcr.geometry;
/**
 * Clase coordenada
 * Fecha = 22 de febrero de 2018
 * @since 1.8
 * @author Andr�s Felipe Chaparro Rosas
 */
public class Coordenate {

	private double centerX;
	private double centerY;
	/**
	 * Clase contenedora de las coordenadas del centro de una circunferencia
	 * @param centerX valor de X
	 * @param centerY valor de Y
	 */
	public Coordenate(double centerX, double centerY) {
		this.centerX = centerX;
		this.centerY = centerY;
	}
	
	/**
	 * Metodo que calcula la distancia entre los centros de los circulos
	 * @param coordenate Se introducen las coordenadas respectivas x,y
	 * @return El resultado
	 */
	public double distance(Coordenate coordenate){
		return Math.hypot(this.centerX-coordenate.getCenterX(), 
				this.centerY-coordenate.getCenterY());
	}
	
	/**
	 * Metodo que retorna el valor de X del centro de una circunferencia
	 * @return valor X
	 */
	public double getCenterX() {
		return centerX;
	}
	/**
	 * Metodo que retorna el valor de Y del centro de una circunferencia
	 * @return valor Y
	 */
	public double getCenterY() {
		return centerY;
	}
	
}
