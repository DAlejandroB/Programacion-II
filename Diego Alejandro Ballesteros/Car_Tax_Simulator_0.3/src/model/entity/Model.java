package model.entity;
import java.io.Serializable;
public class Model implements Serializable{
	private String name;
	private int cost;
	
	public Model() {
		
	}
	public Model(String name, int cost) {
		this.name = name;
		this.cost = cost;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	public int getCost() {
		return this.cost;
	}
}
