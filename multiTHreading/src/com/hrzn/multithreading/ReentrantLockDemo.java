package com.hrzn.multithreading;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {
	
	Lock lock = new ReentrantLock();
	Condition con = lock.newCondition();
	
	private int count = 0;
	
	private void increment(){
		for(int i=0;i<1000;i++){
		count++;
		}
	}
	
	public void firstThread() throws InterruptedException{
		lock.lock();
		System.out.println("Waiting");
		con.await();
		
		System.out.println("Resumed");
		
		try{increment();}
		finally{
		lock.unlock();}
		
	}
	
public void secondThread() throws InterruptedException{
	
	Thread.sleep(1000);
	lock.lock();
	System.out.println("Press return key");
	new Scanner(System.in).nextLine();
	System.out.println("Return key is pressed");
	con.signal();
	try{
	increment();}
	finally{
	lock.unlock();}
	
}

public void finished(){
	
	System.out.println("The value of count is "+ count);
}
}
