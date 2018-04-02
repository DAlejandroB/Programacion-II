package view;

import java.awt.BorderLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class MainWindow extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MainWindow() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setExtendedState(MAXIMIZED_BOTH);
		setTitle("Personas: Soluciones Financieras para Ti");
		
		Image icon = new ImageIcon(getClass().getResource("/images/Bancolombia.png")).getImage();
		setIconImage(icon);
		
		OrderPanel panel = new OrderPanel();
		JScrollPane jsp = new JScrollPane();
		jsp.setViewportView(panel);
		add(jsp, BorderLayout.CENTER);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MainWindow();
	}
}
