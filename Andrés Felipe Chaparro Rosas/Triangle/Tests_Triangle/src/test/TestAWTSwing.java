package test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.JSpinner;

public class TestAWTSwing {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Frame");
		frame.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		frame.setLayout(new BorderLayout());
//		frame.setSize(400, 200);
//		frame.setLocation(
//				((int)Toolkit.getDefaultToolkit().getScreenSize().getWidth()-frame.getWidth())/2, 
//				((int)Toolkit.getDefaultToolkit().getScreenSize().getHeight()-frame.getHeight())/2);
		JPanel panel = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel(new FlowLayout());
		panel.setBackground(Color.red);
		panel2.setBackground(Color.blue);
		panel3.setBackground(Color.green);
		panel4.setBackground(Color.yellow);
		panel.setPreferredSize(new Dimension(100,100));
		panel2.setPreferredSize(new Dimension(100,100));
		panel3.setPreferredSize(new Dimension(100,100));
		panel4.setPreferredSize(new Dimension(100,100));
		panel5.add(new JButton());
		panel5.add(new JRadioButton());
		panel5.add(new JCheckBox());
		panel5.add(new JSlider(0,100));
		panel5.add(new JScrollBar());
		panel5.add(new JComboBox<>());
		panel5.add(new JSpinner());
		JMenuBar menubar = new JMenuBar();
		JMenu menuAyuda = new JMenu("Ayuda");
		JMenu menuEdicion = new JMenu("Edicion");
		JMenu menuVer = new JMenu("Ver");
		menuVer.add(new JMenuItem("Estandar"));
		menuVer.add("Cientifica");
		menuVer.add("Programador");
		menuVer.addSeparator();
		menubar.add(menuVer);
		menubar.add(menuEdicion);
		menubar.add(menuAyuda);
		frame.add(panel, BorderLayout.WEST);
		frame.add(menubar, BorderLayout.NORTH);
		frame.add(panel3, BorderLayout.SOUTH);
		frame.add(panel4,BorderLayout.EAST);
		frame.add(panel5, BorderLayout.CENTER);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
