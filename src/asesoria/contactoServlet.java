package asesoria;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class contactoServlet
 */
@WebServlet("/contactoServlet")
public class contactoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public contactoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession misesion = request.getSession(false);
		if (misesion == null) {
		       // Not created yet. Now do so yourself.
    		request.getRequestDispatcher("login.jsp").forward(request, response);
		} else {
		
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		HttpSession misesion = request.getSession();
		String sesion = (String) request.getParameter("user");
		misesion.setAttribute("nombresesion", sesion);
		String usu = (String) request.getParameter("user");
		String pass = (String) request.getParameter("password");
		request.setAttribute("usuario", usu);
		request.setAttribute("contra", pass);
        if(usu.equals("admin") && pass.equals("1234")){
            //si coincide usuario y password y además no hay sesión iniciada
            
            //redirijo a página con información de login exitoso
            response.sendRedirect("contacto.jsp");
        }else {
        	response.sendRedirect("login.jsp");
        }
		
	}

}
