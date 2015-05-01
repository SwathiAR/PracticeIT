/*
 * 
Description:
In mathematics, the Fibonacci numbers or Fibonacci series or Fibonacci sequence are the numbers in the following integer

- See more at: http://www.java2novice.com/java-interview-programs/fibonacci-series/#sthash.qPImSBlG.dpuf
 * sequence: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... By definition, the first two numbers in the Fibonacci sequence are 0 and 1, and each subsequent number is the sum of the previous two. Below example shows how to create fibonacci series. - See more at: http://www.java2novice.com/java-interview-programs/fibonacci-series/#sthash.qPImSBlG.dpuf
 */


package cs.primitiveDataAndDefiniteLoop;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many fibonacci numbers you need");
		int fibNumber=sc.nextInt();
		int[] fibSeries = new int[fibNumber];
		fibSeries[0]=1;
		fibSeries[1]=1;
		
		for (int i=2;i<fibNumber;i++)
		{
			fibSeries[i]=fibSeries[i-1]+fibSeries[i-2];
			
		}
		
		//for (int i=0; i <fibNumber ; i++) {
			//System.out.print(fibSeries[i] + " ");
		//}
		
		for (int i : fibSeries) {
			System.out.print(i + " ");
		}
sc.close();
	}

}
