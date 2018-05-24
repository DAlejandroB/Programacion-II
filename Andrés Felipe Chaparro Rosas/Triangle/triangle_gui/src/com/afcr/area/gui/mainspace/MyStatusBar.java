package com.afcr.area.gui.mainspace;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

import com.afcr.area.controller.TriangleListener;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class MyStatusBar extends JPanel{
	private JLabel iconMoveLabel;
	private JLabel messageMoveLabel;
	private JSlider zoomSlider;
	private JLabel porcentZoomLabel;
	private JLabel statusLabel;
	public MyStatusBar() {
		super();
		this.iconMoveLabel = new JLabel(new ImageIcon("src/res/images/move_icon.png"));
		this.messageMoveLabel= new JLabel();
		this.zoomSlider=new JSlider(1, 200, 100);
		this.porcentZoomLabel= new JLabel(zoomSlider.getValue()+"%");
		this.statusLabel= new JLabel();
		init();
	}
	
	private void init() {
		zoomSlider.addChangeListener(TriangleListener.getInstance());
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{25, 100, 125, 50, 200};
		setLayout(gridBagLayout);
		
		GridBagConstraints gbc_iconMoveLabel = new GridBagConstraints();
		gbc_iconMoveLabel.insets = new Insets(0, 0, 0, 5);
		gbc_iconMoveLabel.gridx = 0;
		gbc_iconMoveLabel.gridy = 0;
		add(iconMoveLabel, gbc_iconMoveLabel);
		
		GridBagConstraints gbc_messageMoveLabel = new GridBagConstraints();
		gbc_messageMoveLabel.insets = new Insets(0, 0, 0, 5);
		gbc_messageMoveLabel.gridx = 1;
		gbc_messageMoveLabel.gridy = 0;
		add(messageMoveLabel, gbc_messageMoveLabel);
		
		GridBagConstraints gbc_statusLabel = new GridBagConstraints();
		gbc_statusLabel.insets = new Insets(0, 0, 0, 5);
		gbc_statusLabel.gridy = 0;
		gbc_statusLabel.gridx = 2;
		add(statusLabel, gbc_statusLabel);
		
		GridBagConstraints gbc_porcentZoomLabel = new GridBagConstraints();
		gbc_porcentZoomLabel.insets = new Insets(0, 0, 0, 5);
		gbc_porcentZoomLabel.gridx = 3;
		gbc_porcentZoomLabel.gridy = 0;
		add(porcentZoomLabel, gbc_porcentZoomLabel);
		
		GridBagConstraints gbc_zoomSlider = new GridBagConstraints();
		gbc_zoomSlider.gridx = 4;
		gbc_zoomSlider.gridy = 0;
		add(zoomSlider, gbc_zoomSlider);
	}
	
	public void setMessageToMoveLabel(String text) {
		this.messageMoveLabel.setText(text);
	}
	
	public void setValueToPorcentLabel(int text) {
		this.porcentZoomLabel.setText(text+"%");
	}
	
	public void setMessageToStatusLabel(String text) {
		this.statusLabel.setText(text);
	}
	
	public JSlider getZoomSlider() {
		return zoomSlider;
	}
}
