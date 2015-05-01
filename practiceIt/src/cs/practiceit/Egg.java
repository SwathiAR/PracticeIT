/*
 Write a complete Java program in a class named Egg2 that generates the following output. Use static methods to show structure and eliminate redundancy in your solution.

  _______
 /       \
/         \
\         /
 \_______/
-"-'-"-'-"-
  _______
 /       \
/         \
\         /
 \_______/
-"-'-"-'-"-
\         /
 \_______/
  _______
 /       \
/         \
-"-'-"-'-"-
\         /
 \_______/
*/


package cs.practiceit;

public class Egg {
	
	public static void drawegg1(){
		System.out.println("  _______\n /       \\\n/         \\\n\\         /\n \\_______/\n-\"-\'-\"-\'-\"-");
		
	}
	
	public static void drawegg2(){
		System.out.println("\\         /\n \\_______/");
		
	}

	
	public static void drawegg3(){
		System.out.println("  _______\n /       \\\n/         \\\n-\"-\'-\"-\'-\"-\n\\         /\n \\_______/");
		
	}
	
	public static void main(String[] args) {
		Egg.drawegg1();
		//System.out.println("\n ");
		Egg.drawegg1();
		Egg.drawegg2();
		//System.out.println("\n ");
		Egg.drawegg3();
	}


	
	
}
