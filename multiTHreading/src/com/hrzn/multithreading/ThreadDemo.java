package com.hrzn.multithreading;

public class ThreadDemo extends Thread {
	
	public void run(){
		
		for(int i = 0; i<10 ; i ++){
			System.out.println("Count is : " + i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		}
	}

}
