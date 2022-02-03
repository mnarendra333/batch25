package pack1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SecondServlet
 */
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String qualification = request.getParameter("quali");
		String year = request.getParameter("year");
		String university = request.getParameter("univ");
		
		
		HttpSession session = request.getSession();
		System.out.println(session.getId());
		
		session.setAttribute("qualKey", qualification);
		session.setAttribute("yearkey", year);
		session.setAttribute("universityKey", university);
		
		
		RequestDispatcher rd = request.getRequestDispatcher("form3.html");
		rd.forward(request, response);
		
	}

}
