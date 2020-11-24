package com.mayab.calidad.dao;

import java.util.HashMap;


public class DAOOracle implements AlumnoDao{

	private HashMap<Integer, Alumno> registros = new HashMap<Integer, Alumno>();

	@Override
	public Boolean agregarAlumno(Alumno alumno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean eliminarAlumno(Alumno alumno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean actualizarPromedio(Alumno alumno, Float promedio) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAlumno(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public HashMap<Integer, Alumno> getRegistros() {
		return registros;
	}

	public void setRegistros(HashMap<Integer, Alumno> registros) {
		this.registros = registros;
	}

	
}
