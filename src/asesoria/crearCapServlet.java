package asesoria;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class crearCapServlet
 */
@WebServlet("/crearCapServlet")
public class crearCapServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public crearCapServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
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
            response.sendRedirect("contacto.jsp");
        }else if (usu.equals("") && pass.equals("")){
        	response.sendRedirect("login.jsp");
        }else{
        	response.sendRedirect("login.jsp");
        }
	}

}
