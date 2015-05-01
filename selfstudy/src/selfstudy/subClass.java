package selfstudy;

public class subClass extends superClass {
	
	int a=22;
	
	public  int getSum()
	{
	System.out.println("the value of this class field " + this.a);
	System.out.println("the value of super class field " + super.a);
	return  this.a + super.a;
	
	

}
}
