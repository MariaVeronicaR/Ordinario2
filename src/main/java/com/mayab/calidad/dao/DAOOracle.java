package com.mayab.calidad.dao;


import java.util.HashMap;

public class DAOOracle implements DAO{
	HashMap<Integer,Alumno> registrosAlumnos= new HashMap<Integer,Alumno>();

	@Override
	public void addAlumno(Alumno a) {
		// TODO Auto-generated method stub
		registrosAlumnos.put(a.getId(), a);	
		
	}

	@Override
	public void deleteAlumno(Alumno a) {
		// TODO Auto-generated method stub
		registrosAlumnos.remove(a.getId());		
		
	}
@Override
	public Alumno getAlumno(int id) {
		// TODO Auto-generated method stub
		return registrosAlumnos.get(id);
	}

@Override
public void updatePromedio(Alumno a, float NuevoPromedio) {
	registrosAlumnos.get(a.getId()).setPromedio(NuevoPromedio);
}
	

	@Override
	public int getNumeroAlumnos() {
		// TODO Auto-generated method stub
		return registrosAlumnos.size();	
		}

	
	

}
