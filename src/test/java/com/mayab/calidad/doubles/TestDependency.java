package com.mayab.calidad.doubles;

import static org.junit.Assert.*;
import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.junit.Before;
import static org.mockito.Mockito.mock;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.when;
import static org.mockito.Matchers.*;

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
	
	
	@Test
	public void MultiplyTest()
	{
		when (dependency.multiply(anyInt(), anyInt())).thenAnswer(new Answer <Integer> () {
			
			public Integer answer(InvocationOnMock invocation) throws Throwable
			{
				int arg = (Integer) invocation.getArguments() [0];
				int arg2 = (Integer) invocation.getArguments() [1];

				return arg *arg2;
			}
			});
			assertEquals(0, dependency.multiply(10,10));
	}
	@Test(expected= IllegalArgumentException.class)
	public void testException() {
		when(dependency.getClassName()).thenThrow(IllegalArgumentException.class);
		dependency.getClassName();
	

	}
	
	@Test
	public void testDependency()
	{
	 when(dependency.getClassName()).thenReturn("hi there");
	assertEquals("hi there", dependency.getClassName());
	}

	

	@Test
	public void testAddTwo()
	{
	when(dependency.addTwo(anyInt())).thenReturn(5);
	assertEquals(5, dependency.addTwo(1));
	assertEquals(0, dependency.addTwo(27));
	}

	@Test
	public void testAnswer()
	{
		when (dependency.addTwo(anyInt())).thenAnswer(new Answer <Integer> () {
			
		public Integer answer(InvocationOnMock invocation) throws Throwable
		{
			int arg = (Integer) invocation.getArguments() [0];
			return arg +20;
		}
		});
		assertEquals(30, dependency.addTwo(10));
	}
}

	

