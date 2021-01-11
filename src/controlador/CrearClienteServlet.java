package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import implementacion.UsuarioImpl;
import modelo.Cliente;
import modelo.Usuario;

/**
 * Servlet implementation class CrearClienteServlet
 */
@WebServlet("/CrearClienteServlet")
public class CrearClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearClienteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int rut = Integer.parseInt(request.getParameter("run"));
		String nombre = request.getParameter("nombre");
		String apellidos = request.getParameter("apellidos");
		String telefono = request.getParameter("fnacimiento");
		String afp = request.getParameter("fnacimiento");
		int sistemasalud = Integer.parseInt(request.getParameter("rut"));
		String direccion = request.getParameter("tipousuario");
		String comuna = request.getParameter("tipousuario");
		int edad = Integer.parseInt(request.getParameter("rut"));
		int usuariorun = Integer.parseInt(request.getParameter("rut"));

		
		Cliente cli = new Cliente(rut,nombre,apellidos,telefono,afp,sistemasalud,direccion,comuna,edad,usuariorun);
		UsuarioImpl usrimpl = new UsuarioImpl();
		usrimpl.crearCliente(cli);
	}

}
