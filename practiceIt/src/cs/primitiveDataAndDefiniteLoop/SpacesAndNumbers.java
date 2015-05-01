/*
  
    1
   22
  333
 4444
55555
 */

package cs.primitiveDataAndDefiniteLoop;

public class SpacesAndNumbers {

	public static void main(String[] args) {
		for(int i=1;i<6;i++)
		{
			for(int k=5;k>i;k--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i;j++){
				System.out.print(i);
			}
			System.out.println();
		}

	}
}


