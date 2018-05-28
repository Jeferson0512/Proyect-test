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
import com.tecsup.gestion.model.Pais;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml")
@WebAppConfiguration
public class PaisDAOTest {

	private static final Logger logger = LoggerFactory.getLogger(PaisDAOTest.class);
	
	@Autowired
	private PaisDAO paisDAO;
	
	@BeforeClass
	public static void beforeClass() {
		logger.info("Antes de todos los metodos");

	}
	
	@Before
	public  void before() {
		logger.info("Antes de cada metodo");
	}
	
	@Test
	public void testFindAllPais() {
		
		try {
			
			List<Pais> pais = paisDAO.findAllPais();
			
			logger.info(pais.toString());
			
		}catch (EmptyResultException e) {
			fail(e.getMessage());
		}catch (DAOException e) {
			fail(e.getMessage());
		}
		
	}
	
	@Test
	public void testFindPaisNombre() {
		
		try {
			
			Pais pais = paisDAO.findPais(11);
			
			Assert.assertNotNull(pais);
			
			logger.info(pais.toString());
			
		}catch (EmptyResultException e) {
			fail(e.getMessage());
		} catch (DAOException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testCreatePais() {
		
		logger.info("Creando un Pais");
		
		String nombre_p = "Pais-Creado-1";
		logger.info(nombre_p);
		String nombre_adjunto = "PC1";
		String imagen = "imagen-1.jpg";
		String escudo = "escudo-1";
		String continente = "continente-1";
		String grupo = "grupo-1";
		int puntos = 0;
		String description = "";
				
		try {
			
			paisDAO.createPais(nombre_p, nombre_adjunto, imagen, escudo, continente, grupo, puntos, description);
			
			Pais pais = paisDAO.findPaisName(nombre_p);
			
			//logger.info(pais.toString());
			
		}catch(DAOException e) {
			fail(e.getMessage());
		}catch (EmptyResultException e) {
			fail(e.getMessage());
		}
		
	}
	
	@Test
	public void testUpdatePais() {
		
		String nombre_p = "Pais-Creado-2";
		String nombre_adjunto = "PC2";
		String imagen = "imagen-2.jpg";
		String escudo = "escudo-2";
		String continente = "continente-2";
		String grupo = "grupo-2";
		int puntos = 0;
		String description = "";
		
		String up_nombre_adjunto = "PC3";
		String up_imagen = "imagen-3.jpg";
		String up_escudo = "escudo-3";
		String up_continente = "continente-3";
		String up_grupo = "grupo-3";
		int up_puntos = 0;
		String up_description = "";
		
		try {
			
			paisDAO.createPais(nombre_p, nombre_adjunto, imagen, escudo, continente, grupo, puntos, description);
			
			paisDAO.updatePais(nombre_p, up_nombre_adjunto, up_imagen, up_escudo, up_continente, up_grupo, up_puntos, up_description);
			
			Pais pais = paisDAO.findPaisName(nombre_p);
			
			//logger.info(pais.toString());
			
		}catch (DAOException e) {
			fail(e.getMessage());
		}catch (EmptyResultException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testDeletePais() {
		
		String nombre_p = "Pais-Creado-1";
		
		try {
			
			paisDAO.deletePais(nombre_p);
			
			logger.info("Eliminando el departamento: "+nombre_p);
			
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
