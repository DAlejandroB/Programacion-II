/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id: InterfazMundial.java,v 1.14 2006/12/01 23:20:25 da-romer Exp $
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

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import uniandes.cupi2.mundial.controlador.Controlador;
import uniandes.cupi2.mundial.controlador.ControladorEscritorio;
import uniandes.cupi2.mundial.interfaz.MundialInterface;
import uniandes.cupi2.mundial.mundo.Equipo;
import uniandes.cupi2.mundial.mundo.Jugador;
import uniandes.cupi2.mundial.mundo.Mundial;
import uniandes.cupi2.mundial.mundo.PersistenciaException;

/**
 * Esta es la ventana principal de la aplicaci.
 */
public class InterfazEscritorio extends JFrame implements MundialInterface{
    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    /**
     * La ruta donde deben guardarse los reportes
     */

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------
    private Controlador controlador;
    // -----------------------------------------------------------------
    // Atributos de la interfaz
    // -----------------------------------------------------------------

    /**
     * Panel con los equipos
     */
    private PanelEquipos panelEquipos;

    /**
     * Panel con los jugadores
     */
    private PanelJugadores panelJugadores;

    /**
     * Panel con los botones
     */
    private PanelMenuBotones panelBotones;

    /**
     * Panel con una imagen decorativa
     */
    private PanelImagen panelImagen;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Construye la interfaz de la aplicaci
     * @param m Es el mundial de f偀bol que se va a mostrar - m!=null
     */
    public InterfazEscritorio( Controlador control,Mundial m )
    {
    	this.controlador = control;
        // Construye la forma
        setTitle( "Mundial de fútbol CUPI2" );
        setLayout( new GridBagLayout( ) );
        setSize( 560, 600 );
        setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
        setResizable(false);

        // Creaci de los paneles aqu�
        panelImagen = new PanelImagen( );
        GridBagConstraints gbc = new GridBagConstraints( );
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.BOTH;
        add( panelImagen, gbc );
        
        panelBotones = new PanelMenuBotones( controlador );
        gbc.gridy = 1;
        add( panelBotones, gbc );
        panelBotones.setWindow(this);
        centrar( );
        
        panelEquipos = new PanelEquipos( controlador, m.darNombresEquipos( ) );
        gbc.gridy = 2;
        add( panelEquipos, gbc );

        panelJugadores = new PanelJugadores(controlador);
        gbc.gridy = 3;
        add( panelJugadores, gbc );
        
        setVisible(true);
    }
    private void centrar( ){
        Dimension screen = Toolkit.getDefaultToolkit( ).getScreenSize( );
        int xEsquina = ( screen.width - getWidth( ) ) / 2;
        int yEsquina = ( screen.height - getHeight( ) ) / 2;
        setLocation( xEsquina, yEsquina );
    }

    public void cambiarJugadorSeleccionado(Jugador jugador){
        if( jugador != null )
        {
            panelJugadores.cambiarJugador( jugador );
        }

    }
    public void refrescarEquipos(ArrayList equipos) {
    	panelEquipos.refrescarEquipos(equipos);
    }
    public void cambiarEquipoSeleccionado( Equipo equipoSeleccionado )  {
    	panelEquipos.cambiarEquipo( equipoSeleccionado );
        panelJugadores.cambiarJugadores( equipoSeleccionado );
    }
    /**
     * Muestra el di疝ogo para agregar un nuevo jugador al equipoSeleccionado en el panel de jugadores
     */
    /**
     * Crea un nuevo equipo en el mundial y actualiza el panel con la lista de equipos <br>
     * <b>pre: <b>No debe haber otro equipo representando al mismo pa﨎 en el mundial
     * @param pais Es el pa﨎 del equipoSeleccionado - pais != null
     * @param director Es el nombre del director t馗nico del equipoSeleccionado - director != null
     * @param imagen Es la ruta de la imagen con la bandera del equipoSeleccionado - imagen != null
     * @return Retorna true si el equipo se pudo agregar. Esto sirve para saber si se debe cerrar el di疝ogo.
     */

    //////////////////////////////////////////////
    public PanelEquipos getPanelEquipos() {
    	return panelEquipos;
    }
    
    public void showMessage(String message) {
    	JOptionPane.showMessageDialog(this, message );
    }
    public PanelJugadores getPanelJugadores() {
    	return panelJugadores;
    }
    public void showMessage(String message,String title) {
    	if(title != "Error")
    	JOptionPane.showMessageDialog(this, message,title,JOptionPane.INFORMATION_MESSAGE);
    	else JOptionPane.showMessageDialog(this, message, title, JOptionPane.ERROR_MESSAGE);
    }
    public int showConfirmDialog(String message, String title) {
    	return JOptionPane.showConfirmDialog(this, message , title ,JOptionPane.YES_NO_OPTION);
    }
    ////////////////////////////////////////////////
    /**
     * Crea un nuevo jugador en el equipo que se muestra en los detalles de equipo del mundial <br>
     * <b>pre: <b>No debe haber otro jugador con el mismo nombre en el equipo
     * @param nombre El nombre del jugador - nombre != null
     * @param edad La edad del jugador - edad > 0
     * @param posicion La posici en la que juega el jugador - posicion != null
     * @param altura Es la altura del jugador en metros - altura > 0
     * @param peso Es el peso del jugador en kilogramos - peso > 0
     * @param salario Es el salario del jugador - salario > 0
     * @param imagen Es la ruta a la imagen con la foto del jugador - imagen != null
     * @return Retorna true si el jugador se pudo agregar. Esto sirve para saber si se debe cerrar el di疝ogo.
     */

    /**
     * Calcula el valor de la nina del equipo seleccionado
     */

    /**
     * Este m騁odo se encarga de modificar la informaci de los jugadores a partir de un archivo
     */

    /**
     * Formatea un valor num駻ico para presentar en la interfaz <br>
     * @param valor El valor num駻ico a ser formateado
     * @return Cadena con el valor formateado con puntos y signos.
     */
    public String formatearValor( double valor )
    {
        DecimalFormat df = ( DecimalFormat )NumberFormat.getInstance( );
        df.applyPattern( "$ ###,###.##" );
        df.setMinimumFractionDigits( 2 );
        return df.format( valor );
    }
    public void mostarVentanaAgregarJugador() {
        DialogoCrearJugador dialogo = new DialogoCrearJugador( controlador );
        dialogo.setVisible( true );
    }
    public void refrescarJugadores(Equipo equipo) {
    	this.panelJugadores.cambiarJugadores(equipo);
    }
    /**
     * Este m騁odo se encarga de salvar la informaci del mundial, justo antes de cerrar la aplicaci
     */
    public void dispose( ) {
    	super.dispose();
    }

	@Override
	public void crearEquipo() {
		DialogoCrearEquipo dialogo = new DialogoCrearEquipo( controlador );
        dialogo.setVisible( true );
	}

	@Override
	public void crearJugador() {
		DialogoCrearJugador dialogo = new DialogoCrearJugador(controlador);
		dialogo.setVisible(true);
	}
}