package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		Class.forName("org.mariadb.jdbc.Driver");		
		return DriverManager.getConnection("jdbc:mariadb://54.180.119.67:3306/post", "sample", "1234");
	}
	
	public static void main(String[] args) throws Exception {
		System.out.println(getConnection());
	}
}
