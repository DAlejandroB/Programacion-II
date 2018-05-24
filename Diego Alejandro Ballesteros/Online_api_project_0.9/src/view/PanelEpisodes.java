package view;
import java.awt.GridLayout;

import javax.swing.*;
public class PanelEpisodes extends JPanel{
	private static final long serialVersionUID = 1l;
	public PanelEpisodes(int episodesCount) {
		setLayout(new GridLayout(episodesCount/2,2));
	}
}
