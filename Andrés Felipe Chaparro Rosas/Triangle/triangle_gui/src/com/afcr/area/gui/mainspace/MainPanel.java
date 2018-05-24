package com.afcr.area.gui.mainspace;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JPanel;

import com.afcr.area.gui.constants.ConstantsGUI_ES;


public class MainPanel extends JPanel {
	private MyJToolBar jToolBar;
	private SidesToolBar sidesToolBar;
	private WorkAreaPanel workAreaPanel;
	private MyStatusBar myStatusBar;
	
	public MainPanel() {
		this.jToolBar = new MyJToolBar();
		this.sidesToolBar = new SidesToolBar(
				new String[] { ConstantsGUI_ES.SIDE_A, ConstantsGUI_ES.SIDE_B, ConstantsGUI_ES.SIDE_C });
		this.workAreaPanel = new WorkAreaPanel();
		this.myStatusBar = new MyStatusBar();
		this.init();
	}

	private void init() {
		this.setLayout(new BorderLayout());
		JPanel jPanel = new JPanel(new GridLayout(2, 1));
		jPanel.add(this.jToolBar, BorderLayout.NORTH);
		jPanel.add(this.sidesToolBar, BorderLayout.NORTH);
		this.add(jPanel, BorderLayout.NORTH);
		this.add(this.workAreaPanel, BorderLayout.CENTER);
		this.add(this.myStatusBar, BorderLayout.SOUTH);
	}

	
	public MyStatusBar getMyStatusBar() {
		return this.myStatusBar;
	}
	
	public WorkAreaPanel getWorkAreaPanel() {
		return this.workAreaPanel;
	}

    public SidesToolBar getSidesToolBar() {
        return this.sidesToolBar;
    }
}
