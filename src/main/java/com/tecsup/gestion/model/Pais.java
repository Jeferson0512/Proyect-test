package com.tecsup.gestion.model;

public class Pais {
	
	int paisId;
	String nombre_p;
	String nombre_adjunto;
	String imagen;
	String escudo;
	String continente;
	String grupo;
	int puntos;
	String description;
	
	public Pais(int paisId, String nombre_p, String nombre_adjunto, String imagen, String escudo, String continente,
			String grupo, int puntos, String description) {
		super();
		this.paisId = paisId;
		this.nombre_p = nombre_p;
		this.nombre_adjunto = nombre_adjunto;
		this.imagen = imagen;
		this.escudo = escudo;
		this.continente = continente;
		this.grupo = grupo;
		this.puntos = puntos;
		this.description = description;
	}

	public Pais() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPaisId() {
		return paisId;
	}

	public void setPaisId(int paisId) {
		this.paisId = paisId;
	}

	public String getNombre_p() {
		return nombre_p;
	}

	public void setNombre_p(String nombre_p) {
		this.nombre_p = nombre_p;
	}

	public String getNombre_adjunto() {
		return nombre_adjunto;
	}

	public void setNombre_adjunto(String nombre_adjunto) {
		this.nombre_adjunto = nombre_adjunto;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getEscudo() {
		return escudo;
	}

	public void setEscudo(String escudo) {
		this.escudo = escudo;
	}

	public String getContinente() {
		return continente;
	}

	public void setContinente(String continente) {
		this.continente = continente;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Pais [paisId=" + paisId + ", nombre_p=" + nombre_p + ", nombre_adjunto=" + nombre_adjunto + ", imagen="
				+ imagen + ", escudo=" + escudo + ", continente=" + continente + ", grupo=" + grupo + ", puntos="
				+ puntos + ", description=" + description + "]";
	}
	
	

}
