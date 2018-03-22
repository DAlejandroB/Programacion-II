package com.afcr.area.controller;

import com.afcr.area.logic.Triangle;
import com.afcr.area.ui.console.FormAbout;
import com.afcr.area.ui.console.FormHelp;
import com.afcr.area.ui.console.FormInputDataTriangle;
import com.afcr.area.ui.console.FormOutputTriangle;
import com.afcr.area.ui.strings.Command;

/**
 * Clase Action
 * @author Andrés Felipe Chaparro Rosas
 * @since 1.8
 *
 */
public class Controller {
	private Triangle triangle;
	
	/**
	 * Inicializa el atributo triangle
	 */
	public Controller(Triangle triangle) {
		this.triangle = triangle;
	}
	
	/**
	 * Utiliza el parametro comand y darle funcionnalidad al programa
	 * @param comand comando que selecciona una accions
	 */
	public void run(String comand) {
		switch (comand) {
		case Command.COMMAND_INPUT_DATA:
			actionInputData(triangle);
			break;
		case Command.COMMAND_CALCULATE:
			actionCalculateArea(triangle);
			break;
		case Command.COMMAND_SETTINGS:
			break;
		case Command.COMMAND_HELP:
			showHelp();
			break;
		case Command.COMMAND_ABOUT:
			showAbout();
			break;
		}
	}
	
	private void actionInputData(Triangle triangle) {
		FormInputDataTriangle formInputDataTriangle = new FormInputDataTriangle();
		formInputDataTriangle.showSides();
		triangle.setSideOne(formInputDataTriangle.getSideA())
		.setSideTwo(formInputDataTriangle.getSideB())
		.setSideThree(formInputDataTriangle.getSideC());
	}
	
	private void actionCalculateArea(Triangle triangle) {
		FormOutputTriangle formOutputTriangle= new FormOutputTriangle();
		if (triangle != null) {
			if(!(triangle.triangleArea()+"").equals("NaN")) {
				if(triangle.triangleArea()!=0)
					formOutputTriangle.showResult(
							triangle.getSideOne(), 
							triangle.getSideTwo(), 
							triangle.getSideThree(), 
							triangle.triangleArea());
			}else {
				formOutputTriangle.showNotResult(
						triangle.getSideOne(), 
						triangle.getSideTwo(), 
						triangle.getSideThree());
			}
		} else {
			formOutputTriangle.showNotTriangle();
		}
	}
	
	private void showHelp() {
		new FormHelp().show();
		
	}
	
	private void showAbout() {
		new FormAbout().show();
	}
}
