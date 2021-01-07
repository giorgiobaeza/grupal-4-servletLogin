package conexion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class UsoSingleton {

	public static void main(String[] args) {
		
		try{  
			Connection con = Singleton.getConnection();
			
			//paso 3: crear objeto statement  
			Statement stmt=con.createStatement();  

			//paso 4: ejecutar query
			ResultSet rs = stmt.executeQuery ("select * from capacitacion");
			
			while(rs.next()) {
				System.out.println(rs.getInt(1) + "  " 
				+ rs.getString(2) + "  " + rs.getString(3));  
			}
			
			//paso 5: cierra el objeto de conexión  
			con.close();    
		}
		catch(Exception e){
			System.out.println(e);
		}	
		
	}

}
