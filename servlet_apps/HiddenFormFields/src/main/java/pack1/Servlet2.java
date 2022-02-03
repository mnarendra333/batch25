package pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet2
 */
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//collect form2/current req data
		String incomeValue = request.getParameter("income");
		String taxValue = request.getParameter("tax");
		
		//collect form-1 data
		
		
		String unameValue = request.getParameter("un");
		String phnoNoValue = request.getParameter("pno");
	
		PrintWriter out = response.getWriter();
		out.println("form1 - data => "+unameValue+" "+phnoNoValue);
		out.println("form2 - data => "+incomeValue+" "+taxValue);
		
	}

}
