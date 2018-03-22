package com.afcr.triangle.runner;

import com.afcr.area.runner.RunnerCL;
import com.afcr.area.runner.RunnerCLP;
import com.afcr.area.runner.RunnerConsole;

public class Runner {

	public static void main(String[] args) {
		if(args.length!=0) {
			String[] arguments = new String[args.length-1];
			for (int i = 1; i < args.length; i++) {
				arguments[i - 1] = args[i];
			}
			switch (args[0].toLowerCase()) {
			case "console":
				RunnerConsole.main(args);
				break;
			case "commandline":
				RunnerCL.main(arguments);
				break;
			case "commandlines":
				RunnerCLP.main(arguments);
				break;
			case "help":
				System.out.println("Comandos validos");
				System.out.println("console\tcommandline\tcommandlines");
				break;
			default:
				System.out.println("El comando "+args[0]+" no es valido");
				System.out.println("Comandos validos");
				System.out.println("console\tcommandline\tcommandlines");
				break;
			}
		}else {
			System.out.println("No se introdujo ningun comando");
			System.out.println("Comandos validos");
			System.out.println("console\tcommandline\tcommandlines");
		}
		
	}
}