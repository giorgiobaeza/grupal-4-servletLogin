package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import implementacion.UsuarioImpl;
import modelo.Administrativo;

/**
 * Servlet implementation class CrearAdministrativoServlet
 */
@WebServlet("/CrearAdministrativoServlet")
public class CrearAdministrativoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearAdministrativoServlet() {
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
		//doGet(request, response);
		int rut = Integer.parseInt(request.getParameter("run"));
		String nombre = request.getParameter("nombre");
		String apellidos = request.getParameter("apellido");
		String email = request.getParameter("email");
		String area = request.getParameter("area");
		int usuariorun = Integer.parseInt(request.getParameter("runusuario"));

		
		Administrativo adm = new Administrativo(rut,nombre,apellidos,email,area,usuariorun);
		UsuarioImpl usrimpl = new UsuarioImpl();
		boolean res = usrimpl.crearAdministrativo(adm);
		
		String msg = "";
		
		if (res) {
			msg = "El Administrativo se agregó correctamente";
		}
		else {
			msg = "No se pudo agregar al Administrativo";
		}
		
		request.setAttribute("mensaje", msg);
	
		request.getRequestDispatcher("ConfirmaCrearUsuario.jsp").forward(request, response);
	}

}
