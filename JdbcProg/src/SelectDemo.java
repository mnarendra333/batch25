import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectDemo {

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
			
			ResultSet rs  = stmt.executeQuery("select * from student");
			
			while (rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
