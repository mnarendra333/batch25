package com.pragim.scopesinservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
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
		
		String reqUname = request.getParameter("name");
		String reqage = request.getParameter("age");
		
		HttpSession session = request.getSession();
		String sessUname = (String)session.getAttribute("name");
		String sessage = (String)session.getAttribute("age");
		
		ServletContext ctx = getServletContext();
		String ctxUname = (String)ctx.getAttribute("name");
		String ctxage = (String)ctx.getAttribute("age");
		
		
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		
		
		pw.println("request data "+reqUname+" "+reqage);
		
		pw.println("session data "+sessUname+" "+sessage);
		
		pw.println("ctx data "+ctxUname+" "+ctxage);
	
		
	}

}
