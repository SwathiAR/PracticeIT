package com.hrzn.abstractionBill;

public class BillFinal {
	public static void main(String[] args)
	{
		BillElectricity be = new BillElectricity();
		BillWater bw = new BillWater();
		
		be.calculateBill(20);
		be.displayBill();
		
		
		bw.calculateBill(22);
		bw.displayBill();
	}

}
