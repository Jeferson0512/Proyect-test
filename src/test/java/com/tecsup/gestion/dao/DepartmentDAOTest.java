package com.tecsup.gestion.dao;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.tecsup.gestion.exception.DAOException;
import com.tecsup.gestion.exception.EmptyResultException;
import com.tecsup.gestion.model.Department;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml")
@WebAppConfiguration
public class DepartmentDAOTest {

	private static final Logger logger = LoggerFactory.getLogger(DepartmentDAOTest.class);
	
	@Autowired
	private DepartmentDAO departmentDAO;
	
	@BeforeClass
	public static void beforeClass() {
		logger.info("Antes de todos los metodos");

	}
	
	@Before
	public  void before() {
		logger.info("Antes de cada metodo");
	}
	
	@Test
	public void testFindAllDepartment() {
		
		try {
			
			List<Department> dpts = departmentDAO.findAllDeparments();
			
			logger.info(dpts.toString());
			
		}catch (EmptyResultException e) {
			fail(e.getMessage());
		}catch (DAOException e) {
			fail(e.getMessage());
		}
		
	}
	/*
	@Test
	public void testFindDepartmentName() {
		
		try {
		
			Department dpt = departmentDAO.findDepartment(52);
			
			Assert.assertNotNull(dpt);
			
			logger.info(dpt.toString());
			
		}catch (EmptyResultException e) {
			fail(e.getMessage());
		} catch (DAOException e) {
			fail(e.getMessage());
		}
		
	}
	
	
	@Test
	public void testCreateDepartment(){
		
		logger.info("Creating new Department");
		
		String NAME = "Sheraton";
		logger.info(NAME);
		String DESCRIPTION = "Description of the Sheraton";
		String CITY = "City of Sheraton"; 
		
		try {
			
			departmentDAO.createDepa(NAME, DESCRIPTION, CITY);
			
			Department dpt = departmentDAO.findDepartmentName(NAME);
			
			logger.info(dpt.toString());
			
		}catch(DAOException e) {
			fail(e.getMessage());
		}catch (EmptyResultException e) {
			fail(e.getMessage());
		}
	}
	
	
	@Test
	public void testUpdateDepartment() {
		
		String NAME = "Sheraton-3";
		String DESCRIPTION = "descripcion de Sheraton-3";
		String CITY = "Ciudad de Sheraton-3";
		
		String UP_DESCRIPTION = "Description of the Sheraton-2";
		String UP_CITY = "City of Sheraton-2";
		
		try {
			
			departmentDAO.createDepa(NAME, DESCRIPTION, CITY);
			
			departmentDAO.updateDepa(NAME, UP_DESCRIPTION, UP_CITY);
			
			Department dpt = departmentDAO.findDepartmentName(NAME);
			
			logger.info(dpt.toString());
			
		}catch (DAOException e) {
			fail(e.getMessage());
		}catch (EmptyResultException e) {
			fail(e.getMessage());
		}
		
	}
	*/
	
	@Test
	public void testDeleteDepartment() {
		
		String NAME = "Sheraton";
		
		try {
			
			departmentDAO.deleteDepa(NAME);
			
			logger.info("Eliminando el departamento: "+NAME);
			
		} catch (DAOException e) {
			fail(e.getMessage());
		}
		
	}
	
	@After
	public void after() {
		logger.info("Despues de cada metodo");
	}
	
	@AfterClass
	public static void afterClass() {
		logger.info("Despues de todos los metodos");
	}
	
}
