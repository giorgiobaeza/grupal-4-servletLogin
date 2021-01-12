package implementacion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import conexion.Singleton;
import interfaces.Icontacto;
import modelo.Contacto;

public class ContactoImpl implements Icontacto {

	public List<Contacto> obtenerContacto() {
		
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		List<Contacto> listacontacto = new ArrayList<Contacto>();

		String sql = "select * from capacitacion";
		try {
			con = Singleton.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			
			while (rs.next()) {
				Contacto c = new Contacto();
				c.setContNombre(rs.getString(1));
				c.setContCorreoElectronico(rs.getString(2));
				c.setContTelefono(rs.getString(3));
				c.setContMensaje(rs.getString(4));
				listacontacto.add(c);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		return listacontacto;
	}
}