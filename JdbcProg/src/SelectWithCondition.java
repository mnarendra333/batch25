import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class SelectWithCondition {

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
			
			
			Scanner sc = new Scanner(System.in);
			System.out.println("enter student id");
			int sno = sc.nextInt();
			ResultSet rs  = stmt.executeQuery("select * from student where stu_id="+sno);
			
			while (rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
