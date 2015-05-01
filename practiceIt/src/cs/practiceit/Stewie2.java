/*
 Write a complete Java program in a class named Stewie2 that prints the following output. Use at least one static method besides main to remove redundancy.

//////////////////////
|| Victory is mine! ||
\\\\\\\\\\\\\\\\\\\\\\
|| Victory is mine! ||
\\\\\\\\\\\\\\\\\\\\\\
|| Victory is mine! ||
\\\\\\\\\\\\\\\\\\\\\\
|| Victory is mine! ||
\\\\\\\\\\\\\\\\\\\\\\
|| Victory is mine! ||
\\\\\\\\\\\\\\\\\\\\\\
 */

package cs.practiceit;

public class Stewie2 {
	
	public static void stewie2(){
	
		System.out.println("//////////////////////");
		for(int i=0;i<5;i++){
		System.out.println("|| Victory is mine! ||\n\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		}
	}


	public static void main(String[] args) {
		Stewie2.stewie2();
		
	}

}
