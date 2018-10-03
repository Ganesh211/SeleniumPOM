package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcPreparedStatement extends JdbcUtils{
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con=JdbcUtils.getMysqlConnection();
		String sql="Insert into city values(?,?)";
		PreparedStatement pstm=con.prepareStatement(sql);
		String[] citi={"Pune","Mumbai"};
		for (int i=0;i<citi.length;i++)
		{
			
		pstm.setLong(1, i+1);
		pstm.setString(2, citi[i]);
		int rowsUpdated=pstm.executeUpdate();
		System.out.println(rowsUpdated);
		}
		
	}

}