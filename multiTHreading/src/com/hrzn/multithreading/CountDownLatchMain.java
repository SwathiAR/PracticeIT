package com.hrzn.multithreading;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchMain {

	public static void main(String[] args) {
	CountDownLatch latch = new CountDownLatch(5);
	
	ExecutorService executor = Executors.newFixedThreadPool(3);
		for(int i =0;i<5;i++){
executor.submit(new CountDownDemo(latch));

	}
try {
	latch.await();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
System.out.println("Completed");
}
}