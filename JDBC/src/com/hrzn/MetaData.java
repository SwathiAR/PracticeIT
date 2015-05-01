package com.hrzn;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MetaData {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","newerpassw0rd");
		
		DatabaseMetaData dbm = con.getMetaData();
		
		System.out.println("DB Name "+dbm.getDatabaseProductName());
		System.out.println("DB Version "+dbm.getDatabaseProductVersion());
		
		con.close();
		
		
		
		

	}

}
