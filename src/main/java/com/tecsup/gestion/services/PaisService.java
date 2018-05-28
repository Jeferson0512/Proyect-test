package com.tecsup.gestion.services;

import java.util.List;

import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.model.Pais;

public interface PaisService {

	Pais find(int id) throws DAOException, EmptyResultException;
	
	List<Pais> findAll() throws DAOException, EmptyResultException;
	
	void update(String nombre_p, String nombre_adjunto, String imagen, String escudo,
		String continente, String grupo, int puntos, String description)
				throws DAOException;
}
