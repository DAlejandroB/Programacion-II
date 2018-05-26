package uniandes.cupi2.mundial.interfaz.movil;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import uniandes.cupi2.mundial.controlador.Controlador;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import uniandes.cupi2.mundial.mundo.Equipo;
import uniandes.cupi2.mundial.mundo.Jugador;

public class PanelJugador extends JPanel implements ActionListener{

	private static final String CAMBIAR_JUGADOR = "CambiarJugador";
	private Jugador jugador;
	private Controlador controlador;
	private JLabel etiquetaImagen;
	private JComboBox comboJugadores;
	private JLabel etiquetaNombre;
	private JLabel etiquetaEdad;
	private JLabel etiquetaValorEdad;
	private JLabel etiquetaPosicion;
	private JLabel etiquetaValorPosicion;
	private JLabel etiquetaAltura;
	private JLabel etiquetaValorAltura;
	private JLabel etiquetaPeso;
	private JLabel etiquetaValorPeso;
	private JLabel etiquetaSalario;
	private JLabel etiquetaValorSalario;


	public PanelJugador(Controlador controlador) {
	
		this.controlador = controlador;
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();

		comboJugadores = new JComboBox( );
        comboJugadores.setEditable( false );
        comboJugadores.addActionListener( this );
        comboJugadores.setActionCommand( CAMBIAR_JUGADOR );
        comboJugadores.setPreferredSize( new Dimension( 230, 20 ) );
        gbc = new GridBagConstraints( 2, 0, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets( 3, 5, 3, 5 ), 0, 0 );
        add( comboJugadores, gbc );
		
		etiquetaNombre = new JLabel( "Nombre: " );
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		add( etiquetaNombre, gbc );

		etiquetaImagen = new JLabel( "" );
		etiquetaImagen.setPreferredSize( new Dimension( 150, 180 ) );
		etiquetaImagen.setBorder( new EmptyBorder( 10, 10, 10, 10 ) );
		
		gbc = new GridBagConstraints( 0, 0, 1, 6, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets( 3, 5, 3, 5 ), 0, 0 );
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		add( etiquetaImagen, gbc );
        
        etiquetaEdad = new JLabel( "Edad: " );
        etiquetaValorEdad = new JLabel( "" );
        etiquetaValorEdad.setFont( etiquetaValorEdad.getFont( ).deriveFont( Font.PLAIN ) );
        gbc = new GridBagConstraints( 1, 1, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets( 3, 5, 3, 5 ), 0, 0 );
        add( etiquetaEdad, gbc);
        gbc = new GridBagConstraints( 2, 1, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets( 3, 5, 3, 5 ), 0, 0 );
        add( etiquetaValorEdad, gbc);

        etiquetaPosicion = new JLabel( "Posicion: " );
        etiquetaValorPosicion = new JLabel( "" );
        etiquetaValorPosicion.setFont( etiquetaValorPosicion.getFont( ).deriveFont( Font.PLAIN ) );
        gbc = new GridBagConstraints( 1, 2, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets( 3, 5, 3, 5 ), 0, 0 );
        add( etiquetaPosicion, gbc);
        gbc = new GridBagConstraints( 2, 2, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets( 3, 5, 3, 5 ), 0, 0 );
        add( etiquetaValorPosicion, gbc);

        etiquetaAltura = new JLabel( "Altura: " );
        etiquetaValorAltura = new JLabel( "" );
        etiquetaValorAltura.setFont( etiquetaValorAltura.getFont( ).deriveFont( Font.PLAIN ) );
        gbc = new GridBagConstraints( 1, 3, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets( 3, 5, 3, 5 ), 0, 0 );
        add( etiquetaAltura, gbc);
        gbc = new GridBagConstraints( 2, 3, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets( 3, 5, 3, 5 ), 0, 0 );
        add( etiquetaValorAltura, gbc);

        etiquetaPeso = new JLabel( "Peso: " );
        etiquetaValorPeso = new JLabel( "" );
        etiquetaValorPeso.setFont( etiquetaValorPeso.getFont( ).deriveFont( Font.PLAIN ) );
        gbc = new GridBagConstraints( 1, 4, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets( 3, 5, 3, 5 ), 0, 0 );
        add( etiquetaPeso, gbc);
        gbc = new GridBagConstraints( 2, 4, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets( 3, 5, 3, 5 ), 0, 0 );
        add( etiquetaValorPeso, gbc);

        etiquetaSalario = new JLabel( "Salario: " );
        etiquetaValorSalario = new JLabel( "" );
        etiquetaValorSalario.setFont( etiquetaValorSalario.getFont( ).deriveFont( Font.PLAIN ) );
        gbc = new GridBagConstraints( 1, 5, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets( 3, 5, 3, 5 ), 0, 0 );
        add( etiquetaSalario, gbc);
        gbc = new GridBagConstraints( 2, 5, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets( 3, 5, 3, 5 ), 0, 0 );
        add( etiquetaValorSalario, gbc);

        setBorder( new CompoundBorder( new EmptyBorder( 5, 5, 5, 5 ), new TitledBorder( "Jugadores" ) ) );        
	}
	   public void cambiarJugador( Jugador j )
	    {
	        jugador = j;
	        etiquetaImagen.setIcon( new ImageIcon( jugador.darImagen( ) ) );
	        etiquetaValorEdad.setText( Integer.toString( jugador.darEdad( ) ) + " años" );
	        etiquetaValorPosicion.setText( jugador.darPosicion( ) );
	        etiquetaValorAltura.setText( Double.toString( jugador.darAltura( ) ) + " mts" );
	        etiquetaValorPeso.setText( Double.toString( jugador.darPeso( ) ) + " Kgs" );
	        etiquetaValorSalario.setText( controlador.formatearValor( jugador.darSalario( ) ) + " millones anuales" );

	    }

