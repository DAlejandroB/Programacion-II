package test;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyJFrame extends JFrame{
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		new MyJFrame();
	}
	
	public MyJFrame() {
		super();
		init();
	}
	
	private void init() {
		setLayout(new GridLayout(7,7));
		setSize(640,480);
		MyJPanel[] panels = new MyJPanel[49]; 
		for (int i = 0; i < panels.length; i++) {
			panels[i]= new MyJPanel();
			if((i%2==0)&(i!=8)&(i!=10)&(i!=12)&(i!=22)&(i!=26)&(i!=36)&(i!=38)&(i!=40)) {
				add(panels[i].setMyBrackground(Color.red));
			}else {
				add(panels[i].setMyBrackground(Color.white));
			}
		}
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}

class MyJPanel extends JPanel{
	private static final long serialVersionUID = 1L;
	public MyJPanel() {
		super();
		setVisible(true);
	}
	public MyJPanel setMyBrackground(Color red) {
		setBackground(red);
		return this;
	}
	
}