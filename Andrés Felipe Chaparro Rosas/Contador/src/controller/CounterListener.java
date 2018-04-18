package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MyJFrame;

public class CounterListener implements ActionListener{
	private MyJFrame myJFrame;

	public CounterListener() {
		this.myJFrame = new MyJFrame(this);
	}

	private void play() {
		myJFrame.getjPanel().start();
		myJFrame.getToolBar().setPlayButtonEnabled(false);
		myJFrame.getToolBar().setFinishButtonEnabled(true);
		myJFrame.getToolBar().setPauseButtonEnabled(true);
	}

	private void pause() {
		myJFrame.getjPanel().pause();
		myJFrame.getToolBar().setPlayButtonEnabled(true);
		myJFrame.getToolBar().setPauseButtonEnabled(false);
	}

	private void stop() {
		myJFrame.getjPanel().stop();
		myJFrame.getToolBar().setPlayButtonEnabled(true);
		myJFrame.getToolBar().setFinishButtonEnabled(false);
	}

	private void clear() {
		myJFrame.getjPanel().clear();
		myJFrame.getToolBar().setPlayButtonEnabled(true);
		myJFrame.getToolBar().setFinishButtonEnabled(false);
		myJFrame.getToolBar().setPauseButtonEnabled(false);
	}

	private void addCounter() {
		myJFrame.getjPanel().addCounter(this);
	}

	private void deleteCounter() {
		myJFrame.getjPanel().deleteCounter();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		switch (e.getActionCommand()) {
		case "COMMAND_PLAY0":
			play();
			break;
		case "COMMAND_PAUSE0":
			pause();
			break;
		case "COMMAND_STOP0":
			stop();
			break;
		case "COMMAND_CLEAR0":
			clear();
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
}
