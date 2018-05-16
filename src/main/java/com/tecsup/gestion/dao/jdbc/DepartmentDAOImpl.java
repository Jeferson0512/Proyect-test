package com.tecsup.gestion.dao.jdbc;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.tecsup.gestion.dao.DepartmentDAO;
import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.mapper.DepartmentMapper;
import com.tecsup.gestion.model.Department;

@Repository
public class DepartmentDAOImpl implements DepartmentDAO{

	private static final Logger logger = LoggerFactory.getLogger(DepartmentDAOImpl.class);
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public Department findDepartment(int department_id) throws DAOException, EmptyResultException {
		
		String query = "SELECT department_id, name, description, city FROM departments WHERE department_id = ?";
		
		Object[] params = new Object[] {department_id};
		
		try {
			Department dpt = (Department) jdbcTemplate.queryForObject(query, params, new DepartmentMapper());
			
			return dpt;
			
		} catch (EmptyResultDataAccessException e) {
			throw new EmptyResultException();
		} catch (Exception e) {
			logger.info("Error: " + e.getMessage());
			throw new DAOException(e.getMessage());
		}
	}

	@Override
	public List<Department> findAllDeparments() throws DAOException, EmptyResultException {
		
		String query = "SELECT department_id, name, description, city FROM departments";
		
		try {
			
			List<Department> department = jdbcTemplate.query(query, new DepartmentMapper());
			
			return department;
			
		}catch (EmptyResultDataAccessException e) {
			throw new EmptyResultException();
		}catch (Exception e) {
			logger.info("Error: "+e.getMessage());
			throw new DAOException(e.getMessage());
		}
		
	}

	@Override
	public void createDepa(String name, String description, String city) throws DAOException {
		
		String query = "INSERT INTO departments (name, description, city) VALUES (?,?,?)";
		
		Object[] params = new Object[] {name, description, city};
		
		Department dpt = null;
		
		try {
			
			jdbcTemplate.update(query, params);
			
			dpt = this.findDepartmentName(name);
			
		}catch (EmptyResultException e) {
			e.printStackTrace();
		}catch (Exception e) {
			logger.info("Error: "+e.getMessage());
			throw new DAOException(e.getMessage());
		}
		
	}

	@Override
	public Department findDepartmentName(String name) throws DAOException, EmptyResultException {
		
		String query = "SELECT department_id, name, description, city FROM departments WHERE name = ?";
		
		Object[] params = new Object[] {name};
		
		try {
			
			Department department = jdbcTemplate.queryForObject(query, params, new DepartmentMapper());
			
			return department;
			
		}catch (EmptyResultDataAccessException e) {
			throw new EmptyResultException();
		}catch (Exception e) {
			logger.info("Error: "+e.getMessage());
			throw new DAOException(e.getMessage());
		}
		
	}

	@Override
	public void deleteDepa(String name) throws DAOException {
		
		String query = "DELETE FROM departments WHERE name = ?";
		
		Object[] params = new Object[] { name };
		
		try {
			
			jdbcTemplate.update(query, params);
			
		}catch (Exception e) {
			logger.info("Error: "+e.getMessage());
			throw new DAOException(e.getMessage());
		}
		
	}

	@Override
	public void updateDepa(String name, String description, String city) throws DAOException {

		String query = "UPDATE departments SET description = ?, city = ? WHERE name = ?";
		
		Object[] params = new Object[] { description, city, name };
		
		try {
			
			jdbcTemplate.update(query, params);
			
		} catch (Exception e) {
			
			logger.info("Error: "+e.getMessage());
			throw new DAOException(e.getMessage());
			
		}
		
	}

}
