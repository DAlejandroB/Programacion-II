package com.afcr.area.runner;

import com.afcr.area.ui.commandlines.TriangleCLPUI;
import com.afcr.area.ui.strings.Command;

public class RunnerCLP {
	public static void main(String[] args) {
		TriangleCLPUI triangleCLPUI = new TriangleCLPUI();
		String command;
		do {
			command = triangleCLPUI.validateCommand(triangleCLPUI.getCommand().toLowerCase());
		} while (!command.equals(Command.COMMAND_EXIT));
	}
}