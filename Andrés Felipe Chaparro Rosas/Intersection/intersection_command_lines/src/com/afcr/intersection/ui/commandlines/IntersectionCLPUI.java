package com.afcr.intersection.ui.commandlines;

import com.afcr.intersection.logic.Circunference;
import com.afcr.intersection.ui.string.Command;
import com.afcr.ui.console.MyInput;
/**
 * 
 * @author Andrés Felipe Chaparro Rosas
 * @since 1.8
 *
 */
public class IntersectionCLPUI {
	public static final String PROMPT = "c:";
	private double radioA;
	private double XA;
	private double YA;
	private double radioB;
	private double XB;
	private double YB;
	
	private MyInput myInput;

	/**
	 * COnstructor que inicaliza los atributos
	 */
	public IntersectionCLPUI() {
		myInput = new MyInput();
	}

	/**
	 * Obtiene el comando escrito por el usuario
	 * @return
	 */
	public String getCommand() {
		System.out.print("Prompt " + PROMPT);
		return myInput.readString();
	}

	/**
	 * Valida la cadena de caracteres que entra y retorna el comando
	 * @param commandMultiple comando con posibles valores
	 * @return  comando
	 */
	public String validateCommand(String commandMultiple) {
		boolean ok=true;
		String[] commands = { Command.COMMAND_INPUT_DATA,
				Command.COMMAND_SHOW_RESULT,
				Command.COMMAND_HELP,
				Command.COMMAND_ABOUT, Command.COMMAND_EXIT };

		String[] words = commandMultiple.split(" ");

		for (String command : commands) {
			if (words[0].toLowerCase().equals(command)) {
				switch (command) {
				case Command.COMMAND_INPUT_DATA:
					if (words.length != 7)
						System.out.println("El numero de parametros no corresponde");
					else {
						try {
							radioA= Double.parseDouble(words[1]);
							XA= Double.parseDouble(words[2]);
							YA= Double.parseDouble(words[3]);
							radioB= Double.parseDouble(words[4]);
							XB= Double.parseDouble(words[5]);
							YB= Double.parseDouble(words[6]);
							System.out.println("Comando valido");
						} catch (NumberFormatException e) {
							System.out.println("ERROR: Los parametros no corresponden a valores numericos");
						}
					}

					break;
				case Command.COMMAND_SHOW_RESULT:
					Circunference circunference = new Circunference(radioA, XA, YA);
					circunference.setSecondCircunference(
							new Circunference(radioB, XB, YB));
					System.out.println("La circunferencia con radio " + radioA + " y centro (" + XA + ", " + YA+") "
							+ (circunference.result()?"INTERSECA":"NO INTERSECA")+" con la circunferencia con radio " + radioB + " y centro (" + XB + ", " + YB+")");
					break;
				case Command.COMMAND_HELP:
					System.out.println(ConstantsCommandLines.HELP);
					System.out.println(Command.COMMAND_INPUT_DATA+" #radioA #XA #YA #radioB #XB #YB radio donde # es una cifra");
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
