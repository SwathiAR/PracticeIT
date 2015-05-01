//http://stackoverflow.com/questions/2435163/why-can-final-object-be-modified

//'final' simply makes the object reference unchangeable. 
//The object it points to is not immutable by doing this. 
//It can never refer to another object, but the object it refers to may change state.

//[2,5,5]-------->[2,5,6]


public class CopyOfTrying {

	public int[] sum(final int[] number){
		
		
		
		++number[2];
		
		for(int i=0;i<number.length;i++)
		{
			
			System.out.print(number[i] + " ");
			
	
		}
		
		return number;

	}
	
	
	public static void main(String[] args)
	{
		final int[] num ={2,5,5};
		new CopyOfTrying().sum(num);
		
	}
	

}
	