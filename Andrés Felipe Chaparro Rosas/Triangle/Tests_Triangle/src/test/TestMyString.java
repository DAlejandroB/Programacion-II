package test;

import com.afcr.ui.console.MyString;

/**
 * Test My String
 * @author Andrés Felipe Chaparro Rosas
 *
 */
public class TestMyString {
	public static void main(String[] args) {
		System.out.println("123456789012345678901234567890");
		MyString myString = new MyString();
		System.out.println(myString.centerLine("Hola mundo", 20));
	}
}
