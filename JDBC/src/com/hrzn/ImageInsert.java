package com.hrzn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ImageInsert {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException, FileNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","newerpassw0rd");
	
		PreparedStatement pst = con.prepareStatement("insert into PICTURES values(?,?)");
		pst.setInt(1, 5000);
		
		File f = new File("c:/insert/download.gif");
		FileInputStream fis = new FileInputStream(f);
		
		int length  =(int)f.length();
		
		pst.setBinaryStream(2,fis,length);
		
		int k = pst.executeUpdate();
		System.out.println(k+" row inserted");
		
		pst.close();
		con.close();
		

	}

}

