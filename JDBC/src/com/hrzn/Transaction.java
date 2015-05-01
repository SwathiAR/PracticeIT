package com.hrzn;

import java.sql.Connection;
//import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Transaction {

	/**
	 * @param args
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","newerpassw0rd");
		
		con.setAutoCommit(false);
		
		Statement st = con.createStatement();
		
		try{
		
		st.executeUpdate("insert into student values(30000,'training123','training')");		
		st.executeUpdate("update student set name='updatedName123' where snumber =30000");		
		st.executeUpdate("insert into xyz values('training','IT','INDIA')");
		
		
		System.out.println("Ok all are done");
		con.commit();
		
		}catch(Exception e){
			System.out.println("Sorry Transaction dropped");
			con.rollback();
		}
		
		st.close();
		con.close();
		
		

	}

}
