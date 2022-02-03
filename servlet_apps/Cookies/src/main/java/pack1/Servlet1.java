package pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
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
		

		String username = request.getParameter("uname");
		String phoneNo = request.getParameter("phno");
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<form action=srv2>Income<input type=text name=income><br>");
		out.println("Tax : <input type=text name=tax><br>");
		/*
		 * out.println("<input type=hidden name=un value="+username+">");
		 * out.println("<input type=hidden name=pno value="+phoneNo+">");
		 */
		
		
		
		out.println("<input type=submit value=store><br>");
		
		Cookie c1 = new Cookie("unameKey", username);
		Cookie c2 = new Cookie("phNoKey", phoneNo);
		response.addCookie(c1);
		response.addCookie(c2);
		
		
	}

}
