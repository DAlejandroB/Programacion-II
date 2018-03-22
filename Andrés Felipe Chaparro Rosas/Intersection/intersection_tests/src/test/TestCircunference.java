package test;

import com.afcr.intersection.logic.Circunference;
/**
 * Test unitario de la clase Circunference
 * @author Andrés Felipe Chaparro Rosas
 *
 */
public class TestCircunference {
	public static void main(String[] args){
		Circunference circunference = new Circunference(25, 0, 0);
		circunference.setSecondCircunference(new Circunference(25, 40, 30));
		System.out.println("Los dos circulos "+(circunference.result()?"si intersecan":"no intersecan"));
		circunference.setSecondCircunference(new Circunference(24, 40, 30));
		System.out.println("Los dos circulos "+(circunference.result()?"si intersecan":"no intersecan"));
		circunference.setSecondCircunference(new Circunference(26, 40, 30));
		System.out.println("Los dos circulos "+(circunference.result()?"si intersecan":"no intersecan"));
	}
}
