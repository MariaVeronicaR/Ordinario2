package com.mayab.calidad.dao;


import java.util.HashMap;

public class DAOOracle implements DAO{
	HashMap<Integer,Alumno> registrosAlumnos= new HashMap<Integer,Alumno>();

	
	public void addAlumno(Alumno a) {
		// TODO Auto-generated method stub
		registrosAlumnos.put(a.getId(), a);	
		
	}

	
	public void deleteAlumno(Alumno a) {
		// TODO Auto-generated method stub
		registrosAlumnos.remove(a.getId());		
		
	}
	
	public String getAlumno(int id) {
		// TODO Auto-generated method stub
		String auxi=registrosAlumnos.get(id).toString();
		return auxi;
	}

public void updatePromedio(Alumno a, float NuevoPromedio) {
	registrosAlumnos.get(a.getId()).setPromedio(NuevoPromedio);
}
	

	@Override
	public int getNumeroAlumnos() {
		// TODO Auto-generated method stub
		return registrosAlumnos.size();	
		}

	@Override
	public void addAlumno(com.mayab.calidad.doubles.Alumno a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAlumno(com.mayab.calidad.doubles.Alumno a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePromedio(com.mayab.calidad.doubles.Alumno a, float NuevoPromedio) {
		// TODO Auto-generated method stub
		
	}


	
	

}
