package com.hrzn.multithreading;

import java.util.concurrent.CountDownLatch;

public class CountDownDemo implements Runnable {

	CountDownLatch latch;
	
	public CountDownDemo(CountDownLatch latch)
	{
		this.latch = latch;
	}
	
	public void run(){
		System.out.println("starting");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		latch.countDown();
	}
	
}
