package com.hrzn.multithreading;

public class ThreadPoolDemo implements Runnable {

	private int id;
	
	ThreadPoolDemo(int id){
		this.id = id;
	}
	
	
	@Override
	public void run() {
		System.out.println("starting" + id);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("completed " + id);
		
	}
	
	

}
