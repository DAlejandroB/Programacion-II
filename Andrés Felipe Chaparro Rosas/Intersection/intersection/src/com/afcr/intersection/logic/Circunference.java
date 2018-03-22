package com.afcr.intersection.logic;

import com.afcr.geometry.Coordenate;

/**
 * Clase circunferencia Fecha = 22 de febrero de 2018
 * 
 * @since 1.8
 * @author Andr�s Felipe Chaparro Rosas
 */
public class Circunference extends Coordenate {

	private double radio;
	private Circunference secondCircunference;

	/**
	 * Clase contenedora de los datos basicos de una circunferencia
	 * 
	 * @param radio
	 *            Valor del radio
	 * @param centerX
	 *            calor de X centro
	 * @param centerY
	 *            valor de Y centro
	 */
	public Circunference(double radio, double centerX, double centerY) {
		super(centerX, centerY);
		this.radio = radio;
	}

	/**
	 * Metodo que suma los radios de las circunferencias y compara la suma de los
	 * radios con la distancia
	 * 
	 * @param circle
	 *            segundo circulo
	 * @return booleano con verificacion
	 */
	public boolean result() {
		return radio + secondCircunference.getRadio() >= distance(secondCircunference);
	}

	/**
	 * Metodo que retorna el valor del radio de una circunferencia
	 * 
	 * @return valor radio
	 */
	public double getRadio() {
		return radio;
	}

	/**
	 * Retorna el atributo de la segunda circunferencia
	 * 
	 * @return circunference
	 */
	public Circunference getSecondCircunference() {
		return secondCircunference;
	}

	/**
	 * Obtiene el atributo de circunference
	 * 
	 * @param secondCircunference
	 *            atributo con otros datos
	 */
	public void setSecondCircunference(Circunference secondCircunference) {
		this.secondCircunference = secondCircunference;
	}

}
