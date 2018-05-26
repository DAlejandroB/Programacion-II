package uniandes.cupi2.mundial.interfaz.movil;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import uniandes.cupi2.mundial.controlador.Controlador;
import uniandes.cupi2.mundial.controlador.ControladorEscritorio;
import uniandes.cupi2.mundial.mundo.Equipo;

public class PanelEquipo extends JPanel implements ActionListener{
	
	private JLabel equipo;
	private static final String CAMBIAR_EQUIPO = "CambiarEquipo";
	private JLabel dt;
	private JComboBox comboEquipos;
	private JTextField txtDt;
	private JLabel bandera;
	private Equipo equipoActual;
	private static final int ALTO = 100;
	private static final int ANCHO = 175;
	private Controlador principal;
	
	public PanelEquipo(Controlador controlador, ArrayList equiposList) {
		setLayout(new GridBagLayout());
		principal = controlador;
		equipo = new JLabel("Equipo");
		
		comboEquipos = new JComboBox(equiposList.toArray());
		comboEquipos.setEditable(false);
		comboEquipos.addActionListener(this);
		comboEquipos.setActionCommand(CAMBIAR_EQUIPO);
		
		dt = new JLabel("Director Tecnico");
		txtDt = new JTextField("Nombre del director tecnico");
		txtDt.setEditable(false);
		
		GridBagConstraints gbc = new GridBagConstraints();
		
		add(equipo);
		gbc.gridwidth = gbc.REMAINDER;
		add(comboEquipos,gbc);
		
		bandera = new JLabel("");
        bandera = new JLabel( "" );
        bandera.setMaximumSize( new Dimension( ANCHO, ALTO ) );
        bandera.setMinimumSize( new Dimension( ANCHO, ALTO ) );
        gbc.gridheight = 2;
        gbc.insets = new Insets( 3, 3, 3, 3 );
        add( bandera, gbc );
		
		add(dt);
		add(txtDt,gbc);
	}
    public void cambiarEquipo( Equipo equipo ){
        equipoActual = equipo;
        if( equipoActual != null )
        {
            BufferedImage imagen;
            try
            {
                imagen = ImageIO.read( new File( equipoActual.darImagen( ) ) );
                Image laImagen = imagen.getScaledInstance( ( int ) ( ANCHO ), ( int ) ( ALTO ), Image.SCALE_AREA_AVERAGING );
                bandera.setIcon( new ImageIcon( laImagen ) );
                txtDt.setText( equipoActual.darDirector( ) );
            }
            catch( IOException e1 )
            {
                JOptionPane.showMessageDialog( this, "Problemas cargando la bandera del equipo", "Error", JOptionPane.ERROR_MESSAGE );
            }

        }

    }
    public void refrescarEquipos( ArrayList equipos )
    {
        comboEquipos.removeAllItems( );

        for( int i = 0; i < equipos.size( ); i++ )
        {
            comboEquipos.addItem( equipos.get( i ) );
        }
    }
    @Override
    public void actionPerformed( ActionEvent evento )
    {
        String comando = evento.getActionCommand( );

        if( CAMBIAR_EQUIPO.equals( comando ) )
        {
            String nombreEquipo = ( String )comboEquipos.getSelectedItem( );
            principal.switchSelectedTeam( nombreEquipo );

        }

    }
}
