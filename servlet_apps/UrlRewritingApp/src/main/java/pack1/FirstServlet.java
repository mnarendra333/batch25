package pack1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String perName = request.getParameter("pname");
		String fatName = request.getParameter("fname");
		String phNo = request.getParameter("phoneno");
		String perEmail = request.getParameter("email");
		
		
		HttpSession session = request.getSession();
		System.out.println(session.getId());
		session.setAttribute("namekey", perName);
		session.setAttribute("fnamekey", fatName);
		session.setAttribute("phNokey", phNo);
		session.setAttribute("emailKey", perEmail);
		
		RequestDispatcher rd = request.getRequestDispatcher("page2.jsp");
		rd.include(request, response);
		
		
		
		
		
		
	}

}
