package com.mayab.calidad.dao;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;
import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.junit.Before;
import org.junit.FixMethodOrder;

import static org.mockito.Mockito.mock;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.when;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestAlumno {


	public Alumno a1;

	DAOOracle DaoAlumno;
	
	@Before
	public void setUp() {
		a1= new Alumno("meli", 20, 1, 5, "ejemplo@asd.com");
		DaoAlumno= new DAOOracle();
		DaoAlumno.addAlumno(a1);
	}
	
	@Test
	public void addtest() {
		int comp1=DaoAlumno.getNumeroAlumnos(); //ahorita hay 1
		Alumno a2 = new Alumno();
		DaoAlumno.addAlumno(a2); //Ahora hay 2 
		int comp2=DaoAlumno.getNumeroAlumnos();
		assertThat(comp2,is(comp1+1));

	}
	
	@Test
	public void btestUpdate() {
		
		
		DaoAlumno.updatePromedio(a1,80.0f);
		
		assertThat(a1.getPromedio(),is(80.0f));

	}
	
	@Test
	public void ctestGetNumAlumnos() {
		assertThat(DaoAlumno.getNumeroAlumnos(),is(1));

	}
	
	
	
	@Test
	public void dtestGetAlumnos() {

		assertThat(DaoAlumno.getAlumno(1).toString(),is(a1.toString()));

	}

	@Test
	public void etestRemove() {
		DaoAlumno.deleteAlumno(a1);
		int comp2=DaoAlumno.getNumeroAlumnos();
		
		assertThat(comp2,is(0));

	}
}
