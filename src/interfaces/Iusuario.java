package interfaces;

import java.util.List;

import modelo.Administrativo;
import modelo.Cliente;
import modelo.Profesional;
import modelo.Usuario;

public interface Iusuario {

	public List<Usuario> obtenerUsuario();
	public boolean crearUsuario(Usuario Usr);
	boolean crearCliente(Cliente cli);
	boolean crearAdministrativo(Administrativo Adm);
	boolean crearProfesional(Profesional Pro);
	public Profesional obtenerProfesionalPorRun(int runusuario);

}
