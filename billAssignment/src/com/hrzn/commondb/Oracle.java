package com.hrzn.commondb;

public class Oracle implements CommonDB{
	
	public void connect()
	{
		System.out.println("Connection to Oracle database is established");
	}
	
	public void disconnect()
	{
		System.out.println("Disconnected the connection to oracle data base");
	}
	
	
	

}
