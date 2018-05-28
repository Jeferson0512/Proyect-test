package com.tecsup.gestion.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.tecsup.gestion.model.Pais;

public class PaisMapper implements RowMapper<Pais>{

	public Pais mapRow(ResultSet rs, int rowNum) throws SQLException {
		Pais pa = new Pais();
		pa.setPaisId(rs.getInt("id"));
		pa.setNombre_p(rs.getString("nombre_p"));
		pa.setNombre_adjunto(rs.getString("nombre_adjunto"));
		pa.setImagen(rs.getString("imagen"));
		pa.setEscudo(rs.getString("escudo"));
		pa.setContinente(rs.getString("continente"));
		pa.setGrupo(rs.getString("grupo"));
		pa.setPuntos(rs.getInt("puntos"));
		pa.setDescription(rs.getString("description"));
		return pa;
	}

}
