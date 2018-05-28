package com.tecsup.gestion.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.tecsup.gestion.model.Jugador;

public class JugadorMapper implements RowMapper<Jugador>{

	public Jugador mapRow(ResultSet rs, int rowNum) throws SQLException {
		Jugador jug = new Jugador();
		jug.setJugadorId(rs.getInt("id"));
		jug.setNombre_j(rs.getString("nombre_j"));
		jug.setApellido_j(rs.getString("apellido_j"));
		jug.setPosicion(rs.getString("posicion"));
		jug.setPais_id(rs.getInt("pais_id"));
		return jug;
	}

}
