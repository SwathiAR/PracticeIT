package polymorphismBill;

public class FinalBill {

	public static void main(String[] args) {
		
		AbstractBill e = new ElectricityBill();
		AbstractBill w = new WaterBill();
		
		displayBill(e,18);
		displayBill(w,19);
		
	
	}

	private static void displayBill(AbstractBill bill,int unit) {
		bill.calculateBill(unit);
		bill.displayBill();
		
		
	}

}
