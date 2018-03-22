package com.afcr.intersection.controller;

import com.afcr.intersection.logic.Circunference;
import com.afcr.intersection.ui.console.FormInputDataCircunference;
import com.afcr.intersection.ui.console.FormResult;
import com.afcr.intersection.ui.string.Command;

/**
 * Clase Action
 * @author Andrés Felipe Chaparro Rosas
 * @since 1.8
 * @version 1.0
 *
 */
public class Action {
	private Circunference circunference;

	/**
	 * Inicializa en null el atributo circunference
	 */
	public Action() {
		circunference = null;
	}

	/**
	 * Utiliza el parametro comand y darle funcionnalidad al programa
	 * @param comand comando que selecciona una accions
	 */
	public void run(String comand) {
		FormInputDataCircunference formInputDataCircunference = new FormInputDataCircunference();
		FormResult formResult = new FormResult();
		switch (comand) {
		case Command.COMMAND_INPUT_DATA:
			System.out.println("Entrada de datos");
			formInputDataCircunference.showPoints();
			circunference = new Circunference(
					formInputDataCircunference.getRadioA(),
					formInputDataCircunference.getPointXA(), 
					formInputDataCircunference.getPointYA());
			circunference.setSecondCircunference(
					new Circunference(
							formInputDataCircunference.getRadioB(),
							formInputDataCircunference.getPointXB(), 
							formInputDataCircunference.getPointYB()));
			break;
		case Command.COMMAND_SHOW_RESULT:
			if (circunference != null) {
				formResult.showResult(
						circunference.getCenterX(), 
						circunference.getCenterY(),
						circunference.getRadio(),
						circunference.getSecondCircunference().getCenterX(),
						circunference.getSecondCircunference().getCenterY(),
						circunference.getSecondCircunference().getRadio(), 
						circunference.result());
			} else {
				formResult.showNotResult();
			}
			break;
		case Command.COMMAND_SETTINGS:
			break;
		case Command.COMMAND_HELP:
			formResult.showHelp();
			break;
		case Command.COMMAND_ABOUT:
			System.out.println("Acerca de");
			break;
		case Command.COMMAND_EXIT:
			System.out.println("Salir");
			break;
		}
	}
}
