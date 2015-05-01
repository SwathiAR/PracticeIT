package com.hrzn.multithreading;

public class VolatileEx extends Thread{
	
	private volatile boolean running = true;
	public void run(){
	
	
	while(running){
		System.out.println("starting volatileEx");
		System.out.println("Hello");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	}
	public  void shutdown()
	{
		 running= false;
	}
	
}
	
	
	
	
	
	

