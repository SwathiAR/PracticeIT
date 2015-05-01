public class CopyOfCopyOfTrying {

	public int[] sum(final int[] number){
		
		//int[] temp={1,2,3};
		//number=temp;
		
		
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
		new CopyOfCopyOfTrying().sum(num);
	}
	

}
	