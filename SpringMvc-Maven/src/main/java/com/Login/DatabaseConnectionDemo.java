package com.Login;

import java.sql.*;

public class DatabaseConnectionDemo {

	private static Connection con = null;
	
	private DatabaseConnectionDemo() {
		con = getConnection();
	}
	private static final DatabaseConnectionDemo INSTANCE = new DatabaseConnectionDemo();
	
	public static DatabaseConnectionDemo getInstance() {
		return INSTANCE;
	}

	public static Connection getConnection(){

		try {
			Class.forName("com.mysql.jdbc.Driver");
			if(con == null || con.isClosed()) {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining","gopichand","root");
			}

		}

		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		catch(SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public int select(String Uname, String Pass){
		try {	
		PreparedStatement ps = con.prepareStatement("select userId from login where Uname=? and Pass=?");
		ps.setString(1, Uname);
		ps.setString(2, Pass);
	    ResultSet rs = ps.executeQuery();
	    
	   // System.out.println("------------------------------------------");
	    while(rs.next()) {
	    	//System.out.println(rs.getInt(1));
	    	if(rs.getInt(1)>=1) {
	    		return rs.getInt(1);
	    	}
	    	else
	    		return 0;
	    }
		
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int insert(String Uname, String Pass) {
		try {
			
			PreparedStatement ps = con.prepareStatement("insert into login values(?,?,?)");
			ps.setInt(1, 0);
			ps.setString(2, Uname);
			ps.setString(3, Pass);
			return ps.executeUpdate();
		} 

		catch(SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	public int delete(String Uname) {
		try {
			PreparedStatement ps = con.prepareStatement("delete from login where Uname = ?");
			ps.setString(1, Uname);
			return ps.executeUpdate();
		} 
		catch(SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int update(String Uname, String Pass) {
		try {
			PreparedStatement ps = con.prepareStatement("update login set Pass = ? where Uname = ?");
			ps.setString(1, Pass);
			ps.setString(2, Uname);
			return ps.executeUpdate();
			
		} 

		catch(SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

}
