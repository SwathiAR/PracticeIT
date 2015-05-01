package com.hrzn.multithreading;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockDemo {
	
	DeadLockRunner acc1 = new DeadLockRunner();
	DeadLockRunner acc2 = new DeadLockRunner();
	
	Lock lock1 = new ReentrantLock();
	Lock lock2 = new ReentrantLock();
	
	public void acquireLock(Lock firstLock, Lock secondLock){
		while(true){
			boolean gotLock1 = false;
			boolean gotLock2 = false;
			
			try{
				gotLock1 = firstLock.tryLock();
				gotLock2 = secondLock.tryLock();
			}
			finally{
				if(gotLock1 && gotLock2){
					return ;
					
				}
				
				if(gotLock1){
					firstLock.unlock();
				}
				
				if(gotLock2){
					secondLock.unlock();
				}
			}
			
			
			
		}
		
	}
	
	public void firThread() throws InterruptedException{
		Random random = new Random();
		
		acquireLock(lock1, lock2);
		try{
		DeadLockRunner.transfer(acc1 , acc2 , random.nextInt(100));}
		finally{
		lock1.unlock();
		lock2.unlock();}
	}

	public void secThread() throws InterruptedException{
		Random random = new Random();
		acquireLock(lock1,lock2);
try{
		DeadLockRunner.transfer(acc2, acc1, random.nextInt(100) );}
finally{
		lock1.unlock();
		lock2.unlock();
}
	}
	
	public void finished(){
		System.out.println("Account 1 balance " + acc1.getBal());
		System.out.println("Account 2 balance " + acc2.getBal());
		System.out.println("Total balance " + (acc1.getBal()+ acc2.getBal()));
		
	}
}
