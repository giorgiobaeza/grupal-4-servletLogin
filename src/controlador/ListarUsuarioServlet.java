package controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import implementacion.UsuarioImpl;
import modelo.Usuario;

/**
 * Servlet implementation class ListadoDeUsuarios
 */
@WebServlet("/listarUsuarioServlet")
public class ListarUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarUsuarioServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		HttpSession misesion = request.getSession();
		
		if (misesion == null) {
			response.sendRedirect("login");
		}
		else {
			UsuarioImpl usuarioimpl = new UsuarioImpl();
			List<Usuario> listausuario = usuarioimpl.obtenerUsuario();
			request.setAttribute("lusuario", listausuario);
			request.getRequestDispatcher("listadoUsuarios.jsp").forward(request, response);
		}	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
	}

}
