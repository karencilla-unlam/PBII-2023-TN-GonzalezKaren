package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.TreeSet;

public class PlanificadorDeEventos {
	
	private ArrayList<Usuario> listaAsistentes;
	private Evento evento;
	private TreeSet<Cumple> listaCumples;
	private TreeSet<Casamiento> listaCasamientos;
	
	public ArrayList<Usuario> getListaAsistentes() {
		return listaAsistentes;
	}

	public void setListaAsistentes(ArrayList<Usuario> listaAsistentes) {
		this.listaAsistentes = listaAsistentes;
	}

	public String getUsuario() {
		return this.evento.getOrganizador().getMailUsuario();
	}
	
	public String getEvento() {
		return evento.getNombreEvento();
	}

	public void setEvento(String evento) {
		this.evento.setNombreEvento(evento);
	}

	public TreeSet<Cumple> getListaCumples() {
		return listaCumples;
	}

	public void setListaCumples(TreeSet<Cumple> listaCumples) {
		this.listaCumples = listaCumples;
	}

	public TreeSet<Casamiento> getListaCasamientos() {
		return listaCasamientos;
	}

	public void setListaCasamientos(TreeSet<Casamiento> listaCasamientos) {
		this.listaCasamientos = listaCasamientos;
	}


	public Object getEvento(String nombreDelEvento) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getCantidadDeCasamientos() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getCantidadDeEventos() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getCantidadDeInvitadosConfirmados() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getCantidadDeInvitados() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getCantidadDeUsuarios() {
	// se suma 1 usuario por el organizador
		return (this.evento.getListaInvitados().length())+1;
	}

	public void add(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}
	
	public void crear(Usuario organizador, Evento evento) {
		// TODO Auto-generated method stub
		
		
	}
	
	
	public void invitar(Evento nombreEvento, Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	
	public void confirmar(Evento nombreEvento, Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	public Usuario getUsuario(String mailOrganizador) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getCantidadDeCumpleanios() {
		// TODO Auto-generated method stub
		return null;
	}


}
