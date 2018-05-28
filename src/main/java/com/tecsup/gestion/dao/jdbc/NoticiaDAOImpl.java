package com.tecsup.gestion.dao.jdbc;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.tecsup.gestion.dao.NoticiaDAO;
import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.mapper.DepartmentMapper;
import com.tecsup.gestion.mapper.NoticiaMapper;
import com.tecsup.gestion.mapper.PaisMapper;
import com.tecsup.gestion.model.Department;
import com.tecsup.gestion.model.Noticia;
import com.tecsup.gestion.model.Pais;

@Repository
public class NoticiaDAOImpl implements NoticiaDAO{

	private static final Logger logger = LoggerFactory.getLogger(NoticiaDAOImpl.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public Noticia findNoticia(int id) throws DAOException, EmptyResultException {

		String query = "SELECT id, nombre_n, info_n, imagen, "
				+ "updated_at, created_at, pais_id FROM noticias WHERE id= ?";
		
		Object[] params = new Object[] {id};
		
		try {
			Noticia not = (Noticia) jdbcTemplate.queryForObject(query, params, new  NoticiaMapper());
			
			return not;
			
		} catch (EmptyResultDataAccessException e) {
			throw new EmptyResultException();
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
	}

	@Override
	public void createNoticia(String nombre_n, String info_n, String imagen, String updated_at, String created_at,
			int pais_id) throws DAOException {

		String query = "INSERT INTO noticias (nombre_n, info_n, imagen, updated_at, created_at, pais_id) VALUES (?,?,?,?,?,?)";
		
		Object[] params = new Object[] { nombre_n, info_n, imagen, updated_at, created_at, pais_id};
		
		Noticia not = null;
		
		try {
			
			jdbcTemplate.update(query, params);
			
			not = this.findNoticiaName(nombre_n);
			
		}catch (EmptyResultException e) {
			e.printStackTrace();
		}catch (Exception e) {
			logger.info("Error: "+e.getMessage());
			throw new DAOException(e.getMessage());
		}
		
	}

	@Override
	public void deleteNoticia(String nombre_n) throws DAOException {

		String query = "DELETE FROM noticias WHERE nombre_n = ?";
		
		Object[] params = new Object[] { nombre_n };
		
		try {
			
			jdbcTemplate.update(query, params);
			
		}catch (Exception e) {
			logger.info("Error: "+e.getMessage());
			throw new DAOException(e.getMessage());
		}
		
	}

	@Override
	public void updateNoticia(String nombre_n, String info_n, String imagen, String updated_at, String created_at,
			int pais_id) throws DAOException {

		String query = "UPDATE noticias SET info_n = ?, imagen = ?, updated_at = ?, created_at = ?, pais_id = ? WHERE nombre_n = ?";
		
		Object[] params = new Object[] {info_n, imagen, updated_at, created_at, pais_id, nombre_n};
		
		try {
			
			jdbcTemplate.update(query, params);
			
		} catch (Exception e) {
			
			logger.info("Error: "+e.getMessage());
			throw new DAOException(e.getMessage());
			
		}
		
	}

	@Override
	public List<Noticia> findAllNoticia() throws DAOException, EmptyResultException {

		String query = "SELECT id, nombre_n, info_n, imagen, " + 
				 "updated_at, created_at, pais_id FROM noticias";
		
		try {
			
			List<Noticia> not = jdbcTemplate.query(query, new NoticiaMapper());
			
			return not;
			
		}catch (EmptyResultDataAccessException e) {
			throw new EmptyResultException();
		}catch (Exception e) {
			logger.info("Error: "+e.getMessage());
			throw new DAOException(e.getMessage());
		}
	}

	@Override
	public Noticia findNoticiaName(String nombre_n) throws DAOException, EmptyResultException {

		String query = "SELECT nombre_n, info_n, imagen, updated_at, created_at, pais_id FROM noticias WHERE nombre_n = ?";
		
		Object[] params = new Object[] {nombre_n};
		
		try {
			
			Noticia not = jdbcTemplate.queryForObject(query, params, new NoticiaMapper());
			
			return not;
			
		}catch (EmptyResultDataAccessException e) {
			throw new EmptyResultException();
		}catch (Exception e) {
			logger.info("Error: "+e.getMessage());
			throw new DAOException(e.getMessage());
		}
	}
	
	
}
