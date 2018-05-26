package uniandes.cupi2.mundial.interfaz.movil;

import java.awt.BorderLayout;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import uniandes.cupi2.mundial.controlador.Controlador;

public class DialogoCrearJugador extends JDialog {
	
	public static final long serialVersionUID = 1l;
	private Controlador controlador;
	private PanelCrearJugador panelCrearJugador;
	
	public DialogoCrearJugador(Controlador controlador) {
		controlador = controlador;
		panelCrearJugador = new PanelCrearJugador(this);
		setSize(432,600);
		setResizable(false);
		add(panelCrearJugador,BorderLayout.CENTER);
		setTitle("Crear Jugador");
		setLocationRelativeTo(null);
	}
	
	public void crearJugador( ){
		   
	        boolean parametersOk = true;
	        String nombre = null;
	        int edad = 0;
	        String posicion = null;
	        double altura = 0;
	        double peso = 0;
	        double salario = 0;
	        String imagen = null;

	        nombre = panelCrearJugador.darNombre( );

	        if( nombre.equals( "" ) )
	        {
	            parametersOk = false;
	            JOptionPane.showMessageDialog( this, "Debe ingresar el nombre del jugador", "error", JOptionPane.ERROR_MESSAGE );
	        }
	        else
	        {
	            try
	            {
	                edad = Integer.parseInt( panelCrearJugador.darEdad( ) );
	                if( edad < 0 )
	                {
	                    parametersOk = false;
	                    JOptionPane.showMessageDialog( this, "La edad ingresada no es un valor válido", "error", JOptionPane.ERROR_MESSAGE );
	                }
	                else
	                {

	                    posicion = panelCrearJugador.darPosicion( );
	                    if( posicion.equals( "" ) )
	                    {
	                        parametersOk = false;
	                        JOptionPane.showMessageDialog( this, "La posición ingresada no es un valor válido", "error", JOptionPane.ERROR_MESSAGE );
	                    }
	                    else
	                    {
	                        try
	                        {
	                            altura = Double.parseDouble( panelCrearJugador.darAltura( ) );
	                            if( altura < 0 )
	                            {
	                                parametersOk = false;
	                                JOptionPane.showMessageDialog( this, "La altura ingresada no es un valor válido", "error", JOptionPane.ERROR_MESSAGE );
	                            }
	                            else
	                            {
	                                try
	                                {
	                                    peso = Double.parseDouble( panelCrearJugador.darPeso( ) );
	                                    if( peso < 0 )
	                                    {
	                                        parametersOk = false;
	                                        JOptionPane.showMessageDialog( this, "El peso ingresado no es un valor válido", "error", JOptionPane.ERROR_MESSAGE );
	                                    }
	                                    else
	                                    {
	                                        try
	                                        {
	                                            salario = Double.parseDouble( panelCrearJugador.darSalario( ) );
	                                            if( salario < 0 )
	                                            {
	                                                parametersOk = false;
	                                                JOptionPane.showMessageDialog( this, "El salario ingresado no es un valor válido", "error", JOptionPane.ERROR_MESSAGE );
	                                            }
	                                            else
	                                            {
	                                                try
	                                                {
	                                                    imagen = panelCrearJugador.darImagen( );
	                                                    if( imagen.equals( "" ) )
	                                                    {
	                                                        parametersOk = false;
	                                                        JOptionPane.showMessageDialog( this, "La ruta de la imagen ingresada no es un valor válido", "error", JOptionPane.ERROR_MESSAGE );
	                                                    }
	                                                }
	                                                catch( NumberFormatException e )
	                                                {
	                                                    parametersOk = false;
	                                                    JOptionPane.showMessageDialog( this, "La ruta de la imagen ingresada no es un valor válido", "error", JOptionPane.ERROR_MESSAGE );
	                                                }
	                                            }
	                                        }
	                                        catch( NumberFormatException e )
	                                        {
	                                            parametersOk = false;
	                                            JOptionPane.showMessageDialog( this, "El salario ingresado no es un valor válido", "error", JOptionPane.ERROR_MESSAGE );
	                                        }
	                                    }
	                                }
	                                catch( NumberFormatException e )
	                                {
	                                    parametersOk = false;
	                                    JOptionPane.showMessageDialog( this, "El peso ingresado no es un valor válido", "error", JOptionPane.ERROR_MESSAGE );
	                                }
	                            }
	                        }
	                        catch( NumberFormatException e )
	                        {
	                            parametersOk = false;
	                            JOptionPane.showMessageDialog( this, "La altura ingresada no es un valor válido", "error", JOptionPane.ERROR_MESSAGE );
	                        }
	                    }

	                }
	            }
	            catch( NumberFormatException e )
	            {
	                parametersOk = false;
	                JOptionPane.showMessageDialog( this, "La edad ingresada no es un valor válido", "error", JOptionPane.ERROR_MESSAGE );
	            }
	        }

	        if( parametersOk )
	        {
	            boolean ok = controlador.crearJugador( nombre, edad, posicion, altura, peso, salario, imagen );

	            if( ok )
	                dispose( );
	        }
	    }
}
