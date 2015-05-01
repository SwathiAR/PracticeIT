/*
 Write a complete Java program in a class named TwoRockets that generates the following output. Use static methods to show structure and eliminate redundancy in your solution.

Note that there are two rocket ships next to each other. What redundancy can you eliminate using static methods? What redundancy cannot be eliminated?

   /\       /\
  /  \     /  \
 /    \   /    \
+------+ +------+
|      | |      |
|      | |      |
+------+ +------+
|United| |United|
|States| |States|
+------+ +------+
|      | |      |
|      | |      |
+------+ +------+
   /\       /\
  /  \     /  \
 /    \   /    \

 */


package cs.practiceit;

public class TwoRockets {
	
	public static void drawTriangle()
	{
		System.out.println("   /\\       /\\\n  /  \\     /  \\\n /    \\   /    \\");
	}
	public static void drawSquare()
	{
		System.out.println("+------+ +------+\n|      | |      |\n|      | |      |\n+------+ +------+");
	}
	public static void drawUS()
	{
		System.out.println("|United| |United|\n|States| |States|");
	}
	
	
	public static void main(String[] args) {
		
TwoRockets.drawTriangle();
TwoRockets.drawSquare();
TwoRockets.drawUS();
TwoRockets.drawSquare();
TwoRockets.drawTriangle();

	}

}
