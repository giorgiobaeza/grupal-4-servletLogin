package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import implementacion.CapacitacionImpl;
import implementacion.UsuarioImpl;
import modelo.Capacitacion;
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
		//doGet(request, response);
				String nombre = request.getParameter("capfecha");
				String apellido = request.getParameter("caphora");
				String fechanacimiento = request.getParameter("caplugar");
				int run = Integer.parseInt(request.getParameter("capduracion"));
				
				Usuario Usr = new Usuario(nombre,apellido,fechanacimiento,run);
				UsuarioImpl Usrimpl = new UsuarioImpl();
				boolean res = Usrimpl.crearUsuario(Usr);
				
				String msg = "";
				
				if (res) {
					msg = "El ha sido creada";
				}
				else {
					msg = "No se pudo guardar la capacitación";
				}
				
				request.setAttribute("mensaje", msg);
			
				request.getRequestDispatcher("ConfirmaCrearCap.jsp").forward(request, response);
		        
			}

}
