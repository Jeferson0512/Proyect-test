package com.tecsup.gestion.dao;

import java.util.List;

import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.model.Pais;

public interface PaisDAO {

	Pais findPais(int id) throws DAOException, EmptyResultException;
	
	void createPais(String nombre_p, String nombre_adjunto, String imagen, String escudo, String continente, String grupo, int puntos, String description) throws DAOException;
	
	void deletePais(String nombre_p) throws DAOException;
	
	void updatePais(String nombre_p, String nombre_adjunto, String imagen, String escudo, String continente, String grupo, int puntos, String description) throws DAOException;
	
	List<Pais> findAllPais() throws DAOException, EmptyResultException;
	
	Pais findPaisName(String nombre_p) throws DAOException, EmptyResultException;
}
