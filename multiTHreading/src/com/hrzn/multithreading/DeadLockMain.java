package com.hrzn.multithreading;

public class DeadLockMain {

	public static void main(String[] args) throws InterruptedException {
		DeadLockDemo dld = new DeadLockDemo();
		Thread t1 = new Thread(new Runnable(){

			@Override
			public void run() {
				try {
					dld.firThread();
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
					dld.secThread();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			
			
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		dld.finished();
		
	}

}
