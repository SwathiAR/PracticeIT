package com.hrzn.abstractionBill;

public class BillElectricity extends AbstractBill {
	
	
	public  double calculateBill (int unit)
	{
		amt=5*unit;
		return amt;
	}
	
  
}
