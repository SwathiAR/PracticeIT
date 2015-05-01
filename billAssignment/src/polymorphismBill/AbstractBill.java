package polymorphismBill;

public abstract class AbstractBill {
	
protected double amt;
	
	public abstract double calculateBill (int unit);
		
    public void displayBill(){
    	System.out.println("The amount is "+ amt);

}
}
