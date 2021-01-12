package implementacion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import conexion.Singleton;
import interfaces.Iusuario;
import modelo.Administrativo;
import modelo.Cliente;
import modelo.Profesional;
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
				u.setTipoUsuario(rs.getString(5));
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
				+ Usr.getApellido() + "'," 
				+ "to_date('" + Usr.getFechaNacimiento() + "', 'DD/MM/YYYY'),'" 
				+ Usr.getRun() + "','"
				+ Usr.getTipoUsuario() + "')";
		
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

	
	@Override
	public boolean crearCliente(Cliente Cli) {
		boolean resultado = false;
		Connection con = null;
		Statement stm = null;
		
		String sql = "INSERT INTO cliente VALUES ('" + Cli.getRutCliente() + "','" 
				+ Cli.getCliNombre() + "','" 
				+ Cli.getCliApellido() + "','" 
				+ Cli.getCliTelefono() + "','" 
				+ Cli.getCliAfp() + "','" 
				+ Cli.getCliSistemaSalud() + "','"
				+ Cli.getCliDireccion() + "','" 
				+ Cli.getCliComuna() + "','" 
				+ Cli.getCliEdad() + "','"
				+ Cli.getUsuarioRun() + "')";
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
	@Override
	public boolean crearAdministrativo(Administrativo Adm) {
		boolean resultado = false;
		Connection con = null;
		Statement stm = null;
		
		String sql = "INSERT INTO administrativo VALUES ('" 
				+ Adm.getRun() + "','" 
				+ Adm.getNombre() + "','" 
				+ Adm.getApellido() + "','" 
				+ Adm.getEmail() + "','" 
				+ Adm.getArea() + "','" 
				+ Adm.getUsuarioRun() + "')";
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
	@Override
	public boolean crearProfesional(Profesional Pro) {
		boolean resultado = false;
		Connection con = null;
		Statement stm = null;
		
		String sql = "INSERT INTO profesional VALUES ('" 
				+ Pro.getRun() + "','" 
				+ Pro.getNombre() + "','" 
				+ Pro.getApellido() + "','" 
				+ Pro.getTelefono() + "','" 
				+ Pro.getTituloProfesional() + "','" 
				+ Pro.getProyecto() + "','" 
				+ Pro.getUsuarioRun() + "')";
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

	
	
	@Override
	public Profesional obtenerProfesionalPorRun(int runusuario) {
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		Profesional p = new Profesional();
		
		String sql = "select run, nombre, apellido, telefono, tituloprofeional, proyecto, usuario_run from profesional where usuario_run = " + runusuario + "";
		
		try {
			con = Singleton.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			
			while (rs.next()) {				
				p.setRun(rs.getInt(1));
				p.setNombre(rs.getString(2));
				p.setApellido(rs.getString(3));
				p.setTelefono(rs.getInt(4));
				p.setTituloProfesional(rs.getString(5));
				p.setProyecto(rs.getInt(6));
				p.setUsuarioRun(rs.getInt(7));
				
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		return p;
	}

	@Override
	public boolean editarProfessional(Profesional editpro) {
		boolean resultado = false;
		Connection con = null;
		Statement stm = null;

		String sql = "UPDATE profesional SET "
				+ "run= " + editpro.getRun() 
				+ ", nombre ='" + editpro.getNombre() 
				+ "', apellidos='" + editpro.getApellido() 
				+ "', telefono='" + editpro.getTelefono()
				+ "', tituloprofesional='" + editpro.getTituloProfesional()
				+ "',proyecto='" + editpro.getProyecto() 
				+ "',usuario_run='" + editpro.getUsuarioRun()
				+ "' WHERE  Usuario_run=" +editpro.getUsuarioRun() + "";
		
			try {
				con = Singleton.getConnection();
				stm = con.createStatement();
				System.out.println(sql);
				stm.execute(sql);
				resultado = true;
				stm.close();
				//con.close();
			} catch (SQLException e) {
				System.out.println(e);
			}
			return resultado;
	}
}
