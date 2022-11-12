package com.crime.utlity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	public static Connection provideconnection() {
		
		Connection conn = null;
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			String url = "jdbc:mysql://localhost:3306/crimedata";
			
			 try {
				conn = DriverManager.getConnection(url,"root","Akash9525");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
		 return conn;
		
	}

}
