package com.afcr.figures.models;

public class FigureDao extends MyLocation {
	protected double size;
	protected double direction;
	protected Status status;
	protected Color color;

	public FigureDao(MyLocation location, double size, double direction) {
		this(location, size, direction, Status.STOP, Color.RED);
	}

	public FigureDao(MyLocation location, double size, double direction, Status status) {
		this(location, size, direction, status, Color.GREEN);
	}

	public FigureDao(MyLocation location, double size, double direction, Status status, Color color) {
		super(location);
		this.setSize(size);
		this.setDirection(direction);
		this.status = status;
		this.color = color;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public double getDirection() {
		return direction;
	}

	public void setDirection(double direction) {
		this.direction = direction;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
}
