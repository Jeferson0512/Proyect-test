package com.tecsup.gestion.dao;

import java.util.List;

import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.model.Jugador;

public interface JugadorDAO {
 
	Jugador findJugador(int id) throws DAOException, EmptyResultException;
	
	void createJugador(String nombre_j, String apellido_j, String posicion, int pais_id) throws DAOException;
	
	void deleteJugador(String nombre_j) throws DAOException;
	
	void updateJugador(String nombre_j, String apellido_j, String posicion, int pais_id) throws DAOException;
	
	List<Jugador> findAllJugador() throws DAOException, EmptyResultException;
	
}
