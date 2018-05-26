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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import uniandes.cupi2.mundial.interfaz.movil.DialogoCrearJugador;

public class PanelCrearJugador extends JPanel implements ActionListener{

	public static final long serialVersionUID = 1l;

	private static final String EXPLORAR = "";
	private static final String CREAR_JUGADOR = "CrearJugador";
	private static final String CANCELAR = "Cancelar";
	private DialogoCrearJugador dialogo;
	private JLabel etiquetaImagen;
	private JTextField txtImagen;
	private JLabel etiquetaNombre;
	private JTextField txtNombre;
	private JLabel etiquetaEdad;
	private JTextField txtEdad;
	private JLabel etiquetaPosicion;
	private JTextField txtPosicion;
	private JLabel etiquetaAltura;
	private JTextField txtAltura;
	private JLabel etiquetaPeso;
	private JTextField txtPeso;
	private JLabel etiquetaSalario;
	private JTextField txtSalario;
	private JButton botonExplorar;
	private JButton botonAgregarJugador;
	private JButton botonCancelar;

	public PanelCrearJugador(DialogoCrearJugador d) {
		dialogo = d;
		setLayout( new GridBagLayout( ) );

		etiquetaNombre = new JLabel( "Nombre: " );
		GridBagConstraints gbc = new GridBagConstraints( );
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new Insets( 3, 3, 3, 3 );
		add( etiquetaNombre, 0 );

		txtNombre = new JTextField( );
		txtNombre.setPreferredSize( new Dimension( 80, 25 ) );
		gbc.gridx = 1;
		add( txtNombre, gbc );

		etiquetaEdad = new JLabel( "Edad:" );
		gbc.gridx = 0;
		gbc.gridy = 1;
		add( etiquetaEdad, gbc );

		txtEdad = new JTextField( );
		txtEdad.setPreferredSize( new Dimension( 80, 25 ) );
		gbc.gridx = 1;
		add( txtEdad, gbc );

		etiquetaPosicion = new JLabel( "Posición:" );
		gbc.gridx = 0;
		gbc.gridy = 2;
		add( etiquetaPosicion, gbc );

		txtPosicion = new JTextField( );
		txtPosicion.setPreferredSize( new Dimension( 80, 25 ) );
		gbc.gridx = 1;
		add( txtPosicion, gbc );

		etiquetaAltura = new JLabel( "Altura:" );
		gbc.gridx = 0;
		gbc.gridy = 3;
		add( etiquetaAltura, gbc );

		txtAltura = new JTextField( );
		txtAltura.setPreferredSize( new Dimension( 80, 25 ) );
		gbc.gridx = 1;
		add( txtAltura, gbc );

		etiquetaPeso = new JLabel( "Peso:" );
		gbc.gridx = 0;
		gbc.gridy = 4;
		add( etiquetaPeso, gbc );

		txtPeso = new JTextField( );
		txtPeso.setPreferredSize( new Dimension( 80, 25 ) );
		gbc.gridx = 1;
		add( txtPeso, gbc );

		etiquetaSalario = new JLabel( "Salario:" );
		gbc.gridx = 0;
		gbc.gridy = 5;
		add( etiquetaSalario, gbc );

		txtSalario = new JTextField( );
		txtSalario.setPreferredSize( new Dimension( 80, 25 ) );
		gbc.gridx = 1;
		add( txtSalario, gbc );

		etiquetaImagen = new JLabel( "Imagen:" );
		gbc.gridx = 0;
		gbc.gridy = 6;
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

		botonAgregarJugador = new JButton( "Crear" );
		botonAgregarJugador.setActionCommand( CREAR_JUGADOR );
		botonAgregarJugador.addActionListener( this );
		gbc.gridx = 0;
		gbc.gridy = 0;
		panelBotones.add( botonAgregarJugador, gbc );

		botonCancelar = new JButton( "Cancelar" );
		botonCancelar.setActionCommand( CANCELAR );
		botonCancelar.addActionListener( this );
		gbc.gridx = 1;
		panelBotones.add( botonCancelar, gbc );

		gbc.gridx = 0;
		gbc.gridy = 7;
		gbc.gridwidth = 2;
		add( panelBotones, gbc );

		setBorder( new EmptyBorder( 5, 5, 5, 5 ) );
	}

	public String darNombre( )
	{
		return txtNombre.getText( );
	}

	/**
	 * Da el valor del campo de texto con la edad del jugador
	 * @return Se retorn? la edad del jugador ingresada por el usuario
	 */
	public String darEdad( )
	{
		return txtEdad.getText( );
	}

	/**
	 * Da el valor del campo de texto con la posición del jugador
	 * @return Se retorn? la posición del jugador ingresado por el usuario
	 */
	public String darPosicion( )
	{
		return txtPosicion.getText( );
	}

	/**
	 * Da el valor del campo de texto con la altura del jugador
	 * @return Se retorn? la altura del jugador ingresado por el usuario
	 */
	public String darAltura( )
	{
		return txtAltura.getText( );
	}

	/**
	 * Da el valor del campo de texto con el peso del jugador
	 * @return Se retorn? el peso del jugador ingresado por el usuario
	 */
	public String darPeso( )
	{
		return txtPeso.getText( );
	}

	/**
	 * Da el valor del campo de texto con el salario del jugador
	 * @return Se retorn? el salario del jugador ingresado por el usuario
	 */
	public String darSalario( )
	{
		return txtSalario.getText( );
	}

	/**
	 * Da el valor del campo de texto con la ruta de la imagen con la foto del jugador
	 * @return Se retorn? el nombre de la imagen ingresada por el usuario
	 */
	public String darImagen( )
	{
		return txtImagen.getText( );
	}

	/**
	 * Ejecuta una acción cuando se hace click sobre un botón
	 * @param evento el evento del click sobre un botón - evento!=null
	 */
	public void actionPerformed( ActionEvent evento )
	{
		String comando = evento.getActionCommand( );

		if( EXPLORAR.equals( comando ) )
		{
			JFileChooser fc = new JFileChooser( "./data/imagenes" );
			fc.setDialogTitle( "Imagen del jugador" );
			int resultado = fc.showOpenDialog( this );

			if( resultado == JFileChooser.APPROVE_OPTION )
			{
				File archivo = fc.getSelectedFile( );
				String strArchivo = archivo.getAbsolutePath( );
				String strCarpetaImagenes = new File( "data/imagenes" ).getAbsolutePath( );

				if( strArchivo.startsWith( strCarpetaImagenes ) )
				{
					txtImagen.setText( "data/imagenes/" + archivo.getParentFile( ).getName( ) + "/" + archivo.getName( ) );
				}
				else
				{
					JOptionPane.showMessageDialog( this, "La imagen debe estar en la carpeta " + strCarpetaImagenes );
				}
			}
		}
		else if( CREAR_JUGADOR.equals( comando ) )
		{
			dialogo.crearJugador( );
		}
		else if( CANCELAR.equals( comando ) )
		{
			dialogo.dispose( );
		}
	}
}
