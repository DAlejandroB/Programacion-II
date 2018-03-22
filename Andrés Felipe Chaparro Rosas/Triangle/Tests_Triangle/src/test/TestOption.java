package test;

import com.afcr.area.ui.strings.Command;
import com.afcr.ui.console.Option;

public class TestOption {
	public static void main(String[] args) {
		Option option = new Option('i', "Ingresar datos de triangulo", Command.COMMAND_INPUT_DATA);
		option.show();
	}
}
