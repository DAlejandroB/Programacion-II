package models;

public class MyCounter {
	private int startNumber, finishNumber, increment, current, speed;

	public MyCounter() {
		this(0, 0, 0, 1);
	}

	public MyCounter(int start, int finish, int increment, int speed) {
		this.finishNumber = finish;
		this.speed = speed;
		this.setIncrement(increment, start);
		this.setStartNumber(start);
		resetCurrent();
	}

	public MyCounter(int start, int finish, int increment) {
		this(start, finish, increment, 1);
	}

	public void resetCurrent() {
		this.current = startNumber;
	}

	public int getStartNumber() {
		return startNumber + this.increment;
	}

	public int getFinishNumber() {
		return finishNumber;
	}

	public int getIncrement() {
		return increment;
	}

	public int getSpeed() {
		return speed;
	}

	public int getCurrent() {
		return current += increment;
	}

	public boolean isLast() {
		return Math.abs(current - finishNumber) < Math.abs(increment);
	}

	public void setStartNumber(int startNumber) {
		this.startNumber = startNumber - this.increment;
	}

	public void setIncrement(int increment, int start) {
		this.increment = (start < finishNumber ? 1 : -1) * Math.abs(increment);
	}

	public void setAll(int start, int finish, int increment, int speed) {
		this.finishNumber = finish;
		this.speed = speed;
		this.setIncrement(increment,start);
		this.setStartNumber(start);
		resetCurrent();
	}
}
