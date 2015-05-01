package com.hrzn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class TryJDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "newerpassw0rd");
		Statement st = con.createStatement();
		st.execute("CREATE TABLE JEM (roll INT , student VARCHAR(255) , role VARCHAR(255))");
		st.execute("INSERT INTO JEM VALUES (10 , 'shru' , 'training')");
		ResultSet rs = st.executeQuery("SELECT * FROM JEM ");
		
			
		rs.next();
		System.out.println(rs.getInt(1));
		
	st.execute("drop table jem");
		con.close();
		st.close();
	}

}
