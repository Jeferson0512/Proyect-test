package com.tecsup.gestion.dao;

import java.util.List;

import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.model.Department;

public interface DepartmentDAO {

	Department findDepartment(int id) throws DAOException, EmptyResultException;
	
	void createDepa(String name, String description, String city) throws DAOException;
	
	void deleteDepa(String name) throws DAOException;
	
	void updateDepa(String name, String description, String city) throws DAOException;
	
	List<Department> findAllDeparments() throws DAOException, EmptyResultException;
	
	Department findDepartmentName(String name) throws DAOException, EmptyResultException;
}
