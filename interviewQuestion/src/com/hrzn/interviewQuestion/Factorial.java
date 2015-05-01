/*
 *Factorial
 *1=1
 *2! = 2*1
 *3!=3*2*1
 *4!=4*3*2*1
 */


package com.hrzn.interviewQuestion;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
         int number = sc.nextInt();
         
         System.out.println(Factorial.fact(number));
       sc.close();  
	}

	public static int  fact(int num){
		
		int fac=1;
		for(int i=1; i<=num;i++){
			fac=fac*i;
		}
		return fac;
	}
	
}
