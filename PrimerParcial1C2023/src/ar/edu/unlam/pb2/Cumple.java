package ar.edu.unlam.pb2;

import java.util.ArrayList;

public class Cumple extends Evento {
	private Agasajado agasajado;

	public Cumple(String nombreEvento, Usuario organizador, Agasajado agasajado) {
		super(nombreEvento, organizador);
		this.agasajado= agasajado;
	}
	
	public Cumple(Agasajado agasajado) {
		super();
		this.agasajado= agasajado;
	}


	public Agasajado getAgasajado() {
		return agasajado;
	}


	public void setAgasajado(Agasajado agasajado) {
		this.agasajado = agasajado;
	}

	

}
