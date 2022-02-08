package pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		
		
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		
		String textdata = request.getParameter("desc");
		
		String[] tokens = null;
		if(textdata!=null) {
			tokens = textdata.split(" ");
		}
		for (String string : tokens) {
			pw.println(string);
			pw.println("<br>");
		}
		pw.println(tokens.length);
		
		RequestDispatcher rd = request.getRequestDispatcher("/ss");
		rd.include(request, response);
		
		
	}

}
