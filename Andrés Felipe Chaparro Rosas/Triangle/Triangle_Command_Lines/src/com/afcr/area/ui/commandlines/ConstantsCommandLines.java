package com.afcr.area.ui.commandlines;

import com.afcr.area.ui.strings.Command;

/**
 * Clase Constants
 * @author Andrés Felipe
 * @since 1.8
 */
public class ConstantsCommandLines {
	public static final String APPNAME = "TRIANGULO";
	public static final String APPVERSION = "Version : 1";
	public static final String AUTHOR = "Andrés Felipe Chaparro Rosas";
	public static final String YEAR = "2018";
	public static final String DESCRIPTION = "Aplicacion para calcular el area de un triangulo";
	public static final String HELP = Command.COMMAND_INPUT_DATA+'\t'+Command.COMMAND_CALCULATE+'\t'+Command.COMMAND_HELP+'\t'+Command.COMMAND_ABOUT+'\t'+Command.COMMAND_EXIT;
	public static final String ABOUT= "\nAcerca de \n"+APPNAME+"\n"+APPVERSION+"\n"+AUTHOR+'\n'+YEAR+'\n'+DESCRIPTION;
}
