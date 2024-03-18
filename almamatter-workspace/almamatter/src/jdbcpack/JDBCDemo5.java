package jdbcpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Savepoint;
import java.sql.Statement;

public class JDBCDemo5 {
	public static void main(String[] args)throws Exception {
		//Step 1 - Load the Driver or register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
		//Step 2 - Establish a connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/alma","root","root");
			
			
			Statement stmt=con.createStatement();
			Savepoint sp=null;
			try {
			con.setAutoCommit(false);
			
			stmt.execute("update java_teacher set subject_taught=10 where tid=1");
			sp=con.setSavepoint();
			
			
			stmt.execute("update java_course set taught=10 where sid=1");
			
			stmt.execute("update java_course set learned=10 where siid=1");
			
			con.commit();
			
			}catch(Exception e) {
				e.printStackTrace();
				con.rollback(sp);
				con.commit();
			}
			
	}
}
