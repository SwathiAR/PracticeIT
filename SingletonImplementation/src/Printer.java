
public class Printer {
	
private static final Printer uniqueInstance  = new Printer();
	
	private boolean inkEmpty ;
	
	
	private Printer()
	{
	
		inkEmpty = true;
checkBlackInk();
		
		};
	
	public static Printer getInstance()
	{
		
		return uniqueInstance ;
		
	}
	
	public void checkBlackInk() 
	{
	
	while(true)
	{
		if (inkEmpty)
			System.out.println("Alert : Fill the black cartilage");
		try{
        Thread.sleep(60000);}catch(InterruptedException e){}
        
	}
	}
	
public void fillCartridge(){
	System.out.println("Please confirm once filled");
}
	
	public void confirmFillCartridge()
	
	{
	
		inkEmpty = false;
	System.out.println("Printer is working!!!!");
		
	}
	
	
		
	
	

	
	
	
	
	
	
	
	}


