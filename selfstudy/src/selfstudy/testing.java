package selfstudy;

public class testing {

	public static void main(String[] args) {
    
		for (String arg : args) {
			System.out.println(arg);
		}
		
		subClass s1 = new subClass();
		
		System.out.println("the sum is" + s1.getSum());

	}

}

