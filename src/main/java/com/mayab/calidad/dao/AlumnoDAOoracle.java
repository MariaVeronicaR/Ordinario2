package com.mayab.calidad.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlumnoDAOoracle implements AlumnoDao {
public Connection getConnection()
{
	Connection con=null;  
    try{  
        Class.forName("oracle.jdbc.driver.OracleDriver");  
        con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");  
    }catch(Exception e){System.out.println(e);}  
    return con;
    
}

public void addAlumno (com.mayab.calidad.doubles.Alumno a)
{
	Connection con=getConnection();
	PreparedStatement ps;
	try {
		ps = con.prepareStatement("insert into Alumno(id, nombre, promedio, email, edad) values (?,?,?,?,?)");
		ps.setInt(1, a.getId());
		ps.setString(2, a.getNombre());
		ps.setFloat(3, a.getPromedio());
		ps.setString(4, a.getEmail());
		ps.setInt(5, a.getEdad());
		
		int status = ps.executeUpdate();
		con.close();
	}
		catch(SQLException e)
	{
			e.printStackTrace();
	}

}

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
	Connection con=getConnection();
	PreparedStatement ps;
	
	return null;

	


}

}
