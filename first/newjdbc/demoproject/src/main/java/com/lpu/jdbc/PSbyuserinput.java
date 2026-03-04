package com.lpu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PSbyuserinput {
	    private static String url = "jdbc:mysql://localhost:3306/lpu";
	    private static String user = "root";
	    private static String password = "NewPassword123";
	    private static Connection con;

	    // ONE-TIME driver load & connection
	    static {
	        try {
	        	Class.forName("com.mysql.cj.jdbc.Driver");
	            con = DriverManager.getConnection(url, user, password);
	            System.out.println("Database Connected");
	            
	        } catch (ClassNotFoundException | SQLException e) {
	            e.printStackTrace();
	        }
	    }
	
	
	public static void  insertStudent(Scanner sc) throws SQLException {
	
		
		PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?)");
		
		System.out.println("Enter Id: ");
		ps.setInt(1, sc.nextInt());
		
		System.out.println("Enter name: ");
		ps.setString(2, sc.next());
		
		System.out.println("Enter phno: ");
		ps.setLong(3, sc.nextLong());
		
		System.out.println("Enter marks: ");
		ps.setDouble(4, sc.nextDouble());
		
		ps.execute();
		System.out.println("Inserted");
		
	
	}
	public static void updateStudent(Scanner sc) throws SQLException {
		PreparedStatement ps = con.prepareStatement("update student set phno = ? where id = ?");
		System.out.println("Enter the new phno number: ");
		ps.setLong(1, sc.nextLong());
		
		System.out.println("Enter the id to update: ");
		ps.setInt(2, sc.nextInt());
		
		ps.execute();
		System.out.println("Updated");
		
		
	}
	public static void deleteStudent(Scanner sc) throws SQLException {
		PreparedStatement ps = con.prepareStatement("delete from student where id = ?");
		System.out.println("Enter the id to dlete: ");
		ps.setInt(1, sc.nextInt());
		
		ps.execute();
		System.out.println("Deleted recoed");
	}
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		PSbyuserinput psb = new PSbyuserinput();
//		psb.insertStudent(sc);
//		psb.updateStudent(sc);
		psb.deleteStudent(sc);
		
	}
	

}