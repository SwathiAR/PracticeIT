
public class Description {

	public static void main(String[] args) {
		
		Phone phone1 = new SmartPhone();
		Phone phone2 = new SmartPhone();

		phone1.model = "OnePlusOne";
		phone1.storage = 64;
		phone1.frontCamera = 5;
		phone1.prize = 349;
		
		phone1.describeFeatures();
		
		phone2.model = "LG G3";
		phone2.storage = 32;
		phone2.frontCamera = 2.1;
		phone2.prize = 599;

		
		phone2.describeFeatures();
		
		
		
		
		
		
		
	    }
	}


