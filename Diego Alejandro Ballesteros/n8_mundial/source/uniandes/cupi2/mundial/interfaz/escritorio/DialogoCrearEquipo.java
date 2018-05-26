/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id: DialogoCrearEquipo.java,v 1.5 2006/12/01 22:29:13 da-romer Exp $
 * Universidad de los Andes (Bogot� - Colombia)
 * Departamento de Ingenier僘 de Sistemas y Computaci 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: n8_mundial
 * Autor: Milena Vela - 10-may-2006
 * Autor: Daniel Romero - 30-nov-2006
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package uniandes.cupi2.mundial.interfaz.escritorio;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import uniandes.cupi2.mundial.controlador.Controlador;
import uniandes.cupi2.mundial.controlador.ControladorEscritorio;

/**
 * Es el di疝ogo para crear un nuevo equipo
 */
public class DialogoCrearEquipo extends JDialog
{
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Es una referencia a la clase principal de la interfaz
     */
    private Controlador controlador;
    
    private InterfazEscritorio ventana;

    // -----------------------------------------------------------------
    // Atributos de la Interfaz
    // -----------------------------------------------------------------

    /**
     * Es el panel con los datos para crear el nuevo equipo
     */
    private PanelCrearEquipo panelDatos;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Construye el di疝ogo
     * @param ventana Es una referencia a la clase principal de la interfaz - ventana!=null
     */
    public DialogoCrearEquipo( Controlador controlador )
    {
   
        this.controlador = controlador;

        panelDatos = new PanelCrearEquipo( this );

        add( panelDatos, BorderLayout.CENTER );

        setTitle( "Crear Equipo" );
        setResizable( false );
        pack( );
        centrar( );

    }

    // -----------------------------------------------------------------
    // M騁odos
    // -----------------------------------------------------------------

    /**
     * Centra la ventana en la pantalla
     */
    private void centrar( )
    {
        Dimension screen = Toolkit.getDefaultToolkit( ).getScreenSize( );
        int xEsquina = ( screen.width - getWidth( ) ) / 2;
        int yEsquina = ( screen.height - getHeight( ) ) / 2;
        setLocation( xEsquina, yEsquina );
    }

    /**
     * Crea el equipo y lo guarda
     */
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