	    /**
	     * Cambia los jugadores del equipo que se muestran en el panel
	     * @param e El nuevo equipo a mostrar en el panel - e!=null
	     */
	    public void cambiarJugadores( Equipo e )
	    {
	        if( e != null )
	        {
	            cambiarEquipo( e );
	        }
	        else
	        {
	            setBorder( new CompoundBorder( new EmptyBorder( 5, 5, 5, 5 ), new TitledBorder( "Jugadores" ) ) );
	        }
	    }

	    /**
	     * Cambia el equipo para el cual se muestran los jugadores en el panel y actualiza la información mostrada
	     * @param e Es el equipo del que se quieren mostrar los jugadores - e!=null
	     */
	    private void cambiarEquipo( Equipo e )
	    {
	        comboJugadores.removeAllItems( );
	        ArrayList jugadores = e.darNombresJugadores( );
	        for( int i = 0; i < jugadores.size( ); i++ )
	        {
	            String jugador = ( String )jugadores.get( i );
	            comboJugadores.addItem( jugador );
	        }
	        if( jugadores.size( ) == 0 )
	        {
	            etiquetaImagen.setIcon( new ImageIcon( "./data/sinFoto.img" ) );
	            etiquetaValorEdad.setText( "" );
	            etiquetaValorPosicion.setText( "" );
	            etiquetaValorAltura.setText( "" );
	            etiquetaValorPeso.setText( "" );
	            etiquetaValorSalario.setText( "" );
	        }
	    }

	    /**
	     * Ejecuta las acciones asociadas a los eventos. Actualiza la información del jugador en el panel de acuerdo al jugador seleccionado en el comboBox
	     * @param evento Es el evento del click sobre un botón - evento!=null
	     */
	    public void actionPerformed( ActionEvent evento )
	    {
	        String comando = evento.getActionCommand( );

	        if( CAMBIAR_JUGADOR.equals( comando ) )
	        {
	            String nombreJugador = ( String )comboJugadores.getSelectedItem( );
	            controlador.switchSelectedPlayer( nombreJugador );

	        }
	    }

}