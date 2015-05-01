package com.hrzn.normalBill;

public class WaterBill {

	private double waterAmount;
	
	
	public double calculateWaterBill(int unit)
	{
		waterAmount=4*unit;
		return waterAmount;
	}
	
	
	public void waterDisplayBill()
	{
		System.out.println("WaterBill is " + waterAmount);
	}
	
}
