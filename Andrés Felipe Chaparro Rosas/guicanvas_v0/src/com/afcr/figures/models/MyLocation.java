package com.afcr.figures.models;

public class MyLocation {

	protected int x;
	protected int y;

	public MyLocation() {
		this(0, 0);
	}

	public MyLocation(int x, int y) {
		this.setX(x);
		this.setY(y);
	}

	public MyLocation(MyLocation myLocation) {
		this.setX(myLocation.getX());
		this.setY(myLocation.getY());
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public MyLocation getLocation() {
		return new MyLocation(x, y);
	}
}
