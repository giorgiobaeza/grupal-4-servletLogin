package asesoria;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class inicioServlet
 */
@WebServlet("/inicioServlet")
public class inicioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public inicioServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("inicio.jsp").forward(request, response);
		/*response.getWriter().append("Served at: ").append(request.getContextPath());
	
		PrintWriter out;
		response.setContentType("text/html");
		out = response.getWriter();
		out.println("<html><head><title>Inicio</title>");
		out.println("<link rel=\"stylesheet\" href=\"estilo.css\">");
		out.println("/head");
		out.println("<body>");
		out.println("<header id=\"seccion\">\r\n"
				+ "        <h2> INICIO</h2>\r\n"
				+ "        <h2>Nombre de nuestra Empresa</h2>\r\n"
				+ "        <div class=\"content-menu\">\r\n"
				+ "        <input type=\"checkbox\" id=\"check\">\r\n"
				+ "        <label class=\"icon-menu\" for=\"check\"><img src=\"iconos/icono-menu.png\" alt=\"\" class=\"icon-menu\"\r\n"
				+ "                for=\"check\"></label>\r\n"
				+ "\r\n"
				+ "        <nav class=\"menu\">\r\n"
				+ "            <ul>\r\n"
				+ "                <li><a href=\"contacto.html\">Contacto</a></li>\r\n"
				+ "                <li><a href=\"login.html\">Ingreso</a></li>\r\n"
				+ "                <li><a href=\"crearusuario.html\">Crear Usuario</a></li>\r\n"
				+ "                <li><a href=\"crearcapacitacion.html\">Crear Capacitaciones</a></li>\r\n"
				+ "                <li><a href=\"listarcapacitaciones.html\">Listar Capacitaciones</a></li>\r\n"
				+ "                <li><a href=\"administrarasistentes.html\">Asistentes Capacitaciones</a></li>\r\n"
				+ "                <li><a href=\"listadovisitas.html\">Listado Visitas</a></li>\r\n"
				+ "                <li><a href=\"listadopago.html\">Listado Pago</a></li>\r\n"
				+ "                <li><a href=\"listadoasesorias.html\">Listado Asesorías</a></li>\r\n"
				+ "                <li><a href=\"listadoaccidentes.html\">Listado Accidentes</a></li>\r\n"
				+ "                <li><a href=\"reportes.html\">Reportes</a></li>\r\n"
				+ "\r\n"
				+ "            </ul>\r\n"
				+ "        </nav>\r\n"
				+ "        </div>\r\n"
				+ "    </header>\r\n"
				+ "    <fieldset class=\"cel- agrupar-t agrupar-e\">\r\n"
				+ "        <section>\r\n"
				+ "\r\n"
				+ "                <h3>¿CUÁL ES EL OBJETIVO DEL SISTEMA DE INFORMACIÓN?</h3>\r\n"
				+ "\r\n"
				+ "                <p class=\"cel- texto-t texto-e\">Administrar los principales procesos que se llevan a cabo en ella día a día.</p>\r\n"
				+ "        </section>\r\n"
				+ "\r\n"
				+ "        <section>\r\n"
				+ "\r\n"
				+ "                <h3>¿QUIÉNES DEBERÍAN USAR EL SISTEMA?</h3>\r\n"
				+ "\r\n"
				+ "                <p class=\"cel- texto-t texto-e\">Personal responsable de los principales procesos</p>\r\n"
				+ "        </section>\r\n"
				+ "\r\n"
				+ "        <section>\r\n"
				+ "\r\n"
				+ "                <h3>¿QUÉ PROCESOS CONSIDERA LA PLATAFORMA ACTUALMENTE?</h3>\r\n"
				+ "\r\n"
				+ "                <p class=\"cel- texto-t texto-e\">Asesorías en prevención de riesgos</p>\r\n"
				+ "        </section>\r\n"
				+ "    </fieldset>\r\n"
				+ "    <footer id=\"pie\">\r\n"
				+ "        Derechos Reservados G3 &copy; 2020\r\n"
				+ "    </footer>");
		out.println("</body></html>");
		out.close();*/
		

		
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
