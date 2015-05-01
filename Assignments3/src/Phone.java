
public  abstract class Phone {
	
	String model;
	int storage;
	double frontCamera;
	double prize;
	
public Phone(String model,int storage,double frontCamera,double prize)
{
	this.model = model;
    this.storage = storage;
    this.frontCamera = frontCamera;
    this.prize = prize;
}


public Phone betterPhone(Phone otherPhone){
	if(storage>otherPhone.storage) return this;
	return otherPhone;
}
	


abstract void describeFeatures();


}
