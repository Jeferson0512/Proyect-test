package com.tecsup.gestion.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecsup.gestion.dao.PaisDAO;
import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.model.Pais;

@Service
public class PaisServiceImpl implements PaisService{

	@Autowired
	private PaisDAO paisDAO;
	
	@Override
	public Pais find(int id) throws DAOException, EmptyResultException {

		Pais pais = paisDAO.findPais(id);

		return pais;
		
	}

	@Override
	public List<Pais> findAll() throws DAOException, EmptyResultException {

		List<Pais> pais = paisDAO.findAllPais();

		return pais;

	}

	@Override
	public void update(String nombre_p, String nombre_adjunto, String imagen, String escudo, String continente,
			String grupo, int puntos, String description) throws DAOException {
		
		
		paisDAO.updatePais(nombre_p, nombre_adjunto, imagen, escudo, continente, grupo, puntos, description);
	}

}
