package com.mayab.calidad.dao;

public class AlumnoDriver {
public static void main(String[] args) {
		


		AlumnoDAOforTest dao = new AlumnoDAOforTest();
		Alumno a = new Alumno("MELI", 20, 3, 4, "HOLA@ASD.COM");
		
		dao.getConnection();

		
	//	dao.addAlumno(a); //para confirmar q funciona
	

	}
}
