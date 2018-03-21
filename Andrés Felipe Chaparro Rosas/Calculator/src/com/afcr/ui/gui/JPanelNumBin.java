package com.afcr.ui.gui;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;

public class JPanelNumBin extends JPanel {
	private static final long serialVersionUID = 1L;
	private JLabel[] labels;

	public JPanelNumBin() {
		super();
		labels = new JLabel[32];
		init();
	}

	private void init() {
		this.setLayout(new GridLayout(4, 8));
		this.setPreferredSize(new Dimension(1, 69));
		addLabels(0, 8, "0000");
		add1Labels();
		addLabels(16, 24, "0000");
		add2Labels();
		this.setBackground(MyColor.WINDOWS_SEVEN_APPS);
		this.setBorder(new CompoundBorder(BorderFactory.createEmptyBorder(3, 0, 5, 0),
				BorderFactory.createLineBorder(MyColor.WINDOWS_SEVEN_BORDER)));
	}

	private void add1Labels() {
		labels[8]=new JLabel("63  ",  JLabel.CENTER);
		labels[8].setFont(new Font("Consolas", Font.PLAIN, 12));
		this.add(labels[8]);
		this.add(new JLabel());
		this.add(new JLabel());
		this.add(new JLabel());
		labels[12]=new JLabel("47  ",  JLabel.CENTER);
		labels[12].setFont(new Font("Consolas", Font.PLAIN, 12));
		this.add(labels[12]);
		this.add(new JLabel());
		this.add(new JLabel());
		labels[15]=new JLabel("32  ",  JLabel.CENTER);
		labels[15].setFont(new Font("Consolas", Font.PLAIN, 12));
		this.add(labels[15]);
	}
	
	private void add2Labels() {
		labels[24]=new JLabel("31  ",  JLabel.CENTER);
		labels[24].setFont(new Font("Consolas", Font.PLAIN, 12));
		this.add(labels[24]);
		this.add(new JLabel());
		this.add(new JLabel());
		this.add(new JLabel());
		labels[28]=new JLabel("15  ",  JLabel.CENTER);
		labels[28].setFont(new Font("Consolas", Font.PLAIN, 12));
		this.add(labels[28]);
		this.add(new JLabel());
		this.add(new JLabel());
		labels[31]=new JLabel("   0", JLabel.CENTER);
		labels[31].setFont(new Font("Consolas", Font.PLAIN, 12));
		this.add(labels[31]);
		
	}

	private void addLabels(int start, int end, String text) {
		for (int i = start; i < end; i++) {
			labels[i] = new JLabel(text, JLabel.CENTER);
			labels[i].setFont(new Font("Consolas", Font.PLAIN, 12));
			this.add(labels[i]);
		}
	}
	
}
