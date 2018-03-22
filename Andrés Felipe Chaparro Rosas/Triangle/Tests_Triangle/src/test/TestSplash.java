package test;

import com.afcr.area.ui.console.ConstantsConsole;
import com.afcr.ui.console.Splash;

/**
 * Clase TestSplash
 * 
 * @author Andrés Felipe Chaparro Rosas
 *
 */
public class TestSplash {
	public static void main(String[] args) {
		Splash splash = new Splash(new String[] { 
				ConstantsConsole.APPNAME, 
				ConstantsConsole.APPVERSION,
				ConstantsConsole.AUTHOR, 
				ConstantsConsole.DESCRIPTION,
				ConstantsConsole.YEAR });
		splash.show();
	}
}
