package com.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;

import java.sql.SQLException;
import java.sql.Types;

public class JdbcCallableStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con=JdbcUtils.getMysqlConnection();
		CallableStatement cstm=con.prepareCall("{call addition(?,?,?)}");
		cstm.setInt(1, 80);
		cstm.setInt(2,90);
		System.out.println(22);
		cstm.registerOutParameter(3,Types.INTEGER);
		cstm.executeUpdate();
		System.out.println(cstm.getInt(3));
		
	}
}
