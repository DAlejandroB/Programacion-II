package uniandes.cupi2.mundial.interfaz.movil;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import uniandes.cupi2.mundial.controlador.Controlador;

public class PanelOpciones extends JPanel implements ActionListener{
	private JMenuBar barra;
	private JLabel title;
	private static final String AGREGAR_JUGADOR = "agregarJugador";
	private static final String AGREGAR_EQUIPO = "agregarEquipo";
	private static final String CALCULAR_NOMINA = "calNomina";
	private InterfazMovil ventana;
	private Controlador controlador;
	private JMenu menuOpciones;
	private JMenu menuJugador;
	private JMenu menuEquipos;
	
	private JMenuItem agregarEquipo;
	private JMenuItem calNomina;
	private JMenuItem agregarJugador;
	
	public PanelOpciones(Controlador controlador) {
		this.controlador = controlador;
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		barra = new JMenuBar();
		menuOpciones= new JMenu("Opciones");
		
		menuJugador = new JMenu("Jugador");
		agregarJugador = new JMenuItem("Agregar Jugador");
		agregarJugador.setActionCommand(AGREGAR_JUGADOR);
		agregarJugador.addActionListener(this);
		menuJugador.add(agregarJugador);
		
		menuEquipos = new JMenu("Equipo");
		calNomina = new JMenuItem("Calcular nomina");
		calNomina.setActionCommand(CALCULAR_NOMINA);
		calNomina.addActionListener(this);
		agregarEquipo = new JMenuItem("Agregar Equipo");
		agregarEquipo.setActionCommand(AGREGAR_EQUIPO);
		agregarEquipo.addActionListener(this);
		menuEquipos.add(agregarEquipo);
		menuEquipos.add(calNomina);
		
		menuOpciones.add(menuEquipos);
		menuOpciones.add(menuJugador);
		
		barra.add(menuOpciones);
		
		title = new JLabel("Mundial de futbol cupi2");
		add(barra);
		add(title);
	}
	
	public void setWindow(InterfazMovil im) {
		ventana = im;
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
            controlador.calcularValorNomina( );
        }
    }
}
