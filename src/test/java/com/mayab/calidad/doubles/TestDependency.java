package com.mayab.calidad.doubles;

import static org.junit.Assert.*;
import org.junit.Test;
import doubles.Dependency;
import doubles.SubDependency;

import org.junit.Before;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.when;
//import static org.testing.Assert.assertEquals;

public class TestDependency {
	
	private Dependency dependency;
	
	@Before
	public void setUpMocks()
	{
		dependency= mock(Dependency.class);
		//dependency = new Dependency (new SubDependency());
	}
	@Test
	public void test() {
		when(dependency.getClassName()).thenReturn("MiNombre");
		assertThat(dependency.getClassName(),is("MiNombre")); //is("com.mayab.calidad.doubles.Dependency.class")
		assertNull(dependency.getClassNameUpperCase());
		assertNull(dependency.getSubdependencyClassname());
	}

	@Test
	public void OtroTest()
	{
		when(dependency.getClassName()).thenReturn("OtroNombre");
		assertThat(dependency.getClassName(),is("OtroNombre")); //is("com.mayab.calidad.doubles.Dependency.class")
		
	}
}
