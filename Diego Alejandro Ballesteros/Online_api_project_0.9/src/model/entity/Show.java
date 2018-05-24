package model.entity;

import java.util.ArrayList;

public class Show {
	private String name;
	private ArrayList<String> genre = new ArrayList<String>();
	private ArrayList<Episode> episodes = new ArrayList<Episode>();
	private String summary;
	
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void addGenre(String genre) {
		this.genre.add(genre);
	}
	public void setEpisodes(ArrayList<Episode> episodes) {
		this.episodes = episodes;
	}
	public String getSummary() {
		return summary;
	}
	public String getName() {
		return name;
	}
	public ArrayList<String> getGenre() {
		return genre;
	}
	@Override
	public String toString() {
		return "Name: " + name + "\nGenre: " + genre + "\nSummary: " + summary +"\n"+ episodes;
	}
}
