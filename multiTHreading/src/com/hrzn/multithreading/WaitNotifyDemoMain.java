package com.hrzn.multithreading;

public class WaitNotifyDemoMain {

	public static void main(String[] args) throws InterruptedException {
WaitNotifyDemo wn = new WaitNotifyDemo();

Thread t1 = new Thread(new Runnable(){

	@Override
	public void run() {
		try {
			wn.produce();
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
			wn.consume();
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
