package com.afcr.area.gui.splash;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import com.afcr.area.controller.TriangleListener;
import com.afcr.area.gui.MyWindow;
import com.afcr.area.gui.constants.Commands;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.io.File;
import java.util.ArrayList;

public class Splash extends JFrame implements Runnable {

	private JProgressBar jProgressBar;
	private JLabel progressLabel;
	private ArrayList<String> pathFiles;

	public Splash() {
		super();
		this.jProgressBar = new JProgressBar(JProgressBar.HORIZONTAL, 0, 100);
		this.progressLabel = new JLabel();
		this.pathFiles = new ArrayList<>();
		this.init();
	}

	private void init() {
		JLabel splashLabel = new JLabel(new ImageIcon(this.getClass().getResource("/res/images/splash.gif")));

		JPanel closeJPanel = new JPanel();
		JButton closeJButton = new JButton("X");

		JPanel progressPanel = new JPanel(new BorderLayout());

		splashLabel.setLayout(new BorderLayout());

		closeJPanel.setLayout(new BorderLayout());
		closeJPanel.setOpaque(false);

		closeJButton.setForeground(Color.white);
		closeJButton.setOpaque(false);
		closeJButton.setContentAreaFilled(false);
		closeJButton.setBorderPainted(false);
		closeJButton.addActionListener(TriangleListener.getInstance());
		closeJButton.setActionCommand(Commands.CLOSE.toString());

		this.progressLabel.setForeground(Color.white);
		this.progressLabel.setOpaque(false);
		this.progressLabel.setHorizontalAlignment(JLabel.CENTER);

		this.jProgressBar.setStringPainted(true);
		this.jProgressBar.setPreferredSize(new Dimension(0, 15));

		closeJPanel.add(closeJButton, BorderLayout.EAST);

		progressPanel.setOpaque(false);

		progressPanel.add(this.jProgressBar, BorderLayout.NORTH);
		progressPanel.add(this.progressLabel, BorderLayout.SOUTH);

		splashLabel.add(closeJPanel, BorderLayout.NORTH);
		splashLabel.add(progressPanel, BorderLayout.SOUTH);

		this.add(splashLabel);

		this.setIconImage(new ImageIcon(this.getClass().getResource("/res/images/app_icon.png")).getImage());
		this.setUndecorated(true);
		this.setSize(320, 180);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setBackground(new Color(45, 116, 181));
	}

	private int calculateFiles(File file) {
		int counterFiles = 0;
		for (int i = 0; i < file.listFiles().length; i++) {
			if (file.listFiles()[i].isDirectory()) {
				counterFiles += calculateFiles(file.listFiles()[i]);
			} else {
				this.pathFiles.add(file.listFiles()[i].getPath());
				counterFiles++;
			}
		}
		return counterFiles;
	}

	@Override
	public void run() {
		int i = 0;
		while (i <= 100) {
			int counterFiles = calculateFiles(new File("src/res"));
			this.jProgressBar.setValue(i);
			this.progressLabel.setText(this.pathFiles.get(i * counterFiles / 100));
			i++;
			try {
				Thread.sleep((1 * counterFiles));
			} catch (InterruptedException e) {
			}
		}
		this.dispose();
		new MyWindow();
	}
}