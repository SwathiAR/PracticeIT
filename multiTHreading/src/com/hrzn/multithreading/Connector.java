package com.hrzn.multithreading;

import java.util.concurrent.Semaphore;

public class Connector {
	
	Semaphore sem = new Semaphore(4);
	private int connection = 0;
	
	
	private static Connector instance = new Connector();
	private Connector() {
	}
	
	public void connect() throws InterruptedException{
		try{
			sem.acquire();
		}catch (InterruptedException e1){
			e1.printStackTrace();
		}
		
		try{
			
			doConnect();
		}
		finally{
			sem.release();
		}
	}
	
	public void doConnect() throws InterruptedException{
		
		synchronized (this) {
			
		connection++;
		System.out.println("Number of connections " + connection);
		}
		
		
		synchronized (this) {
			connection--;
		}
		
	}
	
public static Connector getInstance(){
	
	return instance;
	
	
}
}
