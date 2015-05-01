package com.hrzn.normalBill;

public class FinalBill {

	public static void main(String[] args) {
		ElectricityBill eb = new ElectricityBill();
		WaterBill wb = new WaterBill();
		
eb.calculateElectricityBill(20);
eb.electricityDisplayBill();

wb.calculateWaterBill(22);
wb.waterDisplayBill();
	}
	


}
