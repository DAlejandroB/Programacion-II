package view;

import controller.CounterListener;
import models.MyCounter;

public class CounterGUI implements Runnable {
	private MyCounter counter;
	private ToolBarContainer container;
	private boolean isRunning;
	private boolean isCharged;
	private Thread thread;

	public CounterGUI(int id, CounterListener c) {
		this.container = new ToolBarContainer(id);
		this.counter = new MyCounter();
		this.isRunning = false;
		this.isCharged = false;
	}

	@Override
	public void run() {
		while (!counter.isLast() && isRunning) {
			container.setMainLabelTitle(counter.getCurrent());
			try {
				Thread.sleep(1000 / counter.getSpeed());
			} catch (InterruptedException e) {
			}
		}
	}

	public void init() {
		if (!isCharged) {
			this.counter.setAll(container.getData()[0], container.getData()[1], container.getData()[2],
					container.getData()[3]);
			isCharged=true;
		}
		this.container.setMainLabelTitle(counter.getStartNumber());
	}

	public void start() {
		thread = new Thread(this);
		thread.setPriority(Thread.MIN_PRIORITY);
		thread.start();
		isRunning = true;
	}

	public void pause() {
		if (thread != null) {
			isRunning = false;
			thread.interrupt();
		}
		thread = null;
	}
	
	public void stop() {
		pause();
		isCharged=false;
		this.container.setMainLabelTitle(counter.getStartNumber());
	}
	
	public void clear() {
		stop();
		container.setBlankField();
		this.counter.setAll(container.getData()[0], container.getData()[1], container.getData()[2],
				container.getData()[3]);
		this.container.setMainLabelTitle(counter.getStartNumber());
	}
	
	public ToolBarContainer getContainer() {
		return container;
	}
}