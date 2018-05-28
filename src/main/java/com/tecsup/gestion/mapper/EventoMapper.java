package com.tecsup.gestion.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.tecsup.gestion.model.Evento;

public class EventoMapper implements RowMapper<Evento>{

	@Override
	public Evento mapRow(ResultSet rs, int rowNum) throws SQLException {
		Evento event = new Evento();
		event.setEventoId(rs.getInt("id"));
		event.setTitle_event(rs.getString("title_event"));
		event.setDescription_event(rs.getString("description_event"));
		event.setImg_event(rs.getString("img_event"));
		event.setFecha_event(rs.getString("fecha_event"));
		return event;
	}

}
