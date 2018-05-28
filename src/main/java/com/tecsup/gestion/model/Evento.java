package com.tecsup.gestion.model;

public class Evento {

	int eventoId;
	String title_event;
	String description_event;
	String img_event;
	String fecha_event;
	
	public Evento(int eventoId, String title_event, String description_event, String img_event, String fecha_event) {
		super();
		this.eventoId = eventoId;
		this.title_event = title_event;
		this.description_event = description_event;
		this.img_event = img_event;
		this.fecha_event = fecha_event;
	}

	public Evento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEventoId() {
		return eventoId;
	}

	public void setEventoId(int eventoId) {
		this.eventoId = eventoId;
	}

	public String getTitle_event() {
		return title_event;
	}

	public void setTitle_event(String title_event) {
		this.title_event = title_event;
	}

	public String getDescription_event() {
		return description_event;
	}

	public void setDescription_event(String description_event) {
		this.description_event = description_event;
	}

	public String getImg_event() {
		return img_event;
	}

	public void setImg_event(String img_event) {
		this.img_event = img_event;
	}

	public String getFecha_event() {
		return fecha_event;
	}

	public void setFecha_event(String fecha_event) {
		this.fecha_event = fecha_event;
	}

	@Override
	public String toString() {
		return "Evento [eventoId=" + eventoId + ", title_event=" + title_event + ", description_event="
				+ description_event + ", img_event=" + img_event + ", fecha_event=" + fecha_event + "]";
	}
	
}
