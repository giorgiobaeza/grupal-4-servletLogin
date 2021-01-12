package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import implementacion.UsuarioImpl;
import modelo.Cliente;


/**
 * Servlet implementation class ActualizarClienteServlet
 */
@WebServlet("/ActualizarClienteServlet")
public class ActualizarClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActualizarClienteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int run = Integer.parseInt(request.getParameter("run"));
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String telefono = request.getParameter("telefono");
		String afp = request.getParameter("afp");
		String sistemasalud = request.getParameter("sissalud");
		String direccion = request.getParameter("direc");
		String comuna = request.getParameter("comuna");
		int edad = Integer.parseInt(request.getParameter("edad"));
		int runusuario = Integer.parseInt(request.getParameter("runusuario"));
		

		Cliente us = new Cliente();
		us.setRutCliente(run);
		us.setCliNombre(nombre);
		us.setCliApellido(apellido);
		us.setCliTelefono(telefono);
		us.setCliAfp(afp);
		us.setCliSistemaSalud(sistemasalud);
		us.setCliDireccion(direccion);
		us.setCliComuna(comuna);
		us.setCliEdad(edad);
		us.setUsuarioRun(runusuario);
		
		

		UsuarioImpl userimpl = new UsuarioImpl();
		boolean res = userimpl.editarCliente(us);
		String msg = "";

		if (res) {
			msg = "El cliente se editó exitosamente";
		} else {
			msg = "El cliente no se pudo editar porque ocurrió un error";
		}

		request.setAttribute("mensaje", msg);
		request.getRequestDispatcher("ConfirmaCrearUsuario.jsp").forward(request, response);	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
