package exam.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import com.mysql.cj.xdevapi.Statement;

public class jdbcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			// load driver
			//Class.forName("com.mysql.jdbc.Driver").newInstance();
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			// connecting
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=UTC","koscom","koscom");
			// create statement object
			stmt = conn.createStatement();
			// execute sql query
			rs = stmt.executeQuery("SELECT id, name, email FROM members");
			// display result
			if (rs.next()) {    // to prevent "before start of result set error"
				System.out.println(rs.getString(1)); 
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
			}

			System.out.println("success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("failed!!");
		} finally {
			try {
				if (rs != null) 
					rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			rs = null;
			try {
				if (stmt != null) {
					stmt.close();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			stmt = null;
		}
		
	}

}
