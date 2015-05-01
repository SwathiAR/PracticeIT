
public class Description {

	public static void main(String[] args) {
		
		Phone phone1 = new SmartPhone("OnePlusOne" ,  64,  5,  349);
		phone1.describeFeatures();
		
		
		Phone phone2 = new SmartPhone("LG G3" ,  32,  2.1,  599);
		phone2.describeFeatures();
		
		System.out.println(phone2.betterPhone(phone1));
	
	    }
	}


