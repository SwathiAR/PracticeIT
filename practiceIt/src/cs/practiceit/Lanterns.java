/*
 * 
 * Ask about the colours
 
 Write a complete Java program in a class named Lanterns that generates the following three figures of output. Use static methods to show structure and eliminate redundancy in your solution.

In particular, make sure that main contains no System.out.println statements, that any System.out.println statement(s) repeated are captured in a method that is called just once, and that the same System.out.println statement never appears in two places in the code.

    *****
  *********
*************

    *****
  *********
*************
* | | | | | *
*************
    *****
  *********
*************

    *****
  *********
*************
    *****
* | | | | | *
* | | | | | *
    *****
    *****
 */


package cs.practiceit;

public class Lanterns {
	
	public static void pattern1(){
		System.out.println("    *****");
	}
	public static void pattern2(){
		System.out.println("  *********");
	}
    public static void pattern3(){
		System.out.println("*************");
	}
    public static void pattern4(){
		System.out.println("* | | | | | *");
	}
    public static void emptyLine()
    {
    	System.out.println("");
    }
    public static void main(String[] args) {
		
          Lanterns.pattern1();
          Lanterns.pattern2();
          Lanterns.pattern3();
          Lanterns.emptyLine();
          Lanterns.pattern1();
          Lanterns.pattern2();
          Lanterns.pattern3();
          Lanterns.pattern4();
          Lanterns.pattern3();
          Lanterns.pattern1();
          Lanterns.pattern2();
          Lanterns.pattern3();
          Lanterns.emptyLine();
          Lanterns.pattern1();
          Lanterns.pattern2();
          Lanterns.pattern3();
          Lanterns.pattern1();
          Lanterns.pattern4();
          Lanterns.pattern4();
          Lanterns.pattern1();
          Lanterns.pattern1();
          
	}

}
