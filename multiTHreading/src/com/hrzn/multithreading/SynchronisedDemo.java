package com.hrzn.multithreading;

import java.util.Random;

public class SynchronisedDemo {
	
	  static int count;
	 
	 public static  void increment(){
		 
		 count++;
	 }
	
	public static void main(String args[]){
		
		Thread t1 = new Thread(new Runnable(){
			
			public void run(){
				for(int i =0; i <1000;i++){
					
					increment();
					
				}
				
				
			}
			
		
		});
		
		Thread t2 = new Thread(new Runnable(){
			public void run(){
				
				for(int i=0;i<1000;i++){
					increment();
				}
			}
		});
		t1.start();
			
		try {
			t1.join();
		
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		try {
			
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(count);
		
		
	}
	
	

}
