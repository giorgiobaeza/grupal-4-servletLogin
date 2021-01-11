package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.VentaImpl;
import modelo.Venta;

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
		
				int run = Integer.parseInt(request.getParameter("txtidventa"));
				String nombre = request.getParameter("txtfecha");
				String apellido = request.getParameter("txtvendedor");
				int telefono = Integer.parseInt(request.getParameter("txtmonto"));
				String tituloprofesional = request.getParameter("txtvendedor");
				int proyecto = Integer.parseInt(request.getParameter("txtmonto"));
				int usuariorun = Integer.parseInt(request.getParameter("txtmonto"));

				Venta vt = new Venta(id,fecha,vendedor,monto);
				VentaImpl vtimpl = new VentaImpl();
				boolean res = vtimpl.editarVenta(vt);
				String msg = "";
				
				if (res) {
					msg = "La venta se editó exitosamente";
				}
				else {
					msg = "La venta no se pudo editar porque ocurrió un error";
				}

				request.setAttribute("mensaje", msg);
				request.getRequestDispatcher("msgcrearventa.jsp").forward(request, response);
	}

}
