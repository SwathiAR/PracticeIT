package com.hrzn.multithreading;

public class ReentrantMain {

	public static void main(String[] args) throws InterruptedException {
		
		ReentrantLockDemo re = new ReentrantLockDemo();
		Thread t1 = new Thread(new Runnable(){

			@Override
			public void run() {
				try {
					re.firstThread();
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
					re.secondThread();
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
		
	}

}
