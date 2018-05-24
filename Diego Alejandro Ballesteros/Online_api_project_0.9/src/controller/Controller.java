package controller;
import persistence.*;
import java.io.File;
import java.util.ArrayList;
import java.awt.event.*;
import com.fasterxml.jackson.core.JsonFactory;
import model.entity.*;
import view.Window;

public class Controller implements ActionListener{
	Window window = new Window();
	ArrayList<Episode> episodes;
	public void start() {
	//	ConnectionReader.createFile();
		try {
			JSonFileReader.parseJSON(new JsonFactory().createParser(new File("data.json")));
			episodes = JSonFileReader.episodes;
		}catch(Exception e) {
			e.printStackTrace();
		}
		window.initPanels(episodes.get(episodes.size()-1).getSeason());
		
		for(Episode e :JSonFileReader.episodes) {
			window.generateEpisodeButton(e.getSeason(), e.getNumber(), e.getName(),this);
		}
		window.setShowName(JSonFileReader.show.getName());
		window.setShowSummary(JSonFileReader.show.getSummary());
		window.init();
	}
	public void actionPerformed(ActionEvent e) {
		String selection[] = e.getActionCommand().split("_");
		if(selection[0].equals("openepisode")) {
			int season = Integer.parseInt(selection[1]);
			int number = Integer.parseInt(selection[2]);
			for(int i = 0; i < episodes.size(); i++) {
				if(episodes.get(i).getSeason() == season && episodes.get(i).getNumber() == number)
				window.createWindowEpisode(episodes.get(i));
			}
		}
	}
}
