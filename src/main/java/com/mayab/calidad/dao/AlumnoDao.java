package com.mayab.calidad.dao;

public interface AlumnoDao {
//operaciones CRUD
	public Boolean agregarAlumno(Alumno alumno);
	public Boolean eliminarAlumno(Alumno alumno);
	public Boolean actualizarPromedio(Alumno alumno, Float promedio);
	public String getAlumno(String id);
}
