package model.entity;

public class Episode {
	private String name;
	private short season;
	private short number;
	private String summary;
	
	public Episode(String name) {
		this.name = name;
	}
	public Episode() {
		
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public void setSeason(short season) {
		this.season = season;
	}
	public void setNumber(short number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public short getSeason() {
		return season;
	}
	public String getSummary() {
		return summary;
	}
	public short getNumber() {
		return number;
	}
	@Override
	public String toString() {
		return ("(" + season +"-"+ number +") "+name+"\n Summary: " + summary + "\n"); 
	}
}
