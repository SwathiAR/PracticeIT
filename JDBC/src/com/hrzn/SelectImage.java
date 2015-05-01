package com.hrzn;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectImage {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException,FileNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","newerpassw0rd");
		
		PreparedStatement pst = con.prepareStatement("select empimage from pictures where empid =5000");
		ResultSet rs = pst.executeQuery();
		rs.next();
		InputStream is = rs.getBinaryStream(1);
		
		//FileOutputStream fos = new FileOutputStream("c:/select/training.gif");
		FileOutputStream fos = new FileOutputStream("c:/select/training");
		int k ;
		
 
		while((k= is.read()) != -1){
			fos.write(k);		
		}	
		
		System.out.println("Image Retrieved");
		fos.close();
		rs.close();
		pst.close();
		con.close();	
}
}



