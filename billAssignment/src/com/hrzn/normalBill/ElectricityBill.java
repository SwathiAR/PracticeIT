package com.hrzn.normalBill;

public class ElectricityBill {



		private double electricityAmount;
		
		
		public double calculateElectricityBill(int unit)
		{
			electricityAmount=4*unit;
			return electricityAmount;
		}
		
		
		public void electricityDisplayBill()
		{
			System.out.println("ElectricityBill is " + electricityAmount);
		}
		
	}

