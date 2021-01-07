package interfaces;

import java.util.List;

import modelo.Usuario;

public interface Iusuario {

	public List<Usuario> obtenerUsuario();
	public boolean  crearUsuario(Usuario Usr);
}
