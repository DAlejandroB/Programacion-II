package view;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import model.entity.Episode;

public class Window extends JFrame{
	private static final long serialVersionUID = 1L;
	private PanelEpisodes panelEpisodes[];
	private JLabel showName;
	private JLabel showSummary;
	public void setShowSummary(String showSummary) {
		this.showSummary = new JLabel("<html>"+showSummary+"</html>");
	}
	public Window(/*Controller controller*/) {
		super();
	}
	public void init() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setContentPane(new JLabel(new ImageIcon("C:/Users/Diego/Downloads/background.jpg")));
		setLayout(new BorderLayout());
		showName.setFont(new Font ("Century Gothic", Font.BOLD, 48));
		showName.setForeground(Color.BLACK);
		JPanel panelSeasons = new JPanel();
		panelSeasons.setLayout(new GridLayout(3,1));
		for(int i = 0; i < panelEpisodes.length;i++) {
			panelSeasons.add(panelEpisodes[i]);
		}
		JPanel panelInfo = new JPanel();
		panelInfo.setLayout(new GridLayout(2,1));
		panelInfo.add(showName);
		panelInfo.add(showSummary);
		add(panelInfo,BorderLayout.NORTH);
		add(panelSeasons,BorderLayout.CENTER);
		add(new JLabel("           "),BorderLayout.EAST);
		add(new JLabel("           "),BorderLayout.WEST);
		setVisible(true);
		setSize(679,999);
		setSize(680,1000);
	}
	public void setShowName(String name) {
		showName = new JLabel(name);
	}
	public void initPanels(short number) {
		panelEpisodes = new PanelEpisodes[number];
		for(int i = 0; i < panelEpisodes.length; i ++) {
			panelEpisodes[i] = new PanelEpisodes(12);
		}
	}
	public void generateEpisodeButton(int season, int number ,String name, ActionListener l) {
		JButton button = new JButton("("+season+"-"+number+")"+name);
		button.setActionCommand("openepisode_" + season + "_" + number);
		button.addActionListener(l);
		panelEpisodes[season-1].add(button);
	}
	public void createWindowEpisode(Episode e) {
		EpisodeWindow subWindow = new EpisodeWindow();
		subWindow.setName("(" + e.getSeason() + "-" + e.getNumber() + ") "+ e.getName());
		subWindow.setSummary(e.getSummary());
		subWindow.init();
	}
}
