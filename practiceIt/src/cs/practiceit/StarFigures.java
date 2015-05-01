/*
 Write a complete Java program in a class named StarFigures that generates the following output. Use static methods to show structure and eliminate redundancy in your solution.

*****
*****
 * *
  *
 * *


*****
*****
 * *
  *
 * *
*****
*****

  *
  *
  *
*****
*****
 * *
  *
 * *
 */


package cs.practiceit;

public class StarFigures {
	
	public static void pattern1(){
		System.out.println("*****\n*****\n * *\n  * \n * *");
	}
	public static void pattern2(){
		System.out.println("*****\n*****\n\n  *\n  *\n  *");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StarFigures.pattern1();
		System.out.println("");
		StarFigures.pattern1();
		StarFigures.pattern2();
		StarFigures.pattern1();

	}

}
