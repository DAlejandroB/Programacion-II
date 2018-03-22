package com.afcr.area.runner;

import com.afcr.area.logic.Triangle;
import com.afcr.area.ui.commandline.TriangleCLUI;

public class RunnerCL {
	public static void main(String[] args) {
		Triangle triangle;
		TriangleCLUI triangleCLUI = new TriangleCLUI();
		boolean ok = triangleCLUI.inputData(args);
		triangle= new Triangle(triangleCLUI.getSideA(),triangleCLUI.getSideB(),triangleCLUI.getSideC());
		if(ok)
		triangleCLUI.showResult(triangle.triangleArea());
	}
}
