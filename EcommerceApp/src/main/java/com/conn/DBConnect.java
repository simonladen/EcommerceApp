package com.conn;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect 
{

	private static Connection conn = null;
	
	public static Connection getConn()
	{
		try {
			
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Class.forName("org.sqlite.JDBC");
		//	conn = DriverManager.getConnection("jdbc:sqlite:mydatabase.db");
			conn = DriverManager.getConnection("jdbc:sqlite:C:/Dev/test/EcommerceApp/EcommerceApp/mydatabase.db");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		return conn;
	}
	
}
