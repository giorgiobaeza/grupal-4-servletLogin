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
 * Servlet implementation class ActualizarAdministrativoServlet
 */
@WebServlet("/ActualizarAdministrativoServlet")
public class ActualizarAdministrativoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActualizarAdministrativoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int run = Integer.parseInt(request.getParameter("run"));
		String nombres = request.getParameter("nombre");
		String apellidos = request.getParameter("apellido");
		String correo = request.getParameter("email");
		String area = request.getParameter("area");
		int usuariorun = Integer.parseInt(request.getParameter("runusuario"));
		

		Administrativo ad = new Administrativo();
		ad.setRun(run);
		ad.setNombre(nombres);
		ad.setApellido(apellidos);
		ad.setEmail(correo);
		ad.setArea(area);
		ad.setUsuarioRun(usuariorun);
		
		

		UsuarioImpl userimpl = new UsuarioImpl();
		boolean res = userimpl.editarAdministrativo(ad);
		String msg = "";

		if (res) {
			msg = "El administrativo se editó exitosamente";
		} else {
			msg = "El administrativo no se pudo editar porque ocurrió un error";
		}

		request.setAttribute("mensaje", msg);
		request.getRequestDispatcher("ConfirmaCrearUsuario.jsp").forward(request, response);

	}	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
