package pack1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pack2.ConnectionUtility;

/**
 * Servlet implementation class ThirdServlet
 */
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThirdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		//current-request data
		String skill = request.getParameter("skill");
		String exp = request.getParameter("exp");
		String salary = request.getParameter("sal");
		String location = request.getParameter("loc");
		
		
		
		//request 1 and request 2 data which is alredy present inside the session 
		HttpSession session = request.getSession();
		String name = (String)session.getAttribute("namekey");
		String fname = (String)session.getAttribute("fnamekey");
		String phoneno = (String)session.getAttribute("phNokey");
		String email = (String)session.getAttribute("emailKey");
		String qualification = (String)session.getAttribute("qualKey");
		String year = (String)session.getAttribute("yearkey");
		String university = (String)session.getAttribute("universityKey");
		
		
		
		try {
			
			Connection connectionFromDB = ConnectionUtility.getConnectionFromDB();
			PreparedStatement pstmt = connectionFromDB.prepareStatement("insert into userreg_info values(user_reg_seq.nextval,?,?,?,?,?,?,?,?,?,?,?)");
			
			pstmt.setString(1, name);
			pstmt.setString(2, fname);
			pstmt.setString(3, phoneno);
			pstmt.setString(4, email);
			pstmt.setString(5, qualification);
			pstmt.setString(6, year);
			pstmt.setString(7, university);
			pstmt.setString(8, skill);
			pstmt.setString(9, exp);
			pstmt.setString(10, salary);
			pstmt.setString(11, location);
			
			int count  = pstmt.executeUpdate();
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("success.html");
			requestDispatcher.include(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
