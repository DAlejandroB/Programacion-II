package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MyJFrame;
import view.MyToolBar;

public class CounterListener implements ActionListener {
	private MyJFrame myJFrame;

	public CounterListener() {
		this.myJFrame = new MyJFrame(this);
	}

	private void play(int index) {
		if (index != 0) {
			myJFrame.getjPanel().start(index-1);
			getToolBar(index-1).setPlayButtonEnabled(false);
			getToolBar(index-1).setPauseButtonEnabled(true);
			getToolBar(index-1).setFinishButtonEnabled(true);
		} else {
			myJFrame.getjPanel().start();
			myJFrame.getToolBar().setPlayButtonEnabled(false);
			myJFrame.getToolBar().setFinishButtonEnabled(true);
			myJFrame.getToolBar().setPauseButtonEnabled(true);
		}
	}

	private void pause(int index) {
		if (index != 0) {
			myJFrame.getjPanel().pause(index-1);
			getToolBar(index-1).setPlayButtonEnabled(true);
			getToolBar(index-1).setPauseButtonEnabled(false);
		} else {
			myJFrame.getjPanel().pause();
			myJFrame.getToolBar().setPlayButtonEnabled(true);
			myJFrame.getToolBar().setPauseButtonEnabled(false);
		}
	}

	private void stop(int index) {
		if (index != 0) {
			myJFrame.getjPanel().stop(index-1);
			getToolBar(index-1).setPlayButtonEnabled(true);
			getToolBar(index-1).setPauseButtonEnabled(false);
			getToolBar(index-1).setFinishButtonEnabled(false);
		} else {
			myJFrame.getjPanel().stop();
			myJFrame.getToolBar().setPlayButtonEnabled(true);
			myJFrame.getToolBar().setPauseButtonEnabled(false);
			myJFrame.getToolBar().setFinishButtonEnabled(false);
		}
	}

	private void clear(int index) {
		if (index != 0) {
			myJFrame.getjPanel().clear(index-1);
			getToolBar(index-1).setPlayButtonEnabled(true);
			getToolBar(index-1).setPauseButtonEnabled(false);
			getToolBar(index-1).setFinishButtonEnabled(false);
		} else {
			myJFrame.getjPanel().clear();
			myJFrame.getToolBar().setPlayButtonEnabled(true);
			myJFrame.getToolBar().setFinishButtonEnabled(false);
			myJFrame.getToolBar().setPauseButtonEnabled(false);
		}
	}

	private void addCounter() {
		myJFrame.getjPanel().addCounter(this);
	}

	private void deleteCounter() {
		myJFrame.getjPanel().deleteCounter();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		switch (command(e.getActionCommand())[1]) {
		case "COMMAND_PLAY":
			play(Integer.parseInt(command(e.getActionCommand())[0]));
			break;
		case "COMMAND_PAUSE":
			pause(Integer.parseInt(command(e.getActionCommand())[0]));
			break;
		case "COMMAND_STOP":
			stop(Integer.parseInt(command(e.getActionCommand())[0]));
			break;
		case "COMMAND_CLEAR":
			clear(Integer.parseInt(command(e.getActionCommand())[0]));
			break;

		case "COMMAND_ADDITEM":
			addCounter();
			break;
		case "COMMAND_DELETEITEM":
			deleteCounter();
			break;
		default:
			break;
		}
	}

	private String[] command(String string) {
		String[] r = { "", "" };
		for (int i = 0; i < string.length(); i++) {
			if (Character.isDigit(string.charAt(i))) {
				r[0] += string.charAt(i);
			} else {
				r[1] += string.charAt(i);
			}
		}
		return r;
	}
	
	private MyToolBar getToolBar(int index) {
		return myJFrame.getjPanel().getCounterGUI(index).getContainer().getMyToolBar();
	}
}
