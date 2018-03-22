package com.afcr.intersection.ui.commandlines;

import com.afcr.intersection.ui.string.Command;

/**
 * Clase Constants
 * @author Andrés Felipe
 * @since 1.8
 */
public class ConstantsCommandLines {
	public static final String APPNAME = "INTERSECCION";
	public static final String APPVERSION = "Version : 1";
	public static final String AUTHOR = "Andrés Felipe Chaparro Rosas";
	public static final String YEAR = "2018";
	public static final String DESCRIPTION = "Aplicacion para saber si dos circunferencias se intersecan";
	public static final String HELP = Command.COMMAND_INPUT_DATA+'\t'+Command.COMMAND_SHOW_RESULT+'\t'+Command.COMMAND_HELP+'\t'+Command.COMMAND_ABOUT+'\t'+Command.COMMAND_EXIT;
	public static final String ABOUT= "\nAcerca de \n"+APPNAME+"\n"+APPVERSION+"\n"+AUTHOR+'\n'+YEAR+'\n'+DESCRIPTION;
}
