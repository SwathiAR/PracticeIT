package com.hrzn.multithreading;

public class DeadLockRunner {

	private int balance = 1000;
	
	public void deposit(int amount){
		balance += amount;
	}
	
	public void withdraw(int amount){
		balance -= amount;
	}
	
	public int getBal(){
	return balance;	
	}
	
	public static void transfer(DeadLockRunner account1 , DeadLockRunner account2 , int amount){
		
		account1.withdraw(amount);
		account2.deposit(amount);
		
	}
}
