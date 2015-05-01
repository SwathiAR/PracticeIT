
public class SmartPhone extends Phone {
	
	    public SmartPhone(String model, int storage, double frontCamera, double prize) {
	        super(model, storage, frontCamera, prize);
	    
	    }
	    

	
	void describeFeatures()
	{
		System.out.println("Some of the Features of the below  SmartPhone");
		System.out.println("Model = " + model);
		System.out.println("Storage in GB = " + storage);
		System.out.println("MegaPixels of Front Camera = " + frontCamera);
		System.out.println("Prize in Dollars = " + prize);
	}
}
