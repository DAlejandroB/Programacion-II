package com.afcr.graphics.gui;

import java.awt.BorderLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;

/**
 * Clase JFrameAppGraphic
 * 
 * @author Andrés Felipe
 *
 */
public class JFrameAppGraphic extends JFrame {

	private static final long serialVersionUID = 1L;

	private JMenuBarAppGraphic jMenuBarAppGraphic;
	private JToolBarAppGraphic jToolBarAppGraphic;
	private JPanelWorkArea jPanelWorkArea;
	private JPanelStatusBar jPanelStatusBar;

	/**
	 * Constructor que inicializa el formato del cuadro y el atributo figure
	 * 
	 * @param figure
	 */
	public JFrameAppGraphic(Figure[] figures) {
		super(Constants.APP_NAME);
		this.jMenuBarAppGraphic = new JMenuBarAppGraphic();
		this.jToolBarAppGraphic = new JToolBarAppGraphic();
		this.jPanelWorkArea = new JPanelWorkArea(figures);
		this.jPanelStatusBar = new JPanelStatusBar();
		init();
	}

	private void init() {
		this.setLayout(new BorderLayout());
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		this.setJMenuBar(jMenuBarAppGraphic);
		this.add(jToolBarAppGraphic, BorderLayout.NORTH);
		this.add(jPanelWorkArea, BorderLayout.CENTER);
		this.add(jPanelStatusBar, BorderLayout.SOUTH);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public JPanelWorkArea getjPanelWorkArea() {
		return jPanelWorkArea;
	}
}
