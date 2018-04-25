package com.uptc.cristancho.triangle.gui.jMenuBar;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.KeyStroke;

/**
 * Clase MyMenuOnPanel, se encarga de crear el menú emergente que irá dentro del
 * espacio de trabajo de la aplicación
 * 
 * @author Fabian Alejandro Cristancho Rincón Fecha: 19/04/2018
 *
 */

public class MyMenuOnPanel extends JPanel {

	private JPopupMenu jPopupMenu;

	/**
	 * Constructor de la clase
	 */

	public MyMenuOnPanel() {
		super();
		this.jPopupMenu = new JPopupMenu();
		init();
	}

	/**
	 * Inicia los componentes necesarios para poder crear el menú emergente
	 */

	private void init() {

		JMenu jMenuArea = new JMenu(Constant.MENU_AREA);
		JMenuItem jMenuItemArea = new JMenuItem(Constant.ITEM_AREA_CALCULATE,
				new ImageIcon(Constant.ICON_TRIANGLE_AREA));
		jMenuItemArea.setToolTipText(Constant.DESCRIPTION_AREA);
		jMenuItemArea.setAccelerator(KeyStroke.getKeyStroke(Constant.SHORCUT_CALCULATE_AREA));
		jMenuArea.add(jMenuItemArea);

		jMenuItemArea = new JMenuItem(Constant.ITEM_AREA_RESTART, new ImageIcon(Constant.ICON_TRIANGLE_RESET));
		jMenuItemArea.setToolTipText(Constant.DESCRIPTION_RE_AREA);
		jMenuItemArea.setAccelerator(KeyStroke.getKeyStroke(Constant.SHORCUT_RESTART_AREA));
		jMenuArea.add(jMenuItemArea);
		this.jPopupMenu.add(jMenuArea);

		JMenu jMenuOptions = new JMenu(Constant.MENU_OPTIONS);
		JMenuItem jMenuItemOptions = new JMenuItem(Constant.ITEM_OPTIONS_SETCOLOR_FIGURE,
				new ImageIcon(Constant.ICON_COLOR_TRIANGLE));
		jMenuItemOptions.setToolTipText(Constant.DESCRIPTION_COLOR_OPTIONS);
		jMenuItemOptions.setAccelerator(KeyStroke.getKeyStroke(Constant.SHORCUT_SETCOLOR_FIGURE));
		jMenuOptions.add(jMenuItemOptions);

		jMenuItemOptions = new JMenuItem(Constant.ITEM_OPTIONS_SETCOLOR_LINE_FIGURE,
				new ImageIcon(Constant.ICON_TBORDER_COLOR));
		jMenuItemOptions.setToolTipText(Constant.ITEM_OPTIONS_SETCOLOR_PANEL);
		jMenuItemOptions.setAccelerator(KeyStroke.getKeyStroke(Constant.SHORCUT_SETCOLOR_LINE_FIGURE));
		jMenuOptions.add(jMenuItemOptions);

		jMenuItemOptions = new JMenuItem(Constant.ITEM_OPTIONS_SETCOLOR_PANEL,
				new ImageIcon(Constant.ICON_CHANGE_COLOR));
		jMenuItemOptions.setToolTipText(Constant.ITEM_OPTIONS_SETCOLOR_PANEL);
		jMenuItemOptions.setAccelerator(KeyStroke.getKeyStroke(Constant.SHORCUT_SETCOLOR_PANEL));
		jMenuOptions.add(jMenuItemOptions);

		jMenuItemOptions = new JMenuItem(Constant.ITEM_OPTIONS_SETFONT, new ImageIcon(Constant.ICON_FONT_TYPE));
		jMenuItemOptions.setToolTipText(Constant.DESCRIPTION_FONT);
		jMenuItemOptions.setAccelerator(KeyStroke.getKeyStroke(Constant.SHORCUT_SETFONT));
		jMenuOptions.add(jMenuItemOptions);

		jMenuItemOptions = new JMenuItem(Constant.ITEM_OPTIONS_SETCOLOR_FONT, new ImageIcon(Constant.ICON_FONT_COLOR));
		jMenuItemOptions.setToolTipText(Constant.DESCRIPTION_COLOR_OPTIONS);
		jMenuItemOptions.setAccelerator(KeyStroke.getKeyStroke(Constant.SHORCUT_SETCOLOR_FONT));
		jMenuOptions.add(jMenuItemOptions);

		jMenuItemOptions = new JMenuItem(Constant.ITEM_OPTIONS_SIDES_MEASURE, new ImageIcon(Constant.ICON_MEASURE));
		jMenuItemOptions.setToolTipText(Constant.DESCRIPTION_MEASURE);
		jMenuItemOptions.setAccelerator(KeyStroke.getKeyStroke(Constant.SHORCUT_SIDES_MEASURE));
		jMenuOptions.add(jMenuItemOptions);
		this.jPopupMenu.add(jMenuOptions);

		JMenu jMenuFunctionalities = new JMenu(Constant.MENU_FUNCTIONALITIES);
		JMenuItem jMenuItemFunctionalities = new JMenuItem(Constant.ITEM_FUNCTIONALITIES_ZOOM,
				new ImageIcon(Constant.ICON_ZOOM));
		jMenuItemFunctionalities.setToolTipText(Constant.DESCRIPTION_ZOOM);
		jMenuItemFunctionalities.setAccelerator(KeyStroke.getKeyStroke(Constant.SHORTCUT_FUNCTIONALITIES_ZOOM));
		jMenuFunctionalities.add(jMenuItemFunctionalities);

		jMenuItemFunctionalities = new JMenuItem(Constant.ITEM_FUNCTIONALITIES_SIZE_WORKAREA,
				new ImageIcon(Constant.ICON_SIZE_WORKSPACE));
		jMenuItemFunctionalities.setToolTipText(Constant.DESCRIPTION_SIZE_WORKAREA);
		jMenuItemFunctionalities
				.setAccelerator(KeyStroke.getKeyStroke(Constant.SHORTCUT_FUNCTIONALITIES_SIZE_WORKAREA));
		jMenuFunctionalities.add(jMenuItemFunctionalities);

		jMenuItemFunctionalities = new JMenuItem(Constant.ITEM_FUNCTIONALITIES_ROTATE,
				new ImageIcon(Constant.ICON_ROTATE_TRIANGLE));
		jMenuItemFunctionalities.setToolTipText(Constant.DESCRIPTION_ROTATE);
		jMenuItemFunctionalities.setAccelerator(KeyStroke.getKeyStroke(Constant.SHORTCUT_FUNCTIONALITIES_ROTATE));
		jMenuFunctionalities.add(jMenuItemFunctionalities);
		this.jPopupMenu.add(jMenuFunctionalities);

		jMenuItemFunctionalities = new JMenuItem(Constant.ITEM_FUNCTIONALITIES_TRANSLATE,
				new ImageIcon(Constant.ICON_TRASLATE_TRIANGLE));
		jMenuItemFunctionalities.setToolTipText(Constant.DESCRIPTION_TRANSLATE);
		jMenuItemFunctionalities.setAccelerator(KeyStroke.getKeyStroke(Constant.SHORTCUT_FUNCTIONALITIES_TRANSLATE));
		jMenuFunctionalities.add(jMenuItemFunctionalities);

		this.setComponentPopupMenu(this.jPopupMenu);
	}
}
