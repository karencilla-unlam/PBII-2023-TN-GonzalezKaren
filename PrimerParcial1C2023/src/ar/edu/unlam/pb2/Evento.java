package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.List;

public abstract class Evento {
	private String nombreEvento;
	private Usuario organizador;
	private List<Usuario> listaInvitados;
	


	public Evento(String nombreEvento, Usuario organizador) {
		this.nombreEvento = nombreEvento;
		this.organizador = organizador;
		this.listaInvitados = new ArrayList<Usuario>();
	}
	
	public String getNombreEvento() {
		return nombreEvento;
	}

	public void setNombreEvento(String nombreEvento) {
		this.nombreEvento = nombreEvento;
	}

	public List<Usuario> getListaInvitados() {
		return listaInvitados;
	}

	public void setListaInvitados(List<Usuario> listaInvitados) {
		this.listaInvitados = listaInvitados;
	}

	public Usuario getOrganizador() {
		return organizador;
	}

	public void setOrganizador(Usuario organizador) {
		this.organizador = organizador;
	} 
	
	public void add(Usuario usuario) {
		this.listaInvitados.add(usuario);
	}
}
