package test;

import com.afcr.geometry.Coordenate;
/**
 * Clase test
 * Fecha = 22 de febrero de 2018
 * @since 1.8
 * @author Andr�s Felipe Chaparro Rosas
 */
public class TestCoordenate{
	
	public static void main(String[] args){
		Coordenate coordenate = new Coordenate(100,100);
		System.out.println("Caso 1 "+(coordenate.distance(
				new Coordenate(400, 500))==500?"Correcto":"Error"));
		System.out.println("Caso 2 "+(coordenate.distance(
				new Coordenate(200, 600))==500?"Correcto":"Error"));
		System.out.println("Caso 3 "+(coordenate.distance(
				new Coordenate(700, 900))==500?"Correcto":"Error"));
	}
}
