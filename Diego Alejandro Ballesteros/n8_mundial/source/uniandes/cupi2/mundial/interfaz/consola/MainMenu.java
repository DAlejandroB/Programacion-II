package uniandes.cupi2.mundial.interfaz.consola;

import java.util.ArrayList;

import uniandes.cupi2.mundial.controlador.Controlador;
import uniandes.cupi2.mundial.interfaz.MundialInterface;
import uniandes.cupi2.mundial.mundo.Equipo;
import uniandes.cupi2.mundial.mundo.Jugador;
import uniandes.cupi2.mundial.mundo.Mundial;

public class MainMenu implements MundialInterface{
	private IoManager io = new IoManager();
	private String selectedTeam;
	private Controlador controlador;
	
	public MainMenu(Controlador controlador,Mundial m) {
		this.controlador = controlador;
		int result = -1;
		boolean init = false;
		do {
			io.clearConsole();
			io.println("///////////////////////////////////");
			io.println("/    Mundial de Football Cupi2    /");
			io.println("///////////////////////////////////");
			if(!init)showSelectTeamMenu(m.darNombresEquipos());
			init = true;
			io.println(selectedTeam);
			io.println("///////////////////////////////////");
			io.println("1- Ver equipos                    /");
			io.println("2- Ver informacion jugadores      /");
			io.println("3- Agregar equipo                 /");
			io.println("4- Agregar jugador                /");
			io.println("5- Calcular nomina                /");
			io.println("6- Salir                          /");
			io.println("///////////////////////////////////");
			result = io.readInt();
			switch(result) {
			case 1: showSelectTeamMenu(m.darNombresEquipos());
				break;
			case 2:	selectPlayerMenu(m.darEquipo(controlador.nombreEquipoSeleccionado()).darNombresJugadores());
				break;
			case 3: crearEquipo();
				break;
			case 4:	crearJugador();
				break;
			case 5: controlador.calcularValorNomina();
				break;
			case 6: io.println("Gracias por usar la apliacion");
				break;
			default: 
				io.println("Ingrese un valor valido");
			}
		}while(result != 6);	
	}
	public void cambiarJugadorSeleccionado(Jugador jugador) {
		showPlayer(jugador);
	}
	
	public int selectPlayerMenu(ArrayList players) {
		int result = -1;
		io.println("///////////////////////////////////");
		io.println("--------Seleccionar jugador--------");
		io.println("///////////////////////////////////");
		for(int i = 0; i < players.size(); i++) {
			io.println((int)(i+1) + "-" + players.get(i));
		}
		result = io.readInt();
		cambiarJugadorSeleccionado(controlador.darJugador((String)players.get(result-1)));
		return result;
	}
	public void refrescarEquipos(ArrayList equipos) {
		Equipo e = (Equipo)(equipos.get(equipos.size()-1));
		io.println("El equipo " + e.darPais() + " ha sido agregado");
	}
	public void refrescarJugadores(Equipo equipo) {
		cambiarEquipoSeleccionado(equipo);
	}
	public void cambiarEquipoSeleccionado(Equipo equipo) {
		String s = "Selección " + equipo.darPais() 
				+"\n"+"///////////////////////////////////"
				+"\nDirector Técnico: " + equipo.darDirector() +"\n"
				+"///////////////////////////////////\n";
		int i = 0;
		for(Object jugador: equipo.darNombresJugadores()) {
			String j = (String)jugador;
			s += "-" + j + "	"; 
			s += ((i%2) == 0)? "" :"\n";
			i++;
		}
		selectedTeam = s;
	}
	public void showSelectTeamMenu(ArrayList equipos) {
		int result = -1;
		io.println("///////////////////////////////////");
		io.println("---------Seleccionar equipo--------");
		io.println("///////////////////////////////////");
		int i = 1;
		for(Object equipo:equipos) {
			String e = (String)equipo;
			io.println(i + "- " + e);
			i++;
		}
		result = io.readInt();
		String nombreEquipo = (String)equipos.get(result-1);
		cambiarEquipoSeleccionado(controlador.darEquipo(nombreEquipo));
	}
	public void showPlayer(Jugador jugador) {
		io.clearConsole();
		io.println("Nombre: " + jugador.darNombre());
		io.println("Posicion: " + jugador.darPosicion());
		io.println("Edad: " + jugador.darEdad());
		io.println("Peso: " + jugador.darPeso());
		io.println("Salario: " + jugador.darSalario());
		io.println("Enter: Salir");
		io.readString();
	}
	public void crearEquipo() {
		String pais = io.readString("Ingrese el nombre del equipo");
		String director = io.readString("Ingrese el nombre del Director Tecnico");
		controlador.crearEquipo(
				pais, director, " ");
	}
	public void crearJugador() {
		String nombre = io.readString("Ingrese el nombre completo del jugador");
		int edad = io.readInt("Ingrese la edad del jugador");
		String posicion = io.readString("Ingrese la posicion del jugador");
		double altura = io.readDouble("Ingrese la altura del jugador");
		double peso = io.readDouble("Ingrese el peso del jugador");
		double salario = io.readDouble("Ingrese el salario del jugador");
		controlador.crearJugador(nombre, edad, posicion, altura, peso, salario, null);
	}
	public void showMessage(String message) {
		if(message != null)io.println(message);
	}
}
