package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import implementacion.UsuarioImpl;
import modelo.Profesional;

/**
 * Servlet implementation class ActualizaProfesionalServlet
 */
@WebServlet("/ActualizaProfesionalServlet")
public class ActualizaProfesionalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActualizaProfesionalServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		doGet(request, response);
		int rut = Integer.parseInt(request.getParameter("run"));
		String nombre = request.getParameter("nombre");
		String apellidos = request.getParameter("apellido");
		int telefono = Integer.parseInt(request.getParameter("telefono"));
		String titulo = request.getParameter("titulo");
		int proyecto = Integer.parseInt(request.getParameter("proyecto"));
		int usuariorun = Integer.parseInt(request.getParameter("runusuario"));
	

		
		Profesional pro = new Profesional(rut,nombre,apellidos,telefono,titulo,proyecto,usuariorun);
		UsuarioImpl usrimpl = new UsuarioImpl();
		boolean res = usrimpl.crearProfesional(pro);
		
		String msg = "";
		
		if (res) {
			msg = "El Profesional se agregó correctamente";
		}
		else {
			msg = "No se pudo agregar al Profesional";
		}
		
		request.setAttribute("mensaje", msg);
	
		request.getRequestDispatcher("ConfirmaCrearUsuario.jsp").forward(request, response);
	}
	

}
