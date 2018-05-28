package com.tecsup.gestion.model;

public class Noticia {

	int noticiaId;
	String nombre_n;
	String info_n;
	String imagen;
	int paisId;
	String updated_at;
	String created_at;
	
	public Noticia(int noticiaId, String nombre_n, String info_n, String imagen, int paisId, String updated_at,
			String created_at) {
		super();
		this.noticiaId = noticiaId;
		this.nombre_n = nombre_n;
		this.info_n = info_n;
		this.imagen = imagen;
		this.paisId = paisId;
		this.updated_at = updated_at;
		this.created_at = created_at;
	}

	public Noticia() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getNoticiaId() {
		return noticiaId;
	}

	public void setNoticiaId(int noticiaId) {
		this.noticiaId = noticiaId;
	}

	public String getNombre_n() {
		return nombre_n;
	}

	public void setNombre_n(String nombre_n) {
		this.nombre_n = nombre_n;
	}

	public String getInfo_n() {
		return info_n;
	}

	public void setInfo_n(String info_n) {
		this.info_n = info_n;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public int getPaisId() {
		return paisId;
	}

	public void setPaisId(int paisId) {
		this.paisId = paisId;
	}

	public String getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	@Override
	public String toString() {
		return "Noticia [noticiaId=" + noticiaId + ", nombre_n=" + nombre_n + ", info_n=" + info_n + ", imagen="
				+ imagen + ", paisId=" + paisId + ", updated_at=" + updated_at + ", created_at=" + created_at + "]";
	}
	
}
