/*
 input 1 2 3 4 5 6 7
 value 1 1 2 3 5 8 13
 */
package com.hrzn.interviewQuestion;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("Please input the number");
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		System.out.println(Fibonacci.fibWithRecursion(input));
		sc.close();
		
	}
	
	public static int fib(int size)
	{
	if(size==1){
		return 1;
	}
	
	int[] a = new int[size];
	
	a[0] = 1;
	a[1]=1;
	for(int i=2; i<size;i++){
		
a[i]=a[i-1] + a[i-2];

	
	}
return a[size-1];

   }
	
	
	public static int fibWithoutArray(int size)
	{
		int fib1=1,fib2=1,number=0;
		if(size==1) return fib1;
		if(size==2) return fib2;
		for(int i=3;i<=size;i++){
			number=fib2+fib1;
			fib1=fib2;
			fib2=number;
		}
		return number;
   }
	
	
  public static int fibWithRecursion(int size){	
		return (size<=2)?1: fibWithRecursion(size-1)+fibWithRecursion(size-2); 

  }

	
}


