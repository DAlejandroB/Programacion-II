package com.afcr.intersection.runner;

import com.afcr.intersection.logic.Circunference;
import com.afcr.intersection.ui.commandline.IntersectionCLUI;

public class RunnerCL {
	public static void main(String[] args) {
		Circunference circle;
		IntersectionCLUI circleCLUI = new IntersectionCLUI();
		boolean ok = circleCLUI.inputData(args);
		circle = new Circunference(circleCLUI.getRadioA(), circleCLUI.getXA(), circleCLUI.getYA());
		circle.setSecondCircunference(new Circunference(circleCLUI.getRadioB(), circleCLUI.getXB(), circleCLUI.getYB()));
		if (ok)
			circleCLUI.showResult(circle.result());
	}
}
