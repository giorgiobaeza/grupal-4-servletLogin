package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import implementacion.CapacitacionImpl;
import modelo.Capacitacion;

/**
 * Servlet implementation class CrearCapServlet
 */
@WebServlet("/CrearCapServlet")
public class CrearCapServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearCapServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		int id = Integer.parseInt(request.getParameter("idcap"));
		String fecha = request.getParameter("capfecha");
		String hora = request.getParameter("caphora");
		String lugar = request.getParameter("caplugar");
		int duracion = Integer.parseInt(request.getParameter("capduracion"));
		int rutcliente = Integer.parseInt(request.getParameter("caprutcliente"));
		
		Capacitacion cap = new Capacitacion(id,fecha,hora,lugar,duracion,rutcliente);
		CapacitacionImpl capimpl = new CapacitacionImpl();
		boolean res = capimpl.crearCapacitacion(cap);
		
		String msg = "";
		
		if (res) {
			msg = "La Capacitacion ha sido creada";
		}
		else {
			msg = "No se pudo guardar la capacitación";
		}
		
		request.setAttribute("mensaje", msg);
	
		request.getRequestDispatcher("ConfirmaCrearCap.jsp").forward(request, response);
        
	}

}
