package com.paf.models;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {
	
	private static Connection conn; 

	public static Connection getDBConnection(){ 
		
		
		try{  
			String driver ="com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/paf"; 
			String username = "root"; 
			String password = "";
			  
			if(conn == null || conn.isClosed())
			{
				Class.forName(driver); 
				conn = DriverManager.getConnection(url,username,password); 
			}
			
		} catch(Exception e){
			System.out.println(e);
		}
		return conn;  
	}




}
