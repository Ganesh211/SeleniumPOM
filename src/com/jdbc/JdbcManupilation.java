package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class JdbcManupilation {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
	  System.out.println(1);
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println(2);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		Statement stm=con.createStatement();
		String sql="Select * from city";
		stm.executeQuery(sql);
		ResultSet rs=stm.executeQuery(sql);
		while(rs.next()){
			String r1=rs.getString("Cityname");
			System.out.println(r1);
		}
		
	}

}
