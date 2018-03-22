package model.entity;

import model.dao.Calculator;

public class Test {
	public static void main(String [] args) {
		Calculator op = new Calculator();
		op.addNewBrand("Chevrolet");
		op.addLine("Chevrolet", "Camaro");
		op.addRange(0, 30000000, 1.5);
		op.addRange(30000001, 70000000, 2.0);
		op.addRange(70000001, 200000000, 2.5);
		op.addRange(200000001, 1000000000, 4.0);
		op.addModel("Chevrolet", "Camaro", "2007", 123000000);
		double retorno = op.calculateBrute("Chevrolet", "Camaro", "2007",false, true, false);
		System.out.println("Valor del impuesto " + retorno);
	}
}
