package com.mayab.calidad.dao;

public interface DAO {
public void addAlumno(Alumno a);
public void deleteAlumno(Alumno a);
public void pdatePromedioAlumno (Alumno a, int nuevoPromedio);
int getNumeroAlumnos();
Alumno getAlumno();
}
