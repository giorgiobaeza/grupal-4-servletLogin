package interfaces;

import java.util.List;

import modelo.Cliente;
import modelo.Usuario;

public interface Iusuario {

	public List<Usuario> obtenerUsuario();
	public boolean crearUsuario(Usuario Usr);
	boolean crearCliente(Cliente cli);
}
