package view;
import javax.swing.*;
import java.awt.GridLayout;
public class EpisodeWindow extends JDialog{
	private static final long serialVersionUID = 1l;
	private JLabel name;
	private JLabel summary;
	
	public void setName(String name) {
		this.name = new JLabel(name);
	}
	public void setSummary(String summary) {
		this.summary = new JLabel("<html>" + summary + "</html>");
	}
	public void init() {
		setSize(200,200);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2,1));
		add(name);
		add(summary);
		setResizable(false);
		setVisible(true);
	}
}
