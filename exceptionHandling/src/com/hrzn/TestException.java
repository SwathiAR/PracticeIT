package com.hrzn;



public class TestException {

	public static void main(String[] args) {
		
		String test = "yes";
		try{
			System.out.println("Starting try");
			TestException.doRisky(test);
			
		System.out.println("End try");
		}
		catch(SJException sj){
			System.out.println("Exception");
		}
		
		finally{
			System.out.println("finally");
		}
		
		
System.out.println("End main");
	}
	
	public static void doRisky(String tes) throws SJException
	{
		System.out.println("start the risky thing");
		if ("yes".equals(tes))
		{
			throw new SJException();
			
		}
	}

}


