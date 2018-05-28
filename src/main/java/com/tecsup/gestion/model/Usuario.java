package com.tecsup.gestion.model;

public class Usuario {
	
	int usuarioId;
	String username;
	String password;
	String nombres;
	String correo;
	String imagen;
	int estado;
	
	public Usuario(int usuarioId, String username, String password, String nombres, String correo, String imagen,
			int estado) {
		super();
		this.usuarioId = usuarioId;
		this.username = username;
		this.password = password;
		this.nombres = nombres;
		this.correo = correo;
		this.imagen = imagen;
		this.estado = estado;
	}

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(int usuarioId) {
		this.usuarioId = usuarioId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Usuario [usuarioId=" + usuarioId + ", username=" + username + ", password=" + password + ", nombres="
				+ nombres + ", correo=" + correo + ", imagen=" + imagen + ", estado=" + estado + "]";
	}
	
	
	
}
