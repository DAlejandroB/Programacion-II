package uniandes.cupi2.mundial.interfaz.movil;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import uniandes.cupi2.mundial.controlador.Controlador;
import uniandes.cupi2.mundial.interfaz.MundialInterface;
import uniandes.cupi2.mundial.mundo.Equipo;
import uniandes.cupi2.mundial.mundo.Jugador;
import uniandes.cupi2.mundial.mundo.Mundial;

public class InterfazMovil extends JFrame implements MundialInterface{
	
	public static final long serialVersionUID = 1l;
	private PanelOpciones panelOpciones;
	private PanelEquipo panelEquipo;
	private PanelJugador panelJugador;
	private Controlador controlador;

	public InterfazMovil(Controlador controlador,Mundial mundial) {
		this.controlador = controlador;
		setSize(432,600);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		panelOpciones= new PanelOpciones(controlador);
		panelOpciones.setVisible(true);
		panelOpciones.setWindow(this);
		add(panelOpciones,BorderLayout.NORTH);
		
		panelEquipo = new PanelEquipo(controlador,mundial.darNombresEquipos());
		panelEquipo.setVisible(true);
		add(panelEquipo,BorderLayout.CENTER);
		
		panelJugador = new PanelJugador(controlador);
		panelJugador.setVisible(true);
		add(panelJugador,BorderLayout.SOUTH);
		
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void cambiarEquipoSeleccionado(Equipo equipoSeleccionado) {
		panelEquipo.cambiarEquipo(equipoSeleccionado);
		panelJugador.cambiarJugadores(equipoSeleccionado);
	}
	public PanelEquipo getPanelEquipos() {
		return panelEquipo;
	}
	public void showMessage(String message) {
		JOptionPane.showMessageDialog(this,message);		
	}
	@Override
	public void refrescarJugadores(Equipo equipo) {
		panelJugador.cambiarJugadores(equipo);
	}
	@Override
	public void crearEquipo() {
		DialogoCrearEquipo dialogo = new DialogoCrearEquipo(controlador);
		dialogo.setVisible(true);
	}
	@Override
	public void crearJugador() {
		DialogoCrearJugador dialogo = new DialogoCrearJugador(controlador);
		dialogo.setVisible(true);
	}
	@Override
	public void cambiarJugadorSeleccionado(Jugador jugador) {
		if(jugador != null) {
			
		}
	}
	@Override
	public void refrescarEquipos(ArrayList equipos) {
		panelEquipo.refrescarEquipos(equipos);
	}	
	
}