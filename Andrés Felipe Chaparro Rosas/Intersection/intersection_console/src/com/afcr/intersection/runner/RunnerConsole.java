package com.afcr.intersection.runner;

import com.afcr.intersection.controller.Action;
import com.afcr.intersection.ui.console.Constants;
import com.afcr.intersection.ui.string.Command;
import com.afcr.ui.console.Menu;
import com.afcr.ui.console.Option;
import com.afcr.ui.console.Splash;

public class RunnerConsole {
	public static void main(String[] args) {
		Splash splash = new Splash(new String[] {
				Constants.APPNAME, 
				Constants.APPVERSION, 
				Constants.AUTHOR, 
				Constants.DESCRIPTION, 
				Constants.YEAR
		});
		splash.show();

		Action action = new Action();
		Option[] options = { 
				new Option('i', "Introducir datos de los circulos", Command.COMMAND_INPUT_DATA),
				new Option('m', "Mostrar si intersecan los circulos", Command.COMMAND_SHOW_RESULT),
				new Option('a', "Ayuda", Command.COMMAND_HELP),
				new Option('b', "Acerca de", Command.COMMAND_ABOUT),
				new Option('e', "Salir", Command.COMMAND_EXIT) };
		Menu menu = new Menu(options);
		String comand;
		do {
			comand = menu.show();
			action.run(comand);
		} while (!comand.equals(Command.COMMAND_EXIT));
	}
}
