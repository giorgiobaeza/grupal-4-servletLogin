package controlador;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
		Date fechaDate = null;
		Date horaDate = null;
		int id = Integer.parseInt(request.getParameter("idcap"));
		String fecha = request.getParameter("capfecha");
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        try {
        	fechaDate = formato.parse(fecha);
		}
	    catch(ParseException ex) {
	    	 System.out.println(ex);
	    }
		String hora = request.getParameter("caphora");
        SimpleDateFormat formatohora = new SimpleDateFormat("h:mm:s");
        try {
        	horaDate = formatohora.parse(hora);
        }
        catch(ParseException ex) {
        	 System.out.println(ex);
        }
		String lugar = request.getParameter("caplugar");
		int duracion = Integer.parseInt(request.getParameter("capduracion"));
		int rutcliente = Integer.parseInt(request.getParameter("caprutcliente"));
		
		Capacitacion cap = new Capacitacion(id,fechaDate,horaDate,lugar,duracion,rutcliente);
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
