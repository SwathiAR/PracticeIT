package com.hrzn.abstractionBill;

public class BillWater extends AbstractBill {

	public  double calculateBill (int unit)
	{
		amt=4*unit;
		return amt;
	}
	
}
