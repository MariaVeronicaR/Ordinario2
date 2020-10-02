package dbunit;

import java.sql.Connection;
import java.sql.DriverManager;

public class AlumnoDAOoracle implements AlumnoDAO {
public Connection getConnectionORACLE()
{
	Connection con=null;  
    try{  
        Class.forName("oracle.jdbc.driver.OracleDriver");  
        con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","!@#!#@","!@#!#!@#");  
    }catch(Exception e){System.out.println(e);}  
    return con;
    
}

public void addAlumno (Alumno alumno)
{
	
}

public void removeAlumno(Alumno alumno)
{
	
}

public void updatePromedio(Alumno alumno)
{
	
}
}
