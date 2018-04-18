package view;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import controller.CounterListener;

public class MainJPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private int counterindex;
	private ArrayList<CounterGUI> counterGUIs;
	
	public MainJPanel(CounterListener c) {
		this.counterGUIs = new ArrayList<>();
		this.counterindex=-1;
		this.init();
		this.addCounter(c);
	}

	private void init() {
		this.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		this.setLayout(new GridLayout(1, this.counterGUIs.size(),5,5));
	}
	
	public void start() {
		for (int i = 0; i < this.counterGUIs.size(); i++) {
			start(i);
		}
	}
	
	public void start(int i) {
		getCounterGUI(i).init();
		getCounterGUI(i).start();
		getCounterGUI(i).getContainer().getMyToolBar().setPlayButtonEnabled(false);
		getCounterGUI(i).getContainer().getMyToolBar().setPauseButtonEnabled(true);
		getCounterGUI(i).getContainer().getMyToolBar().setFinishButtonEnabled(true);
	}
	
	public void pause() {
		for (int i = 0; i < counterGUIs.size(); i++) {
			pause(i);
		}
	}
	
	public void pause(int i) {
		getCounterGUI(i).pause();
		getCounterGUI(i).getContainer().getMyToolBar().setPlayButtonEnabled(true);
		getCounterGUI(i).getContainer().getMyToolBar().setPauseButtonEnabled(false);
	}
	
	public void stop() {
		for (int i = 0; i < counterGUIs.size(); i++) {
			stop(i);
		}
	}
	
	public void stop(int index) {
		getCounterGUI(index).stop();
		getCounterGUI(index).getContainer().getMyToolBar().setPlayButtonEnabled(true);
		getCounterGUI(index).getContainer().getMyToolBar().setPauseButtonEnabled(false);
		getCounterGUI(index).getContainer().getMyToolBar().setFinishButtonEnabled(false);
	}
	
	public void clear() {
		for (int i = 0; i < this.counterGUIs.size(); i++) {
			clear(i);
		}
	}
	
	public void clear(int index) {
			getCounterGUI(index).clear();
			getCounterGUI(index).getContainer().getMyToolBar().setPlayButtonEnabled(true);
			getCounterGUI(index).getContainer().getMyToolBar().setFinishButtonEnabled(false);
			getCounterGUI(index).getContainer().getMyToolBar().setPauseButtonEnabled(false);
	}
	
	public void addCounter(CounterListener c) {
		this.counterindex++;
		this.counterGUIs.add(new CounterGUI(counterindex+1,c));
		this.add(counterGUIs.get(counterindex).getContainer());
		this.setLayout(new GridLayout((this.counterGUIs.size()/6)+1, this.counterGUIs.size(),5,5));
		this.updateUI();
	}
	
	public void deleteCounter() {
		this.counterGUIs.remove(counterindex);
		this.remove(counterindex);
		this.counterindex--;
		this.setLayout(new GridLayout((this.counterGUIs.size()/6)+1, this.counterGUIs.size(),5,5));
		this.updateUI();
	}
	
	public CounterGUI getCounterGUI(int i) {
		return counterGUIs.get(i);
	}
}
