import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.List;

public class UpdateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			//step1-load the driver
			Class.forName("oracle.jdbc.OracleDriver");
			//step2- create the connection 
			Connection con = 	DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
			System.out.println(con.getClass());
			//sql query to database
			Statement stmt  = con.createStatement();
			int count = stmt.executeUpdate("update student set stu_name='nikhil' where stu_id=102");
			System.out.println(count+" rows updated");
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
}
