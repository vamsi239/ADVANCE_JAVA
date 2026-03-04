package com.lpu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class student {
	
	public boolean insertstudent(){
		String url = "jdbc:mysql://localhost:3306/lpu";
		String user = "root";
		String password = "NewPassword123";
		
		try {
			
		//Class.forName("com.mysql.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, user, password);
		PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?)");
		
		ps.setInt(1,5);
		ps.setString(2, "deva");
        ps.setLong(3,26262);
        ps.setDouble(4, 92.0);
        
        ps.execute();
        int rows = ps.executeUpdate();

        con.close();
        return rows > 0; 
		}catch(Exception e) {
			  e.printStackTrace();
	            return false;
			
		}
		
	}
	public static void main(String[] args) {
		student op = new student();
        op.insertstudent();

	}
	
	
}
