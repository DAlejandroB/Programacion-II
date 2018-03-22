package test;

import com.afcr.area.ui.console.FormInputDataTriangle;

public class TestFormInputDataTriangle {
	public static void main(String[] args) {
		FormInputDataTriangle formInputDataTriangle= new FormInputDataTriangle();
		formInputDataTriangle.showSides();
		System.out.println("Lado A = "+formInputDataTriangle.getSideA());
		System.out.println("Lado B = "+formInputDataTriangle.getSideB());
		System.out.println("Lado C = "+formInputDataTriangle.getSideC());
	}
}
