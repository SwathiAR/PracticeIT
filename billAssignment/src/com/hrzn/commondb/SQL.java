package com.hrzn.commondb;

public class SQL implements CommonDB {

	
	public void connect()
	{
		System.out.println("Connection to SQL  is established");
	}
	
	public void disconnect()
	{
		System.out.println("Disconnected the connection to SQL ");
	}
	
}
