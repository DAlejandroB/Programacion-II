package com.uptc.cristancho.triangle.gui.jMenuBar;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

/**
 * Clase MyJMenuBar, extiende de JMenuBar, encargada de crear el menu de
 * opciones principal de la aplicación
 * 
 * @author Fabian Alejandro Cristancho Rincón Fecha: 19/04/2018
 *
 */

public class MyJMenuBar extends JMenuBar {

	/**
	 * Constructor de la clase
	 */

	public MyJMenuBar() {
		super();
		init();
	}

	/**
	 * Inicia los componentes que irán dentro del JMenuBar
	 */

	private void init() {
		JMenu jMenuTriangle = new JMenu(Constant.MENU_TRIANGLE);
		JMenu jSubMenuNew = new JMenu(Constant.SUBMENU_TRIANGLE_NEW);
		jSubMenuNew.setMnemonic('C');
		jSubMenuNew.setToolTipText(Constant.DESCRIPTION_NEW);
		jSubMenuNew.setIcon(new ImageIcon(Constant.ICON_NEW));
		jSubMenuNew.add(new JMenuItem(Constant.ITEM_NEW_PROJECT));
		jSubMenuNew.add(new JMenuItem(Constant.ITEM_NEW_WORKSPACE));
		jSubMenuNew.add(new JMenuItem(Constant.ITEM_NEW_EXAMPLE));
		jSubMenuNew.add(new JMenuItem(Constant.ITEM_NEW_OTHER));
		jMenuTriangle.add(jSubMenuNew);

		JMenuItem jMenuItem = new JMenuItem(Constant.ITEM_TRIANGLE_OPEN, new ImageIcon(Constant.ICON_OPEN));
		jMenuItem.setAccelerator(KeyStroke.getKeyStroke(Constant.SHORCUT_OPEN));
		jMenuItem.setToolTipText(Constant.DESCRIPTION_OPEN);
		jMenuTriangle.add(jMenuItem);

		jMenuItem = new JMenuItem(Constant.ITEM_TRIANGLE_SAVE, new ImageIcon(Constant.ICON_SAVE));
		jMenuItem.setAccelerator(KeyStroke.getKeyStroke(Constant.SHORCUT_SAVE));
		jMenuItem.setToolTipText(Constant.DESCRIPTION_SAVE);
		jMenuTriangle.add(jMenuItem);

		jMenuItem = new JMenuItem(Constant.ITEM_TRIANGLE_SAVE_AS, new ImageIcon(Constant.ICON_SAVE_AS));
		jMenuItem.setAccelerator(KeyStroke.getKeyStroke(Constant.SHORCUT_SAVE_AS));
		jMenuItem.setToolTipText(Constant.DESCRIPTION_SAVE_AS);
		jMenuTriangle.add(jMenuItem);

		jMenuItem = new JMenuItem(Constant.ITEM_TRIANGLE_OPTIONS, new ImageIcon(Constant.ICON_OPTIONS));
		jMenuItem.setAccelerator(KeyStroke.getKeyStroke(Constant.SHORCUT_OPTIONS));
		jMenuItem.setToolTipText(Constant.DESCRIPTION_OPTIONS);
		jMenuTriangle.add(jMenuItem);

		jMenuItem = new JMenuItem(Constant.ITEM_TRIANGLE_CLONE, new ImageIcon(Constant.ICON_CLONE));
		jMenuItem.setAccelerator(KeyStroke.getKeyStroke(Constant.SHORCUT_CLONE));
		jMenuItem.setToolTipText(Constant.DESCRIPTION_CLONE);
		jMenuTriangle.add(jMenuItem);

		jMenuTriangle.addSeparator();

		JMenu jSubMenuExport = new JMenu(Constant.SUBMENU_TRIANGLE_EXPORT);
		jSubMenuExport.setIcon(new ImageIcon(Constant.ICON_EXPORT));
		jSubMenuExport.setToolTipText(Constant.DESCRIPTION_EXPORT);
		jSubMenuExport.add(new JMenuItem(Constant.ITEM_EXPORT_JPG, new ImageIcon(Constant.ICON_FORMAT_JPG)));
		jSubMenuExport.add(new JMenuItem(Constant.ITEM_EXPORT_PNG, new ImageIcon(Constant.ICON_FORMAT_PNG)));
		jSubMenuExport.add(new JMenuItem(Constant.ITEM_EXPORT_BMP, new ImageIcon(Constant.ICON_FORMAT_BMP)));
		jSubMenuExport.add(new JMenuItem(Constant.ITEM_EXPORT_GIF, new ImageIcon(Constant.ICON_FORMAT_GIF)));
		jSubMenuExport.add(new JMenuItem(Constant.ITEM_EXPORT_OTHER, new ImageIcon(Constant.ICON_FORMAT_OTHER)));
		jMenuTriangle.add(jSubMenuExport);

		jMenuTriangle.addSeparator();

		jMenuItem = new JMenuItem(Constant.ITEM_TRIANGLE_LANGUAJE, new ImageIcon(Constant.ICON_LANGUAGE));
		jMenuItem.setAccelerator(KeyStroke.getKeyStroke(Constant.SHORCUT_LANGUAGE));
		jMenuItem.setToolTipText(Constant.DESCRIPTION_LANGUAGE);
		jMenuTriangle.add(jMenuItem);

		jMenuTriangle.addSeparator();

		jMenuItem = new JMenuItem(Constant.ITEM_TRIANGLE_RESTART, new ImageIcon(Constant.ICON_RESTART));
		jMenuItem.setAccelerator(KeyStroke.getKeyStroke(Constant.SHORCUT_RESTART_TRIANGLE));
		jMenuItem.setToolTipText(Constant.DESCRIPTION_RESTART);
		jMenuTriangle.add(jMenuItem);

		jMenuItem = new JMenuItem(Constant.ITEM_TRIANGLE_EXIT, new ImageIcon(Constant.ICON_EXIT));
		jMenuItem.setAccelerator(KeyStroke.getKeyStroke(Constant.SHORCUT_EXIT));
		jMenuItem.setToolTipText(Constant.DESCRIPTION_EXIT);
		jMenuTriangle.add(jMenuItem);
		this.add(jMenuTriangle);

		JMenu jMenuArea = new JMenu(Constant.MENU_AREA);
		jMenuItem = new JMenuItem(Constant.ITEM_AREA_CALCULATE, new ImageIcon(Constant.ICON_TRIANGLE_AREA));
		jMenuItem.setAccelerator(KeyStroke.getKeyStroke(Constant.SHORCUT_CALCULATE_AREA));
		jMenuItem.setToolTipText(Constant.DESCRIPTION_AREA);
		jMenuArea.add(jMenuItem);

		jMenuArea.addSeparator();

		jMenuItem = new JMenuItem(Constant.ITEM_AREA_RESTART, new ImageIcon(Constant.ICON_TRIANGLE_RESET));
		jMenuItem.setAccelerator(KeyStroke.getKeyStroke(Constant.SHORCUT_RESTART_AREA));
		jMenuItem.setToolTipText(Constant.DESCRIPTION_RE_AREA);
		jMenuArea.add(jMenuItem);
		this.add(jMenuArea);

		JMenu jMenuHelp = new JMenu(Constant.MENU_HELP);
		jMenuItem = new JMenuItem(Constant.ITEM_HELP_GET_HELP, new ImageIcon(Constant.ICON_HELP));
		jMenuItem.setAccelerator(KeyStroke.getKeyStroke(Constant.SHORCUT_HELP));
		jMenuItem.setToolTipText(Constant.DESCRIPTION_HELP);
		jMenuHelp.add(jMenuItem);

		jMenuHelp.addSeparator();

		jMenuItem = new JMenuItem(Constant.ITEM_HELP_ABOUT, new ImageIcon(Constant.ICON_ABOUT));
		jMenuItem.setAccelerator(KeyStroke.getKeyStroke(Constant.SHORCUT_ABOUT));
		jMenuItem.setToolTipText(Constant.DESCRIPTION_ABOUT);
		jMenuHelp.add(jMenuItem);
		this.add(jMenuHelp);

		JMenu jMenuOptions = new JMenu(Constant.MENU_OPTIONS);
		jMenuItem = new JMenuItem(Constant.ITEM_OPTIONS_SETCOLOR_PANEL, new ImageIcon(Constant.ICON_CHANGE_COLOR));
		jMenuItem.setAccelerator(KeyStroke.getKeyStroke(Constant.SHORCUT_SETCOLOR_PANEL));
		jMenuItem.setToolTipText(Constant.DESCRIPTION_COLOR_OPTIONS);
		jMenuOptions.add(jMenuItem);

		jMenuItem = new JMenuItem(Constant.ITEM_OPTIONS_SETCOLOR_FIGURE, new ImageIcon(Constant.ICON_COLOR_TRIANGLE));
		jMenuItem.setAccelerator(KeyStroke.getKeyStroke(Constant.SHORCUT_SETCOLOR_FIGURE));
		jMenuItem.setToolTipText(Constant.DESCRIPTION_COLOR_OPTIONS);
		jMenuOptions.add(jMenuItem);

		jMenuItem = new JMenuItem(Constant.ITEM_OPTIONS_SETCOLOR_LINE_FIGURE,
				new ImageIcon(Constant.ICON_TBORDER_COLOR));
		jMenuItem.setAccelerator(KeyStroke.getKeyStroke(Constant.SHORCUT_SETCOLOR_LINE_FIGURE));
		jMenuItem.setToolTipText(Constant.DESCRIPTION_COLOR_OPTIONS);
		jMenuOptions.add(jMenuItem);

		jMenuOptions.addSeparator();

		jMenuItem = new JMenuItem(Constant.ITEM_OPTIONS_SIDES_MEASURE, new ImageIcon(Constant.ICON_MEASURE));
		jMenuItem.setAccelerator(KeyStroke.getKeyStroke(Constant.SHORCUT_SIDES_MEASURE));
		jMenuItem.setToolTipText(Constant.DESCRIPTION_MEASURE);
		jMenuOptions.add(jMenuItem);

		jMenuOptions.addSeparator();

		jMenuItem = new JMenuItem(Constant.ITEM_OPTIONS_SETFONT, new ImageIcon(Constant.ICON_FONT_TYPE));
		jMenuItem.setAccelerator(KeyStroke.getKeyStroke(Constant.SHORCUT_SETFONT));
		jMenuItem.setToolTipText(Constant.DESCRIPTION_FONT);
		jMenuOptions.add(jMenuItem);

		jMenuItem = new JMenuItem(Constant.ITEM_OPTIONS_SETCOLOR_FONT, new ImageIcon(Constant.ICON_FONT_COLOR));
		jMenuItem.setAccelerator(KeyStroke.getKeyStroke(Constant.SHORCUT_SETCOLOR_FONT));
		jMenuItem.setToolTipText(Constant.DESCRIPTION_COLOR_OPTIONS);
		jMenuOptions.add(jMenuItem);
		this.add(jMenuOptions);

		JMenu jMenuFunctionalities = new JMenu(Constant.MENU_FUNCTIONALITIES);
		jMenuItem = new JMenuItem(Constant.ITEM_FUNCTIONALITIES_ZOOM, new ImageIcon(Constant.ICON_ZOOM));
		jMenuItem.setAccelerator(KeyStroke.getKeyStroke(Constant.SHORTCUT_FUNCTIONALITIES_ZOOM));
		jMenuItem.setToolTipText(Constant.DESCRIPTION_ZOOM);
		jMenuFunctionalities.add(jMenuItem);

		jMenuItem = new JMenuItem(Constant.ITEM_FUNCTIONALITIES_SIZE_WORKAREA,
				new ImageIcon(Constant.ICON_SIZE_WORKSPACE));
		jMenuItem.setAccelerator(KeyStroke.getKeyStroke(Constant.SHORTCUT_FUNCTIONALITIES_SIZE_WORKAREA));
		jMenuItem.setToolTipText(Constant.DESCRIPTION_SIZE_WORKAREA);
		jMenuFunctionalities.add(jMenuItem);

		jMenuItem = new JMenuItem(Constant.ITEM_FUNCTIONALITIES_ROTATE, new ImageIcon(Constant.ICON_ROTATE_TRIANGLE));
		jMenuItem.setAccelerator(KeyStroke.getKeyStroke(Constant.SHORTCUT_FUNCTIONALITIES_ROTATE));
		jMenuItem.setToolTipText(Constant.DESCRIPTION_ROTATE);
		jMenuFunctionalities.add(jMenuItem);

		jMenuItem = new JMenuItem(Constant.ITEM_FUNCTIONALITIES_TRANSLATE,
				new ImageIcon(Constant.ICON_TRASLATE_TRIANGLE));
		jMenuItem.setAccelerator(KeyStroke.getKeyStroke(Constant.SHORTCUT_FUNCTIONALITIES_TRANSLATE));
		jMenuItem.setToolTipText(Constant.DESCRIPTION_TRANSLATE);
		jMenuFunctionalities.add(jMenuItem);
		this.add(jMenuFunctionalities);
	}

}
