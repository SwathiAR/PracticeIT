
public class CoffeeMachine {
	
	private static final CoffeeMachine uniqueInstance  = new CoffeeMachine();
	
	private boolean empty;
	private boolean boil;
	
	
	
	private CoffeeMachine()
	{
		empty = true;
		boil = false;
		
	
	};
	
	public static CoffeeMachine getInstance()
	{
		
		return uniqueInstance ;
		
	}
	
	public void fill()
	{
		if(empty){
			System.out.println("Fill the cup with ");
			empty = false;
			boil = false;
		}
	}
	
	
	
	public void mixDecoction()
	{
		if((!empty) && (!boil)){
			System.out.println("Add decoction");
		}
	}
	
	public void startboil()
	{
	
	}
	
	
	
	

}
