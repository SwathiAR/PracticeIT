package com.hrzn.multithreading;

import java.util.LinkedList;
import java.util.Random;

public class WaitNotifyDemo2 {
	
	LinkedList<Integer> list = new LinkedList<Integer>();
	
	Object consumerLock =new Object();
	Object producerLock = new Object();
	Integer LIMIT = 10;
	
	public void produce() throws InterruptedException{
		while(true){
		Random random = new Random();
		
		synchronized (producerLock){
			while(list.size()==LIMIT){
				producerLock.wait();
			}
			
		list.add(random.nextInt(10));
		System.out.println("Size is " +list.size());
		
		consumerLock.notify();
		
		
			}
			
		}
		
	}
	
	public void consume() throws InterruptedException{
		while(true){
		
		synchronized (consumerLock) {
			while(list.size()== 0){
				consumerLock.wait();
			}
			Integer value = list.removeFirst();
			System.out.println("Value is :" + value + "Size of the list : " + list.size());
			producerLock.notify();
			}
			Thread.sleep(5000);
		
		}
	}
}

