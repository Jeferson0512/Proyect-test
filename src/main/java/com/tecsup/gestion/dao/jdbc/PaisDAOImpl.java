package com.tecsup.gestion.dao.jdbc;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.tecsup.gestion.dao.PaisDAO;
import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.mapper.DepartmentMapper;
import com.tecsup.gestion.mapper.PaisMapper;
import com.tecsup.gestion.model.Department;
import com.tecsup.gestion.model.Pais;

@Repository
public class PaisDAOImpl implements PaisDAO{

	private static final Logger logger = LoggerFactory.getLogger(PaisDAOImpl.class);
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public Pais findPais(int id) throws DAOException, EmptyResultException {
		
		String query = "SELECT id, nombre_p, nombre_adjunto, imagen, escudo, continente, "
				+ "grupo, puntos, description FROM paises WHERE id= ?";
		
		Object[] params = new Object[] {id};
		
		try {
			Pais pais = (Pais) jdbcTemplate.queryForObject(query, params, new PaisMapper());
			
			return pais;
			
		} catch (EmptyResultDataAccessException e) {
			throw new EmptyResultException();
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
		
	}

	@Override
	public void createPais(String nombre_p, String nombre_adjunto, String imagen, String escudo, String continente,
			String grupo, int puntos, String description) throws DAOException {
		
		String query = "INSERT INTO paises (nombre_p, nombre_adjunto, imagen, escudo, continente, grupo, puntos, description) VALUES (?,?,?,?,?,?,?,?)";
		
		Object[] params = new Object[] { nombre_p, nombre_adjunto, imagen, escudo, continente, grupo, puntos, description};
		
		Pais pais = null;
		
		try {
			
			jdbcTemplate.update(query, params);
			
			pais = this.findPaisName(nombre_p);
			
		}catch (EmptyResultException e) {
			e.printStackTrace();
		}catch (Exception e) {
			logger.info("Error: "+e.getMessage());
			throw new DAOException(e.getMessage());
		}
		
	}

	@Override
	public void deletePais(String nombre_p) throws DAOException {
		
		String query = "DELETE FROM paises WHERE nombre_p = ?";
		
		Object[] params = new Object[] { nombre_p };
		
		try {
			
			jdbcTemplate.update(query, params);
			
		}catch (Exception e) {
			logger.info("Error: "+e.getMessage());
			throw new DAOException(e.getMessage());
		}
		
	}

	@Override
	public void updatePais(String nombre_p, String nombre_adjunto, String imagen, String escudo, String continente,
			String grupo, int puntos, String description) throws DAOException {
		
		String query = "UPDATE paises SET nombre_adjunto = ?, imagen = ?, escudo = ?, continente = ?, grupo = ?, puntos = ?, description = ? WHERE nombre_p = ?";
		
		Object[] params = new Object[] {nombre_adjunto, imagen, escudo, continente, grupo, puntos, description,nombre_p };
		
		try {
			
			jdbcTemplate.update(query, params);
			
		} catch (Exception e) {
			
			logger.info("Error: "+e.getMessage());
			throw new DAOException(e.getMessage());
			
		}
		
	}

	@Override
	public List<Pais> findAllPais() throws DAOException, EmptyResultException {
		
		String query = "SELECT id, nombre_p, nombre_adjunto, imagen, escudo, continente, "
			+ "grupo, puntos, description FROM paises";
		
		try {
			
			List<Pais> pais = jdbcTemplate.query(query, new PaisMapper());
			
			return pais;
			
		}catch (EmptyResultDataAccessException e) {
			throw new EmptyResultException();
		}catch (Exception e) {
			logger.info("Error: "+e.getMessage());
			throw new DAOException(e.getMessage());
		}
	}

	@Override
	public Pais findPaisName(String nombre_p) throws DAOException, EmptyResultException {
		// TODO Auto-generated method stub
		return null;
	}

}
