package view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;

import controller.CounterListener;
import models.Commands;

public class MyToolBar extends JToolBar{
	private static final long serialVersionUID = 1L;
	private JButton playButton;
	private JButton pauseButton;
	private JButton stopButton;
	
	public MyToolBar(CounterListener c, int id) {
		super();
		playButton = new JButton();
		pauseButton = new JButton();
		stopButton = new JButton();
		init(c, id);
	}
	private void init(CounterListener c, int id) {
		
		stopButton.setEnabled(false);
		pauseButton.setEnabled(false);
		
		JButton clearButton = new JButton();
		playButton.setIcon(new ImageIcon("src/res/play.png"));
		pauseButton.setIcon(new ImageIcon("src/res/pause.png"));
		stopButton.setIcon(new ImageIcon("src/res/stop.png"));
		clearButton.setIcon(new ImageIcon("src/res/clear.png"));
		playButton.setActionCommand(Commands.COMMAND_PLAY+""+id);
		playButton.setToolTipText("Play"+id);
		pauseButton.setActionCommand(Commands.COMMAND_PAUSE+""+id);
		pauseButton.setToolTipText("Pause");
		stopButton.setActionCommand(Commands.COMMAND_STOP+""+id);
		stopButton.setToolTipText("Stop");
		clearButton.setActionCommand(Commands.COMMAND_CLEAR+""+id);
		clearButton.setToolTipText("Clear");
		playButton.addActionListener(c);
		pauseButton.addActionListener(c);
		stopButton.addActionListener(c);
		clearButton.addActionListener(c);
		add(playButton);
		add(pauseButton);
		add(stopButton);
		add(clearButton);
	}
	
	public void setPlayButtonEnabled(boolean b) {
		this.playButton.setEnabled(b);
	}
	
	public void setFinishButtonEnabled(boolean b) {
		this.stopButton.setEnabled(b);
	}
	
	public void setPauseButtonEnabled(boolean b) {
		this.pauseButton.setEnabled(b);
	}
}
