package com.mayab.calidad.dao;

import com.mayab.calidad.doubles.Alumno;

public interface DAO {
public void addAlumno(Alumno a);
public void deleteAlumno(Alumno a);
public void updatePromedio(Alumno a, float NuevoPromedio);

int getNumeroAlumnos();
String getAlumno(int id);
}
