package com.hrzn.jndi;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;






public class RetrieveRecordsFromDB{
public static void main(String[] args) throws SQLException , NamingException{

Hashtable h = new Hashtable();
h.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
h.put(Context.PROVIDER_URL, "t3://localhost:7001");
h.put(Context.SECURITY_PRINCIPAL, "weblogic");
h.put(Context.SECURITY_CREDENTIALS, "Apr@2014");

Context c = new InitialContext(h);

String s = "JNDI Training";
c.bind("s", s);

Object o = c.lookup("Training");
System.out.println("------");
DataSource ds = (DataSource)o;
Connection con =ds.getConnection();
Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery("Select * from JDBC1");
while(rs.next()){
System.out.println(rs.getString(1));
System.out.println(rs.getString(2));
System.out.println(rs.getString(3));
}

}

}





