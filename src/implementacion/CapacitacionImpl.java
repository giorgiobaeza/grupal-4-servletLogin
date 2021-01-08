package implementacion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import conexion.Singleton;
import interfaces.Icapacitacion;
import modelo.Capacitacion;

public class CapacitacionImpl implements Icapacitacion {

	@Override
	public List<Capacitacion> obtenerCapacitacion() {
		
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		List<Capacitacion> listacapacitacion = new ArrayList<Capacitacion>();

		String sql = "select * from capacitacion";
		try {
			con = Singleton.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			
			while (rs.next()) {
				Capacitacion c = new Capacitacion();
				c.setIdCapacitacion(rs.getInt(1));
				c.setCapFecha(rs.getString(2));
				c.setCapHora(rs.getString(3));
				c.setCapLugar(rs.getString(4));
				c.setCapDuracion(rs.getInt(5));
				listacapacitacion.add(c);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		return listacapacitacion;
		
	}

	@Override
	public boolean crearCapacitacion(Capacitacion cap) {

		boolean resultado = false;
		Connection con = null;
		Statement stm = null;
		
		String sql = "insert into capacitacion values ('" + cap.getIdCapacitacion()
		+ "','" + cap.getCapFecha() + "','" + cap.getCapHora()
		+ "','" + cap.getCapLugar() + "','" + cap.getCapDuracion() + "','" + cap.getCliente_rutCliente() + "')";
		
		try {
			con = Singleton.getConnection();
			stm = con.createStatement();
			stm.execute(sql);
			resultado = true;
			stm.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return resultado;
	}


}
