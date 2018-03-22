package com.afcr.intersection.runner;

import com.afcr.intersection.ui.string.Command;
import com.afcr.intersection.ui.commandlines.IntersectionCLPUI;

public class RunnerCLP {
	public static void main(String[] args) {
		IntersectionCLPUI circleCLPUI = new IntersectionCLPUI();
		String command;
		do {
			command = circleCLPUI.validateCommand(circleCLPUI.getCommand().toLowerCase());
		} while (!command.equals(Command.COMMAND_EXIT));
	}
}