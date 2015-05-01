/*
 Write for loops to produce the following output, with each line 40 characters wide:

----------------------------------------
_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-
1122334455667788990011223344556677889900
----------------------------------------
 */


package cs.primitiveDataAndDefiniteLoop;

public class WaveNumbers {

	public static void main(String[] args) {
		

		for(int i=0;i<40;i++){
				System.out.print("-");
			}
			System.out.println("");
			
			for(int j=0;j<10;j++){
				System.out.print("_-^-");
			}

			System.out.println("");
			boolean firstTime =true;
			for(int s=0;s<2;s++){
				
			
			for(int l=0;l<10;l++){
				if(firstTime && l==0){
					firstTime=false;
					continue;
				}
				System.out.print(l);
				System.out.print(l);
			
			}
			}
			System.out.println("");
			for(int m=0;m<40;m++){
				System.out.print("-");
			}
		
		
		
	}

}
