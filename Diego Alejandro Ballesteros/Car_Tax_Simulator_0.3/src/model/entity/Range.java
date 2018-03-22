package model.entity;
import java.io.Serializable;
public class Range implements Serializable{
	private int min,max;
	private double percentage;
	
	public Range (int min,int max, double percentage){
		this.max=max;
	}
	public Range() {
		
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public String toString() {
		return "min: "+min + "max: " + max + "per: " + percentage;
	}
}
