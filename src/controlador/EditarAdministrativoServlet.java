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
 * Servlet implementation class EditarAdministrativoServlet
 */
@WebServlet("/EditarAdministrativoServlet")
public class EditarAdministrativoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditarAdministrativoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int runusuario = Integer.parseInt(request.getParameter("run"));

		UsuarioImpl usimpl = new UsuarioImpl();
		Administrativo admaux = usimpl.obtenerAdministrativoPorRun(runusuario);

		request.setAttribute("ad", admaux);
		request.getRequestDispatcher("editarAdministrativo.jsp").forward(request, response);	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
