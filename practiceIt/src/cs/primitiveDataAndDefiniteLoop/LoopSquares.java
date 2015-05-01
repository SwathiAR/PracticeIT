/*
 Write a for loop that produces the following output:

1 4 9 16 25 36 49 64 81 100 
For added challenge, try to modify your code so that it does not need to use the * multiplication operator. (It can be done! Hint: Look at the differences between adjacent numbers.)
 */


package cs.primitiveDataAndDefiniteLoop;

public class LoopSquares {

	public static void main(String[] args) {
		for(int i=1,j=3;j<23;j=j+2)
		{
			
			System.out.print(i +" ");
			i=i+j;
			
			
			
		}
		
		/*
		 
		for(int i=1;i<11; i++){
			
			System.out.print(i*i + " ");
        }
		 */

	}

}
