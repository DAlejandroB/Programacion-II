package com.afcr.area.runner;

import com.afcr.area.controller.Controller;
import com.afcr.area.logic.Triangle;
import com.afcr.area.ui.console.ConstantsConsole;
import com.afcr.area.ui.strings.Command;
import com.afcr.ui.console.Menu;
import com.afcr.ui.console.Option;
import com.afcr.ui.console.Splash;

public class RunnerConsole {

	public static void main(String[] args) {
		Triangle triangle = new Triangle(0, 0, 0);
		Controller controller = new Controller(triangle);
		Splash splash = new Splash(new String[] { ConstantsConsole.APPNAME, ConstantsConsole.APPVERSION,
				ConstantsConsole.AUTHOR, ConstantsConsole.DESCRIPTION, ConstantsConsole.YEAR });
		splash.show();
		Menu menu = new Menu(new Option[] {
				new Option('i', "Introducir datos de triangulo", Command.COMMAND_INPUT_DATA),
				new Option('c', "Calcular area de triangulo", Command.COMMAND_CALCULATE),
				new Option('a', "Ayuda", Command.COMMAND_HELP), new Option('b', "Acerca de", Command.COMMAND_ABOUT),
				new Option('e', "Salir", Command.COMMAND_EXIT) });
		String comand;
		do {
			comand = menu.show();
			controller.run(comand);
		} while (!comand.equals(Command.COMMAND_EXIT));
	}
}
