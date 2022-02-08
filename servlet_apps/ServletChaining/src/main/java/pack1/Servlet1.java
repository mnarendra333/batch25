package pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		System.out.println("inside srv1");
		
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("inside srv1");
		
		RequestDispatcher rd = request.getRequestDispatcher("/srv2");
		rd.include(request, response);
		
		
		/*
		 * 
		 * 
		 * 
		 * RequestDispatcher rd = request.getRequestDispatcher("home.html");
		 * rd.include(request, response);
		 */
		/*
		 * RequestDispatcher rd = request.getRequestDispatcher("about.jsp");
		 * rd.include(request, response);
		 */
		
		
	}

}
