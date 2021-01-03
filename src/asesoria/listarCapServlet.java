package asesoria;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class listarCapServlet
 */
@WebServlet("/listarCapServlet")
public class listarCapServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public listarCapServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String usu, pass;
		String sesion = (String) request.getParameter("user");
		HttpSession misesion = request.getSession();
		misesion.setAttribute("nombresesion", sesion);
		usu = request.getParameter("usuario");
		pass = request.getParameter("contra");
        if(misesion.equals("admin")){
            //si coincide usuario y password y además no hay sesión iniciada
            
            //redirijo a página con información de login exitoso
        	response.sendRedirect("listarCapacitacion.jsp");
        }else{
        	response.sendRedirect("login.jsp");
        }	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
	}

}
