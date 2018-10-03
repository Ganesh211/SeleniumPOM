package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class JdbcInsert {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
	  System.out.println(1);
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println(2);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		Statement stm=con.createStatement();
		String sql="Insert into city values (3,'Mumbai')";
		stm.addBatch(sql);
		int[] rs=stm.executeBatch();
		for(int i=0;i<rs.length;i++){
			
			System.out.println(rs[i]);
		}
		
	}

}
