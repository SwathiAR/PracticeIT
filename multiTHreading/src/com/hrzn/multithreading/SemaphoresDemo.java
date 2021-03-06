package com.hrzn.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class SemaphoresDemo {
	
	
	
	
	
	public static void main(String args[]) throws InterruptedException{
		ExecutorService executor = Executors.newCachedThreadPool();
		
		for(int i=0;i<10;i++){
		executor.submit(new Runnable(){

			@Override
			public void run() {
				 try {
					Connector.getInstance().connect();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		
		});
		}
		
		executor.shutdown();
		executor.awaitTermination(1, TimeUnit.DAYS);
		
		
	}

}
