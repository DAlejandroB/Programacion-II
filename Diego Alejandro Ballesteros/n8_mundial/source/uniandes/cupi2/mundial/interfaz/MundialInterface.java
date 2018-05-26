package uniandes.cupi2.mundial.interfaz;

import java.util.ArrayList;

import uniandes.cupi2.mundial.mundo.Equipo;
import uniandes.cupi2.mundial.mundo.Jugador;

public interface MundialInterface {
	public void crearEquipo();
	public void crearJugador();
	public void cambiarJugadorSeleccionado(Jugador jugador);
	public void cambiarEquipoSeleccionado(Equipo equipo);
	public void refrescarJugadores(Equipo equipo);
	public void refrescarEquipos(ArrayList equipos);
	public void showMessage(String message);
}
