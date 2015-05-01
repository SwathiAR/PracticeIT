package selfstudy;

public class VarArgDemo {
	
	
	public static  void testVarArg(int a, String...names ){
		
		System.out.println("first element is " + a );
		
		for (String i : names) {
			
		
			
			System.out.println("followed by " + i);
		}
	}
	

	public static void main(String[] args) {
		
		VarArgDemo.testVarArg(6, "Swathi is Chethan's wife");
	}

}

