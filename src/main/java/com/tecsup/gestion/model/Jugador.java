package com.tecsup.gestion.model;

public class Jugador {
	
	int jugadorId;
	String nombre_j;
	String apellido_j;
	String posicion;
	int pais_id;
	
	public Jugador(int jugadorId, String nombre_j, String apellido_j, String posicion, int pais_id) {
		super();
		this.jugadorId = jugadorId;
		this.nombre_j = nombre_j;
		this.apellido_j = apellido_j;
		this.posicion = posicion;
		this.pais_id = pais_id;
	}

	public Jugador() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getJugadorId() {
		return jugadorId;
	}

	public void setJugadorId(int jugadorId) {
		this.jugadorId = jugadorId;
	}

	public String getNombre_j() {
		return nombre_j;
	}

	public void setNombre_j(String nombre_j) {
		this.nombre_j = nombre_j;
	}

	public String getApellido_j() {
		return apellido_j;
	}

	public void setApellido_j(String apellido_j) {
		this.apellido_j = apellido_j;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public int getPais_id() {
		return pais_id;
	}

	public void setPais_id(int pais_id) {
		this.pais_id = pais_id;
	}

	@Override
	public String toString() {
		return "Jugador [jugadorId=" + jugadorId + ", nombre_j=" + nombre_j + ", apellido_j=" + apellido_j
				+ ", posicion=" + posicion + ", pais_id=" + pais_id + "]";
	}
	
}
