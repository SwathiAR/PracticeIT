package com.hrzn.abstractionBill;

public abstract class  AbstractBill implements Bill {
	
	protected double amt;
	
	public abstract double calculateBill (int unit);
		
    public void displayBill(){
    	System.out.println("The amount is "+ amt);
}
}
