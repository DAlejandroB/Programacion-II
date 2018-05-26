package uniandes.cupi2.mundial.interfaz.movil;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import uniandes.cupi2.mundial.interfaz.movil.DialogoCrearEquipo;

public class PanelCrearEquipos extends JPanel implements ActionListener{
	public static final long serialVersionUID = 1l;
	private static final String CREAR_EQUIPO = "CrearEquipo";
	private static final String CANCELAR = "Cancelar";
	private static final String EXPLORAR = "Explorar";
	private DialogoCrearEquipo dialogo;
	private JLabel etiquetaPais;
	private JTextField txtPais;
	private JLabel etiquetaDirector;
	private JTextField txtDirector;
	private JLabel etiquetaImagen;
	private JTextField txtImagen;
	private JButton botonExplorar;
	private JButton botonAgregarEquipo;
	private JButton botonCancelar;

    public PanelCrearEquipos( DialogoCrearEquipo d ){
        dialogo = d;
        setLayout( new GridBagLayout( ) );

        etiquetaPais = new JLabel( "Pais: " );
        GridBagConstraints gbc = new GridBagConstraints( );
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets( 3, 3, 3, 3 );
        add( etiquetaPais, gbc );

        txtPais = new JTextField( );
        txtPais.setPreferredSize( new Dimension( 80, 25 ) );
        gbc.gridx = 1;

        add( txtPais, gbc );

        etiquetaDirector = new JLabel( "Director Tenico: " );
        gbc.gridx = 0;
        gbc.gridy = 1;
        add( etiquetaDirector, gbc );

        txtDirector = new JTextField( );
        txtDirector.setPreferredSize( new Dimension( 80, 25 ) );
        gbc.gridx = 1;
        add( txtDirector, gbc );

        etiquetaImagen = new JLabel( "Imagen: " );
        gbc.gridx = 0;
        gbc.gridy = 2;
        add( etiquetaImagen, gbc );

        JPanel panelImagen = new JPanel( );
        panelImagen.setLayout( new GridLayout( 1, 2, 3, 3 ) );

        txtImagen = new JTextField( );
        panelImagen.add( txtImagen );

        botonExplorar = new JButton( "Explorar" );
        botonExplorar.setActionCommand( EXPLORAR );
        botonExplorar.addActionListener( this );
        panelImagen.add( botonExplorar );

        gbc.gridx = 1;
        add( panelImagen, gbc );

        JPanel panelBotones = new JPanel( );
        panelBotones.setLayout( new GridBagLayout( ) );

        botonAgregarEquipo = new JButton( "Crear" );
        botonAgregarEquipo.setActionCommand( CREAR_EQUIPO );
        botonAgregarEquipo.addActionListener( this );
        gbc.gridx = 0;
        gbc.gridy = 0;
        panelBotones.add( botonAgregarEquipo, gbc );

        botonCancelar = new JButton( "Cancelar" );
        botonCancelar.setActionCommand( CANCELAR );
        botonCancelar.addActionListener( this );
        gbc.gridx = 1;
        panelBotones.add( botonCancelar, gbc );

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        add( panelBotones, gbc );

        setBorder( new EmptyBorder( 5, 5, 5, 5 ) );
    }
    public String darPais( )
    {
        return txtPais.getText( );
    }
    public String darDirector( )
    {
        return txtDirector.getText( );
    }

    public String darImagen( )
    {
        return txtImagen.getText( );
    }

    public void actionPerformed( ActionEvent evento )
    {
        String comando = evento.getActionCommand( );

        if( EXPLORAR.equals( comando ) )
        {
            JFileChooser fc = new JFileChooser( "./data/imagenes" );
            fc.setDialogTitle( "Imagen de la bandera del equipo" );
            int resultado = fc.showOpenDialog( this );
            if( resultado == JFileChooser.APPROVE_OPTION )
            {
                File archivo = fc.getSelectedFile( );
                txtImagen.setText( "data/imagenes/" + archivo.getParentFile( ).getName( ) + "/" + archivo.getName( ) );
            }
        }
        else if( CREAR_EQUIPO.equals( comando ) )
        {
            dialogo.crearEquipo( );
        }
        else if( CANCELAR.equals( comando ) )
        {
            dialogo.dispose( );
        }
    }
}
