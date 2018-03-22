package com.afcr.area.ui.commandlines;

import com.afcr.area.logic.Triangle;
import com.afcr.area.ui.strings.Command;
import com.afcr.ui.console.MyInput;

public class TriangleCLPUI {
	public static final String PROMPT = "t:";
	private double sideA;
	private double sideB;
	private double sideC;

	private MyInput myInput;

	public TriangleCLPUI() {
		myInput = new MyInput();
	}

	public String getCommand() {
		System.out.print("Prompt " + PROMPT);
		return myInput.readString();
	}

	public String validateCommand(String commandMultiple) {
		boolean ok=true;
		String[] commands = { Command.COMMAND_INPUT_DATA, Command.COMMAND_CALCULATE, Command.COMMAND_HELP,
				Command.COMMAND_ABOUT, Command.COMMAND_EXIT };

		String[] words = commandMultiple.split(" ");

		for (String command : commands) {
			if (words[0].toLowerCase().equals(command)) {
				switch (command) {
				case Command.COMMAND_INPUT_DATA:
					if (words.length != 4)
						System.out.println("El numero de parametros no corresponde");
					else {
						try {
							sideA = Double.parseDouble(words[1]);
							sideB = Double.parseDouble(words[2]);
							sideC = Double.parseDouble(words[3]);
							System.out.println("Comando valido");
						} catch (NumberFormatException e) {
							System.out.println("ERROR: Los parametros no corresponden a valores numericos");
						}
					}

					break;
				case Command.COMMAND_CALCULATE:
					Triangle triangle = new Triangle(sideA, sideB, sideC);
					System.out.println("El area del triangulo con lados " + "" + sideA + ", " + sideB + ", " + sideC
							+ " es: " + triangle.triangleArea());
					break;
				case Command.COMMAND_HELP:
					System.out.println(ConstantsCommandLines.HELP);
					System.out.println(Command.COMMAND_INPUT_DATA+" ## ## ## donde # es una cifra");
					break;
				case Command.COMMAND_ABOUT:
					System.out.println(ConstantsCommandLines.ABOUT);
					break;
				default:
					break;
				}
				ok=true;
				return command;
			}
		}
		if (ok) {
			System.out.println("El valor introducido no es valido \n" 
					+ "-help- para obtener los comandos validos");
		}
		return "";
	}
}
