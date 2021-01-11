package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import implementacion.UsuarioImpl;
import modelo.Usuario;

/**
 * Servlet implementation class CrearUsuarioServlet
 */
@WebServlet("/CrearUsuarioServlet")
public class CrearUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearUsuarioServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//request.getRequestDispatcher("crearUsuario.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nombre = request.getParameter("nombre");
		String apellidos = request.getParameter("apellidos");
		String fnacimiento = request.getParameter("fnacimiento");
		int rut = Integer.parseInt(request.getParameter("rut"));
		String tipousuario = request.getParameter("tipousuario");

		Usuario usr = new Usuario(nombre,apellidos,fnacimiento,rut,tipousuario);
		UsuarioImpl usrimpl = new UsuarioImpl();
		usrimpl.crearUsuario(usr);
		
		String msg = "";
		
		if (tipousuario.equals("cliente")) {
			request.getRequestDispatcher("editarCliente.jsp").forward(request, response);
		}
		else if (tipousuario.equals("profesional")){
			request.getRequestDispatcher("editarProfesional.jsp").forward(request, response);
		}
		else if (tipousuario.equals("administrativo")){
			request.getRequestDispatcher("editarAdministrativo.jsp").forward(request, response);
		}
		
		request.setAttribute("mensaje", msg);
	
		request.getRequestDispatcher("ConfirmaCrearCap.jsp").forward(request, response);
        
	}

}
