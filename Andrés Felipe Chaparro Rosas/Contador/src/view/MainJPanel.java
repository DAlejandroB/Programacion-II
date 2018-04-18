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
			this.counterGUIs.get(i).init();
			this.counterGUIs.get(i).start();
		}
	}
	
	public void pause() {
		for (int i = 0; i < counterGUIs.size(); i++) {
			this.counterGUIs.get(i).pause();
		}
	}
	
	public void stop() {
		for (int i = 0; i < counterGUIs.size(); i++) {
			this.counterGUIs.get(i).stop();
		}
	}
	public void clear() {
		for (int i = 0; i < this.counterGUIs.size(); i++) {
			this.counterGUIs.get(i).clear();
		}
	}
	
	public void addCounter(CounterListener c) {
		this.counterindex++;
		this.counterGUIs.add(new CounterGUI(counterindex,c));
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
}
