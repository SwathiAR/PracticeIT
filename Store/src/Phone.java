
public class Phone implements Item {
	

	String name;
	int prize;
	int quantity;
	
	public Phone (String name, int prize , int quantity )
	{
		this.name = name;
		this.prize = prize;
		this.quantity = quantity;
		
	}

	@Override
	public String obtainName() {
		return name;
	}

	@Override
	public int obtainPrice() {
		return prize;
	}

	@Override
	public int obtainQuantity() {
		return quantity;
	}
	
	@Override
	public void  displayItem(){
		System.out.println("" + obtainQuantity()+" "+obtainName()+ " Phones of "+obtainPrice()+" Dollors each");
		
		
	}
	
	
}

