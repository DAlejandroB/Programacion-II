package test;

import com.afcr.area.ui.strings.Command;
import com.afcr.ui.console.Menu;
import com.afcr.ui.console.Option;

public class TestMenu {
	public static void main(String[] args) {
		Option[] options= {
				new Option('i', "Introduzca datos de triangulo", Command.COMMAND_INPUT_DATA),
			//	new Option('c', "Calcular area de triangulo", Command.COMMAND_CALCULATE_AREA),
				new Option('a', "Ajustes", Command.COMMAND_SETTINGS),
				new Option('h', "Ayuda", Command.COMMAND_HELP),
				new Option('b', "Acerca de", Command.COMMAND_ABOUT),
				new Option('e', "Salir", Command.COMMAND_EXIT)
		};
		Menu menu = new Menu(options);
		String comandString;
		do {
			comandString = menu.show();
			System.out.println(comandString);
		}while(!comandString.equals(Command.COMMAND_EXIT));
	}
}
