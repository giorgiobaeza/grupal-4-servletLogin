package implementacion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import conexion.Singleton;
import interfaces.Iusuario;
import modelo.Usuario;

public class UsuarioImpl implements Iusuario{

	@Override
	public List<Usuario> obtenerUsuario() {

		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		List<Usuario> listausuario = new ArrayList<Usuario>();
		
		String sql = "select * from usuario";
		try {
			con = Singleton.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			
			while(rs.next()) {
				Usuario u = new Usuario();
				u.setNombre(rs.getString(1));
				u.setApellido(rs.getString(2));
				u.setFechaNacimiento(rs.getString(3));
				u.setRun(rs.getInt(4));
				listausuario.add(u);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		return listausuario;
	}

	@Override
	public boolean crearUsuario(Usuario Usr) {
		// TODO Auto-generated method stub
		
		boolean resultado = false;
		Connection con = null;
		Statement stm = null;
		
		String sql = "INSERT INTO USUARIO VALUES ('" 
				+ Usr.getNombre() + "','" 
				+ Usr.getApellido() + "','" 
				+ "to_date('" + Usr.getFechaNacimiento() + "', 'DD/MM/YYYY')," 
				+ Usr.getRun() + "')";
		
		try {
			con = Singleton.getConnection();
			stm = con.createStatement();
			stm.execute(sql);
			resultado = true;
			stm.close();
		}
		catch (SQLException e) {
			System.out.println(e);
		}
		return resultado;

	}
	
	

}
