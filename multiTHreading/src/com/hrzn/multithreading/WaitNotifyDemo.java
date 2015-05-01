package com.hrzn.multithreading;

import java.util.Scanner;

public class WaitNotifyDemo {
	
	public void produce() throws InterruptedException{
		
		synchronized (this) {
			
		
		System.out.println("Running produe thread");
		wait();
		System.out.println("Resumed");
		}
	}


public void consume() throws InterruptedException{
	synchronized (this){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Running consume thread");
		System.out.println("Press return to stop");
		scanner.nextLine();
		notify();
		Thread.sleep(5000);
		
	}
	
}
}