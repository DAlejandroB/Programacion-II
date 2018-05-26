package uniandes.cupi2.mundial.controlador;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import uniandes.cupi2.mundial.interfaz.MundialInterface;
import uniandes.cupi2.mundial.interfaz.consola.MainMenu;
import uniandes.cupi2.mundial.interfaz.escritorio.InterfazEscritorio;
import uniandes.cupi2.mundial.interfaz.movil.InterfazMovil;
import uniandes.cupi2.mundial.mundo.ElementoExisteException;
import uniandes.cupi2.mundial.mundo.Equipo;
import uniandes.cupi2.mundial.mundo.Jugador;
import uniandes.cupi2.mundial.mundo.Mundial;
import uniandes.cupi2.mundial.mundo.PersistenciaException;

public class Controlador {
	
	private Equipo equipoSeleccionado;
	private MundialInterface interfaz;
	private Mundial mundial;
	private static final String RUTA_REPORTES = "./data/reportes";
	int option = 0;
	
	public Controlador(int option) {
		this.option = option;
		try {
			mundial = new Mundial("./data/mundial.equipos");
			equipoSeleccionado = mundial.darEquipo((String)mundial.darNombresEquipos().get(0));
		}catch(PersistenciaException e) {
			e.printStackTrace();
		}
		switch(option) {
			case 1: interfaz = new InterfazEscritorio(this, mundial);
			break;
			case 2: interfaz = new InterfazMovil(this, mundial);
			break;
			case 3: interfaz = new MainMenu(this, mundial);
			break;
		}
	}
	public Equipo darEquipo(String nEquipo) {
		return mundial.darEquipo(nEquipo);
	}
	public String nombreEquipoSeleccionado() {
		return equipoSeleccionado.darPais();
	}
	public void calcularValorNomina() {
		try {
			mundial.calcularValorNomina(equipoSeleccionado.darPais(), RUTA_REPORTES);
			System.out.println("El archivo se guardo en " + RUTA_REPORTES);
		}catch( IOException e) {
			interfaz.showMessage(e.getMessage());
		}
	}
	public void switchSelectedTeam(String nombreEquipo) {
		equipoSeleccionado = mundial.darEquipo(nombreEquipo);
		interfaz.cambiarEquipoSeleccionado(equipoSeleccionado);
	}
	public void switchSelectedPlayer(String nombreJugador) {
		Jugador jugador = equipoSeleccionado.darJugador(nombreJugador);
		interfaz.cambiarJugadorSeleccionado(jugador);		
	}
    public boolean crearJugador( String nombre, int edad, String posicion, double altura, double peso, double salario, String imagen ) {
    	boolean ok = false;
        if( equipoSeleccionado != null )
        {
            try
            {
                mundial.agregarJugadorAEquipo( equipoSeleccionado.darPais( ), nombre, edad, posicion, altura, peso, salario, imagen );
                equipoSeleccionado = mundial.darEquipo( equipoSeleccionado.darPais( ) );
                if(option!=3)interfaz.refrescarJugadores( equipoSeleccionado );
                ok = true;
            }
            catch( ElementoExisteException e )
            {
            	e.printStackTrace();
            }
        }
        return ok;
    }
	public String formatearValor(double darSalario) {
		DecimalFormat df = (DecimalFormat)NumberFormat.getInstance();
		df.applyPattern("$ ###,###.##");
		df.setMinimumFractionDigits(2);
		return df.format(darSalario);
	}
	public boolean crearEquipo(String pais, String director, String imagen) {
		boolean ok = false;
		try {
			mundial.agregarEquipo(pais, director, imagen);
			if(option != 3)interfaz.refrescarEquipos(mundial.darNombresEquipos());
			ok = true;
		}catch(ElementoExisteException e) {
			interfaz.showMessage(e.getMessage());
		}
		return ok;
	}
	public Jugador darJugador(String nombreJ) {
		return equipoSeleccionado.darJugador(nombreJ);
	}
}