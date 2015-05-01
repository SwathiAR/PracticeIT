package com.hrzn.multithreading;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerDemo   {

	
	
	static BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);
	
	public static void main(String args[]) throws InterruptedException{
		
		Thread t1 = new Thread(new Runnable(){

			@Override
			public void run() {
				try {
					producer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			
		});
		Thread t2 = new Thread(new Runnable(){

			@Override
			public void run() {
				try {
					consumer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		
		});
		t1.start();
		t1.join();
		t2.start();
		
		t2.join();
		
		
		
	}
	
	private static void producer() throws InterruptedException{
		//System.out.println("starting producer");
		Random random = new Random();
		while(true){
			//System.out.println("Starting Producer while");
			queue.put(random.nextInt(100));
			//System.out.println("Completed producer");
			
			//Object[] arr = queue.toArray();
			//System.out.println(arr);
			System.out.println("Completed");
		}
	}
	
/*private static  void consumer() throws InterruptedException{
	//System.out.println("Starting Consumer");
	Random random = new Random();
	
	while(true){
		//System.out.println("Starting Consumer while");
		Thread.sleep(100);
		
		if(random.nextInt(10) == 0){
			//System.out.println("Starting if Consumer");
			Integer value = queue.take();
		
			System.out.println("Taken value :" + value + "Size of the queue " + queue.size());
		}
		
}
}*/
	
	private static void consumer() throws InterruptedException{
		
	System.out.println("In consumer");
	}
}

