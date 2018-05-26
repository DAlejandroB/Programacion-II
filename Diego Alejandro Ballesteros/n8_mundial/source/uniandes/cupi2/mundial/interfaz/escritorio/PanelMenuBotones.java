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
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import uniandes.cupi2.mundial.controlador.Controlador;
import uniandes.cupi2.mundial.controlador.ControladorEscritorio;

/**
 * Es el panel donde se encuentran los botones principales de la aplicaci
 */
public class PanelMenuBotones extends JPanel implements ActionListener
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

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Controlador principal de la aplicaci
     */
    private Controlador principal;

    /**
     * Ventana principal de la aplicaci
     */
    private InterfazEscritorio ventana;

    // -----------------------------------------------------------------
    // Atributos de interfaz
    // -----------------------------------------------------------------
    private JMenuBar barra;
    
    private JMenu menuJugador;
    private JMenu menuEquipo;
    /**
     * Es el bot para agregar un equipo
     */
    private JMenuItem agregarEquipo;

    /**
     * Es el bot para agregar un jugador
     */
    private JMenuItem agregarJugador;

    /**
     * Es el bot para calcular la nina de un equipo
     */
    private JMenuItem calcularNomina;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Constructor del panel
     * @param ventana Ventana principal - ventana!=null
     */
    public PanelMenuBotones(Controlador controlador)
    {
        principal = controlador;
      //  setBorder( new CompoundBorder( new EmptyBorder( 5, 5, 5, 5 ), new TitledBorder( "Opciones" ) ) );
        setLayout( new GridLayout( 2, 3, 3, 3 ) );
        
        barra = new JMenuBar();
        
        menuJugador = new JMenu("Jugador");
        menuEquipo = new JMenu("Equipo");
        
        // Bot agregar equipos
        agregarEquipo = new JMenuItem( "Agregar Equipo" );
        agregarEquipo.setActionCommand( AGREGAR_EQUIPO );
        agregarEquipo.addActionListener( this );
        menuEquipo.add( agregarEquipo );

        // Bot agregar jugador
        agregarJugador = new JMenuItem( "Agregar Jugador" );
        agregarJugador.setActionCommand( AGREGAR_JUGADOR );
        agregarJugador.addActionListener( this );
        menuJugador.add( agregarJugador );

        // Bot calcular nina
        calcularNomina = new JMenuItem( "Calcular Nómina" );
        calcularNomina.setActionCommand( CALCULAR_NOMINA );
        calcularNomina.addActionListener( this );
        menuEquipo.add( calcularNomina );
        
        barra.add(menuEquipo);
        barra.add(menuJugador);
        add(barra);
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
            ventana.crearEquipo( );
        }
        else if( AGREGAR_JUGADOR.equals( comando ) )
        {
            ventana.crearJugador( );
        }
        else if( CALCULAR_NOMINA.equals( comando ) )
        {
            principal.calcularValorNomina( );
        }
    }

}
