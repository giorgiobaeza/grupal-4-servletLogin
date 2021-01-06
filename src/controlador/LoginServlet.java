package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
    		request.getRequestDispatcher("login.jsp").forward(request, response);
        
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String usu, pass;
        usu = request.getParameter("user");
        pass = request.getParameter("password");
        if(usu.equals("admin") && pass.equals("1234")){
            //si coincide usuario y password y además no hay sesión iniciada
            
            //redirijo a página con información de login exitoso
        	HttpSession misesion = request.getSession();
    		String sesion = (String) request.getParameter("user");
        	misesion.setAttribute("nombresesion", sesion);
            response.sendRedirect("contacto.jsp");
        }else {
        	response.sendRedirect("login.jsp");
        }
		
	}

}
