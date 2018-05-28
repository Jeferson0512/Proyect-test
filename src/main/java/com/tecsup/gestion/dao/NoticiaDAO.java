package com.tecsup.gestion.dao;

import java.util.List;

import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.model.Noticia;

public interface NoticiaDAO {
	
	Noticia findNoticia(int id) throws DAOException, EmptyResultException;
	
	void createNoticia(String nombre_n, String info_n, String imagen, String updated_at, String created_at, int pais_id) throws DAOException;
	
	void deleteNoticia(String nombre_n) throws DAOException;
	
	void updateNoticia(String nombre_n, String info_n, String imagen, String updated_at, String created_at, int pais_id) throws DAOException;
	
	List<Noticia> findAllNoticia() throws DAOException, EmptyResultException;
	
	Noticia findNoticiaName(String nombre_n) throws DAOException, EmptyResultException;

}
