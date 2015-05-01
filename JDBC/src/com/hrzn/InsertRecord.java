package com.hrzn;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecord {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","newerpassw0rd");
		
		Statement st = con.createStatement();
			
		st.execute("create table jdbc1 (id INT , name VARCHAR(256) , purpose VARCHAR(256))");
		st.execute("insert into jdbc1 values(400,'Swati','Training1')");	
		st.execute("insert into jdbc1 values(500,'Anu','Training2')");
		st.execute("insert into jdbc1 values(600,'Sudhir','Tutor')");
		st.execute("insert into jdbc1 values(700,'Artham','Training3')");	
		System.out.println("record inserted");		
		
		st.close();
		con.close();
		

	}

}

