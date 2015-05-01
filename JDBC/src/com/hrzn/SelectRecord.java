package com.hrzn;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectRecord {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","newerpassw0rd");
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from jdbc1");
		while(rs.next()){
			System.out.println(rs.getInt(1)+"--"+rs.getString(2)+"--"+rs.getString(3));
		}
		
		
		/*ResultSetMetaData rsmd = rs.getMetaData();
		System.out.println("nno of columns "+rsmd.getColumnCount() );
		System.out.println("1st column name "+rsmd.getColumnName(1));
		System.out.println("2st column name "+rsmd.getColumnName(2));
		System.out.println("3rd column name "+rsmd.getColumnName(3));
		
		System.out.println("column data type name is --"+rsmd.getColumnTypeName(2));
		*/
		
		
		
		rs.close();
		st.close();
		con.close();

	}

}

