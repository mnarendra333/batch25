
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		try {
			
			//step-1 => load the driver - type4 - thin driver
			Class.forName("oracle.jdbc.OracleDriver");
			
			//step-2 => create the connection object by making use of url(ipaddress, port,schema), username, password
			
			Connection  con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			//step-3 => create stmt object to carry sql query to the database
			
			Statement stmt = con.createStatement();
			int res = stmt.executeUpdate("insert into student values(102,'ravi')");
			System.out.println(res+"record's inserted");
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		

	}

}
