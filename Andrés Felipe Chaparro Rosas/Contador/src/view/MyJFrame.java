package view;
import java.awt.BorderLayout;

import javax.swing.JFrame;

import controller.CounterListener;

public class MyJFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private MainJPanel jPanel;
	private MyToolBar toolBar;
	private MyMenuBar myMenuBar;
	
	public MyJFrame(CounterListener c) {
		this.jPanel = new MainJPanel(c) ;
		this.toolBar = new MyToolBar(c,0);
		this.myMenuBar = new MyMenuBar(c);
		this.init();
	}

	private void init() {
		this.setTitle("Contadores");
		this.setLayout(new BorderLayout());
		this.setSize(640, 360);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.add(jPanel, BorderLayout.CENTER);
		this.add(toolBar,BorderLayout.NORTH);
		this.setJMenuBar(myMenuBar);
	}
	
	public MainJPanel getjPanel() {
		return jPanel;
	}
	
	public MyToolBar getToolBar() {
		return toolBar;
	}
}
