package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.List;

public class Casamiento extends Evento {
	private List<Agasajado> agasajados;

	public Casamiento(String nombreEvento, Usuario organizador) {
		super(nombreEvento, organizador);
		this.agasajados= new ArrayList<Agasajado>();
	}
	
	

	
	
}
