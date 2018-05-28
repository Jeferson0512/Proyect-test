package com.tecsup.gestion.dao;

import java.util.List;

import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.model.Evento;

public interface EventoDAO {

	Evento findEvento(int id) throws DAOException, EmptyResultException;
	
	void createEvento(String title_event, String description_event, String img_event, String fecha_event) throws DAOException;
	
	void deleteEvento(String title_event) throws DAOException;
	
	void updateEvento() throws DAOException;
	
	List<Evento> findAllEvento() throws DAOException, EmptyResultException;
	
}
