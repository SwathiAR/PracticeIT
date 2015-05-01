/*
 * 
 * Write nested for loops to produce the following output:

    1
   2
  3
 4
5
 */


package cs.primitiveDataAndDefiniteLoop;

public class SpacedNumbers {

	public static void main(String[] args) {
		
		for(int i=1; i<6 ;i++)
		{
			for(int j=5;j>i;j--){
				System.out.print(" ");
			}
			System.out.print(i);
			System.out.println("");
		}
		
	}

}
