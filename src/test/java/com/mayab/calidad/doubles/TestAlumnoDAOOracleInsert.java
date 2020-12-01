package com.mayab.calidad.doubles;
import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Test;

import com.mayab.calidad.dao.AlumnoDAOforTest;
import com.mayab.calidad.doubles.Alumno;

import static org.junit.Assert.*;

import static org.hamcrest.Matchers.*;

import org.dbunit.DBTestCase;
import org.dbunit.DatabaseUnitException;
import org.dbunit.dataset.DataSetException;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.ITable;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.dbunit.operation.DatabaseOperation;

import org.dbunit.PropertiesBasedJdbcDatabaseTester;
import org.dbunit.database.IDatabaseConnection;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.dbunit.Assertion;

public class TestAlumnoDAOOracleInsert extends DBTestCase {
	
	
	public TestAlumnoDAOOracleInsert(String name)
	{
			super(name);
//			System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_DRIVER_CLASS, "oracle.jdbc.driver.OracleDriver"); //.driver.Or...
//			System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_CONNECTION_URL, "jdbc:oracle:thin:@localhost:1522:xe");
//			System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_USERNAME, "dbunit");
//			System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_PASSWORD, "dbunit");
			
			System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_DRIVER_CLASS, "com.mysql.cj.jdbc.Driver");
			System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_CONNECTION_URL, "jdbc:mysql://localhost:3306/DBUnit"
				+ "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
			System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_USERNAME, "root");
			System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_PASSWORD, "");
			
			
			
	}
		
	@Before
	public void setUp() throws Exception{
		
		super.setUp();
		IDatabaseConnection con = getConnection();
		try {
			DatabaseOperation.CLEAN_INSERT.execute(con, getDataSet());
		}
		finally {
			con.close();	
		}
	}
	

	@After
	public void tearDown() throws Exception{
		
	}
	
	
	@Test
	public void testInsert() throws Exception {
		
				Alumno a = new Alumno();
				a.setId(2);
				a.setNombre("Melissa");
				a.setEdad(20);
				a.setPromedio(0);
				a.setEmail("prueba@asd.com");

				DAOOracle dao = new DAOOracle();
				dao.addAlumno(a);
				IDatabaseConnection con = null;
				int actualRows = 0;
				try {
					con = getConnection();
					actualRows =  con.getRowCount("Alumnos");
					
				dao.addAlumno(a);
					
					
				}catch(Exception e) {
					e.printStackTrace();
				}
				assertEquals(actualRows+1, con.getRowCount("Alumnos"));
				con.close();
	}

	@Test
	public void testDelete() throws Exception
	{
				Alumno a = new Alumno();
				DAOOracle otrodao = new DAOOracle();
				IDatabaseConnection con = null;
				int actualRows = 0;
				try {
					con = getConnection();
					actualRows = con.getRowCount("alumno");
					otrodao.deleteAlumno(a);					
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				assertEquals(actualRows-1, con.getRowCount("alumno"));
				con.close();
	}

	@Override
	protected IDataSet getDataSet() throws Exception {
		// TODO Auto-generated method stub
		
		return new FlatXmlDataSetBuilder().build(new File("/my-app/src/resources/alumno.xml"));
	}
}
	


