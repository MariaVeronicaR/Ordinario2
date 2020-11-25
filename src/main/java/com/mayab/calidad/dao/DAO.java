package com.mayab.calidad.dao;

public interface DAO {
public void addAlumno(Alumno a);
public void deleteAlumno(Alumno a);
public void updatePromedio(Alumno a, float NuevoPromedio);

int getNumeroAlumnos();
Alumno getAlumno(int id);
}
