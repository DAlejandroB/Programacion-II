package uniandes.cupi2.mundial.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import uniandes.cupi2.mundial.interfaz.escritorio.InterfazEscritorio;
import uniandes.cupi2.mundial.mundo.*;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
public class ControladorEscritorio implements ActionListener{

	private static final String RUTA_REPORTES = "./data/reportes";
	private Mundial mundial;
	private Equipo equipoSeleccionado;
	public static InterfazEscritorio interfazEscritorio;

	public void start() {
		mundial = null;
		
		try {
			mundial = new Mundial("./data/mundial.equipos");
		}catch(PersistenciaException e) {
			e.printStackTrace();
			System.exit(1);
		}
		ArrayList equipos = mundial.darNombresEquipos( );
		//interfazEscritorio = new InterfazEscritorio(this,mundial);
		if( equipos.size( ) > 0 )
        {
            switchSelectedTeam( ( ( String )equipos.get( 0 ) ) );
        }
		interfazEscritorio.setVisible(true);
	}
    /**
     * Cambia el jugador seleccionado en el panel de detalles del equipoSeleccionado
     * @param nombreJugador El nombre del jugador - nombreJugador!=null
     */
    public void switchSelectedPlayer( String nombreJugador )
    {
        Jugador jugador = equipoSeleccionado.darJugador( nombreJugador );

        interfazEscritorio.cambiarJugadorSeleccionado(jugador);
    }
    public void switchSelectedTeam( String nombreEquipo ){
    	equipoSeleccionado = mundial.darEquipo( nombreEquipo );
    	interfazEscritorio.cambiarEquipoSeleccionado(equipoSeleccionado);
    }
 
	public boolean crearEquipo( String pais, String director, String imagen )
	{
		boolean ok = false;
		try
		{
			mundial.agregarEquipo( pais, director, imagen );
			interfazEscritorio.getPanelEquipos().refrescarEquipos( mundial.darNombresEquipos( ) );
			ok = true;
		}
		catch( ElementoExisteException e )
		{
			interfazEscritorio.showMessage(e.getMessage());
		}
		return ok;
	}
	
    public boolean crearJugador( String nombre, int edad, String posicion, double altura, double peso, double salario, String imagen )
    {
        boolean ok = false;

        if( equipoSeleccionado != null )
        {
            try
            {
                mundial.agregarJugadorAEquipo( equipoSeleccionado.darPais( ), nombre, edad, posicion, altura, peso, salario, imagen );
                equipoSeleccionado = mundial.darEquipo( equipoSeleccionado.darPais( ) );
                interfazEscritorio.getPanelJugadores().cambiarJugadores( equipoSeleccionado );
                ok = true;
            }
            catch( ElementoExisteException e )
            {
               interfazEscritorio.showMessage(e.getMessage( ));
            }
        }

        return ok;
    }
    public void calcularValorNomina( )
    {

        try
        {
            String archivoReporte = mundial.calcularValorNomina( equipoSeleccionado.darPais( ), RUTA_REPORTES );
            interfazEscritorio.showMessage("El reporte se guard� en el archivo: " + archivoReporte, "Reporte Guardado" );
        }
        catch( IOException e )
        {
            interfazEscritorio.showMessage("Se present� un problema guardando el archivo con el reporte:\n" + e.getMessage( ), "Error");
        }

    }
	
    public void modificarInformacionJugadores( )
    {
        JFileChooser fc = new JFileChooser( "./data" );
        fc.setDialogTitle( "Modificar informaci de jugadores" );
        int resultado = fc.showOpenDialog( interfazEscritorio );
        if( resultado == JFileChooser.APPROVE_OPTION )
        {
            File archivo = fc.getSelectedFile( );
            if( archivo != null )
            {
                try
                {
                    mundial.modificarInformacionJugadores( archivo );
                    interfazEscritorio.showMessage("La informaci de los jugadores fue modificada", "Modificar Información Jugadores");
                }
                catch( FileNotFoundException e )
                {
                    interfazEscritorio.showMessage( "Se present� un problema leyendo el archivo:\n" + e.getMessage( ), "Error");
                }
                catch( IOException e )
                {
                    interfazEscritorio.showMessage( "Se present� un problema leyendo el archivo:\n" + e.getMessage( ), "Error");
                }
                catch( ArchivoJugadoresException e )
                {
                    interfazEscritorio.showMessage( "Se present� un problema debido al formato del archivo:\n" + e.getMessage( ), "Error");
                }
            }
        }
        interfazEscritorio.getPanelEquipos().refrescarEquipos( mundial.darNombresEquipos( ) );
    }
    public String formatearValor( double valor )
    {
        DecimalFormat df = ( DecimalFormat )NumberFormat.getInstance( );
        df.applyPattern( "$ ###,###.##" );
        df.setMinimumFractionDigits( 2 );
        return df.format( valor );
    }
    public void dispose( )
    {
        try
        {
            mundial.salvarMundial( );
            interfazEscritorio.dispose( );
        }
        catch( Exception e )
        {
            interfazEscritorio.setVisible( true );
            int respuesta = interfazEscritorio.showConfirmDialog("Problemas salvando la informaci del mundial:\n" + e.getMessage( ) + "\nｿQuiere cerrar el programa sin salvar?", "Error");
            if( respuesta == JOptionPane.YES_OPTION )
            {
                interfazEscritorio.dispose( );
            }
        }
    }

	public void actionPerformed(ActionEvent e) {

	}
}
