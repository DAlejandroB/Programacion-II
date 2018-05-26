/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id: PanelBotones.java,v 1.4 2006/12/01 21:18:19 da-romer Exp $
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

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import uniandes.cupi2.mundial.controlador.ControladorEscritorio;

/**
 * Es el panel donde se encuentran los botones principales de la aplicaci
 */
public class PanelBotones extends JPanel implements ActionListener
{

    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    /**
     * Comando para agregar un equipo
     */
    private static final String AGREGAR_EQUIPO = "AgregarEquipo";

    /**
     * Comando para agregar un jugador
     */
    private static final String AGREGAR_JUGADOR = "AgregarJugador";

    /**
     * Comando para calcular el valor de la nina de un equipo
     */
    private static final String CALCULAR_NOMINA = "CalcularNomina";

    /**
     * Comando para cargar los equipos y jugadores del mundial
     */
    private static final String MODIFICAR_INFORMACION_JUGADORES = "ModificarInformacionJugadores";

    /**
     * Comando Opci 1
     */
    private static final String OPCION_1 = "OPCION_1";

    /**
     * Comando Opci 2
     */
    private static final String OPCION_2 = "OPCION_2";

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Controlador principal de la aplicaci
     */
    private ControladorEscritorio principal;

    /**
     * Ventana principal de la aplicaci
     */
    private InterfazEscritorio ventana;

    // -----------------------------------------------------------------
    // Atributos de interfaz
    // -----------------------------------------------------------------

    /**
     * Es el bot para agregar un equipo
     */
    private JButton botonAgregarEquipo;

    /**
     * Es el bot para agregar un jugador
     */
    private JButton botonAgregarJugador;

    /**
     * Es el bot para calcular la nina de un equipo
     */
    private JButton botonCalcularNomina;

    /**
     * Es el bot para modificar la informaci de los jugadores
     */
    private JButton botonModificarInformacionJugadores;

    /**
     * Bot Opci 1
     */
    private JButton botonOpcion1;

    /**
     * Bot Opci 2
     */
    private JButton botonOpcion2;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Constructor del panel
     * @param ventana Ventana principal - ventana!=null
     */
    public PanelBotones( ControladorEscritorio controlador)
    {
        principal = controlador;
        setBorder( new CompoundBorder( new EmptyBorder( 5, 5, 5, 5 ), new TitledBorder( "Opciones" ) ) );
        setLayout( new GridLayout( 2, 3, 3, 3 ) );

        // Bot agregar equipos
        botonAgregarEquipo = new JButton( "Agregar Equipo" );
        botonAgregarEquipo.setActionCommand( AGREGAR_EQUIPO );
        botonAgregarEquipo.addActionListener( this );
        add( botonAgregarEquipo );

        // Bot agregar jugador
        botonAgregarJugador = new JButton( "Agregar Jugador" );
        botonAgregarJugador.setActionCommand( AGREGAR_JUGADOR );
        botonAgregarJugador.addActionListener( this );
        add( botonAgregarJugador );

        // Bot calcular nina
        botonCalcularNomina = new JButton( "Calcular Nómina" );
        botonCalcularNomina.setActionCommand( CALCULAR_NOMINA );
        botonCalcularNomina.addActionListener( this );
        add( botonCalcularNomina );
    }

    // -----------------------------------------------------------------
    // M騁odos
    // -----------------------------------------------------------------

    /**
     * Manejo de los eventos de los botones
     * @param evento Acci que gener� el evento - evento!=null
     */
    public void setWindow(InterfazEscritorio im) {
    	this.ventana = im;
    }
    public void actionPerformed( ActionEvent evento )
    {
        String comando = evento.getActionCommand( );

        if( AGREGAR_EQUIPO.equals( comando ) )
        {
            ventana.crearEquipo();
        }
        else if( AGREGAR_JUGADOR.equals( comando ) )
        {
            ventana.crearJugador();
        }
        else if( CALCULAR_NOMINA.equals( comando ) )
        {
            principal.calcularValorNomina( );
        }
    }

}
