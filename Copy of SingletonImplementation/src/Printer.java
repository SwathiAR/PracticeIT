
public class Printer {
	
private static  Printer uniqueInstance  = null;
	
	private boolean inkEmpty ;
	
	
	private Printer()
	{
	
     inkEmpty = true;
     checkBlackInk();
		
		};
	
	public static Printer getInstance()
	{
		if (uniqueInstance == null);
		
		uniqueInstance = new Printer();
		return uniqueInstance ;
		
	}
	
	public void checkBlackInk() 
	{
	
		if (inkEmpty)
			System.out.println("Alert : Fill the black cartilage");
	
        
	
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


