package com.mayab.calidad.dao;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.junit.Before;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.*;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.when;

public class TestAlumno {

	private Alumno a;
	private AlumnoDAOforTest a2;

	HashMap<Integer, Integer> bd = new HashMap<Integer, Integer>();
	

	@Before
	public void setUpMocks()
	{
		a2= mock(AlumnoDAOforTest.class); 
		HashMap<Integer, Integer> bd = new HashMap<Integer, Integer>();
		a = new Alumno();
	}
	
	
	@Test
	public void addAlumno() {
		when (a2.agregarAlumno(a)).thenAnswer(new Answer <Integer> () {
			
			public Integer answer(InvocationOnMock invocation) throws Throwable
			{
				
			for (float f : hashMapComision.values()) {
				    account2.suma += f;
				}
				
		        return (int) account2.suma;
			      
			}
			});
		
		int size = database.getDatabase().size();
		
		database.addAlumno(alumno);
		
		
		assertThat(database.getDatabase().size(), is(size + 1));
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
