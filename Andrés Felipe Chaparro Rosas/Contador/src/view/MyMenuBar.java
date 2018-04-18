package view;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import controller.CounterListener;

public class MyMenuBar extends JMenuBar{
	private static final long serialVersionUID = 1L;
	private JMenu jMenu;
	
	public MyMenuBar(CounterListener c) {
		super();
		jMenu = new JMenu("Contadores");
		init(c);
	}
	
	private void init(CounterListener c) {
		JMenuItem addItem = new JMenuItem("Agregar contador");
		JMenuItem deleteItem = new JMenuItem("Borrar contador");
		addItem.addActionListener(c);
		deleteItem.addActionListener(c);
		addItem.setActionCommand("COMMAND_ADDITEM");
		deleteItem.setActionCommand("COMMAND_DELETEITEM");
		jMenu.add(addItem);
		jMenu.add(deleteItem);
		add(jMenu);
	}
}
