package uniandes.cupi2.mundial.interfaz.movil;


import java.awt.BorderLayout;
import java.awt.GridBagConstraints;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import uniandes.cupi2.mundial.controlador.Controlador;

public class DialogoCrearEquipo extends JDialog{
	
	public static final long serialVersionUID = 1l;
	private PanelCrearEquipos panelDatos;
	private Controlador controlador;
	
	public DialogoCrearEquipo(Controlador controlador) {

		this.controlador = controlador;
		panelDatos = new PanelCrearEquipos(this);
		setSize(432,600);
		setResizable(false);
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gbc.gridheight = GridBagConstraints.REMAINDER;
		add(panelDatos,BorderLayout.CENTER);
		setLocationRelativeTo(null);
		
	}
	  public void crearEquipo( )
	    {
	        boolean parametersOk = true;
	        String pais = panelDatos.darPais( );
	        String director = panelDatos.darDirector( );
	        String imagen = panelDatos.darImagen( );

	        if( ( pais.equals( "" ) || director.equals( "" ) ) || imagen.equals( "" ) )
	        {
	            parametersOk = false;
	            JOptionPane.showMessageDialog( this, "Se deben ingresar todos los datos para crear el equipo", "Error", JOptionPane.ERROR_MESSAGE );
	        }
	        if( parametersOk )
	        {
	            boolean ok = controlador.crearEquipo( pais, director, imagen );
	            if( ok )
	                dispose( );
	        }
	    }

}
