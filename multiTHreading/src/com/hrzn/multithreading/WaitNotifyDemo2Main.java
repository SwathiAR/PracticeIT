package com.hrzn.multithreading;

public class WaitNotifyDemo2Main {

	public static void main(String[] args) throws InterruptedException {
		WaitNotifyDemo2 wnd2 = new WaitNotifyDemo2();
		
		Thread t1 = new Thread(new Runnable(){

			@Override
			public void run() {
				try {
					wnd2.produce();
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
			wnd2.consume();
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