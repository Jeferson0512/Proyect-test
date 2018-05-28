package com.tecsup.gestion.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.tecsup.gestion.model.Noticia;

public class NoticiaMapper implements RowMapper<Noticia>{

	public Noticia mapRow(ResultSet rs, int rowNum) throws SQLException {
		Noticia not = new Noticia();
		not.setNoticiaId(rs.getInt("id"));
		not.setNombre_n(rs.getString("nombre_n"));
		not.setInfo_n(rs.getString("info_n"));
		not.setImagen(rs.getString("imagen"));
		not.setUpdated_at(rs.getString("updated_at"));
		not.setCreated_at(rs.getString("created_at"));
		not.setPaisId(rs.getInt("pais_id"));
		return not;
	}

}
