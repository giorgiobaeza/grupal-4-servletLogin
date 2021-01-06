package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Singleton {

    // Propiedades
    private static Connection conn = null;

    // Constructor
    private Singleton(){ 
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		String usuario = "ventas";
		String password = "1234";
    	
		try{
			Class.forName(driver);
			conn = DriverManager.getConnection
			(url, usuario, password);
		}
		catch (ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}
	} // Fin constructor
    
	// Métodos
	public static Connection getConnection(){
		if (conn == null){
			new Singleton();
		}
	  
		return conn;
	} // Fin getConnection
    
}
