package ar.edu.unlam.pb2;

public class Usuario implements Invitado,Organizador {
	private String mailUsuario;
	private String nombreUsuario;
	private Integer edadUsuario;
	private Boolean asiste;

	public Usuario(String mailUsuario, String nombreUsuario, int edadUsuario) {
		this.mailUsuario=mailUsuario;
		this.nombreUsuario=nombreUsuario;
		this.edadUsuario=edadUsuario;
	}

	public String getMailUsuario() {
		return mailUsuario;
	}

	public void setMailUsuario(String mailUsuario) {
		this.mailUsuario = mailUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public Integer getEdadUsuario() {
		return edadUsuario;
	}

	public void setEdadUsuario(Integer edadUsuario) {
		this.edadUsuario = edadUsuario;
	}


	public Boolean getAsiste() {
		return asiste;
	}

	public void setAsiste(Boolean asiste) {
		this.asiste = asiste;
	}

	@Override
	public void organizarEvento() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean asistirEvento() {
		this.asiste.setAsiste(asiste);
	}

}
