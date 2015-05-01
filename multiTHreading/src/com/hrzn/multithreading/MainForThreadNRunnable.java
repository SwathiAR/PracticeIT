package com.hrzn.multithreading;

import java.util.Scanner;

public class MainForThreadNRunnable {

	public static void main(String[] args) {
		
		/*ThreadDemo td = new ThreadDemo();
		td.start();
		
		new ThreadDemo().start();
		
		RunnableDemo rd = new RunnableDemo();
		Thread t = new Thread(rd);
		t.start();
		
		
		RunnableDemo  rd1 = new RunnableDemo();
		Thread t1 = new Thread(rd1);
		t1.start();
		System.out.println("Starting main");
		VolatileEx ve = new VolatileEx();
		ve.start();
		
		
		System.out.println("Press enter to stop");
		
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		ve.shutdown();
		System.out.println("stopped");*/
		
		SynchronizedBlockDemo sbb = new SynchronizedBlockDemo();
		sbb.main();
		
		
		
		
		
		

	}

}
