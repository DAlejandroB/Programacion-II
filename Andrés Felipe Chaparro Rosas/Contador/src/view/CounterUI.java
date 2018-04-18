package view;
import models.MyCounter;

public class CounterUI extends Thread {
	private int speed;
	private MyCounter counter;

	public CounterUI(MyCounter counter, int speed) {
		this.speed = speed;
		this.counter = counter;
	}

	@Override
	public void run() {
		while (!counter.isLast()) {
			System.out.println(counter.getCurrent());
			try {
				Thread.sleep(1000 / speed);
			} catch (InterruptedException e) {
			}
		}
	}
}
