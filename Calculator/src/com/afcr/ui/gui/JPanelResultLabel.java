package com.afcr.ui.gui;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;

public class JPanelResultLabel extends JPanel {
	private static final long serialVersionUID = 1L;

	public JPanelResultLabel() {
		super();
		init();
	}

	private void init() {
		this.setPreferredSize(new Dimension(370,52));
		JLabel jLabel = new JLabel("0", JLabel.RIGHT);
		jLabel.setOpaque(false);
		jLabel.setPreferredSize(new Dimension(370,52));
		jLabel.setFont(new Font("Consolas", Font.PLAIN, 24));
		this.setBorder(
				new CompoundBorder(
						BorderFactory.createEmptyBorder(0, 0, 2, 0), 
						BorderFactory.createLineBorder(MyColor.WINDOWS_SEVEN_BORDER)));
		this.setBackground(MyColor.WINDOWS_SEVEN_APPS);
		this.add(jLabel);
	}

}
