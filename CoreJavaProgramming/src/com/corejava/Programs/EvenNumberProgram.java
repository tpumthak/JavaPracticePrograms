package com.corejava.Programs;


public class EvenNumberProgram {
	
	
	public static void main(String[] args) {
		
		boolean isNumberEven=EvenNumberProgram.isNumberEven(2);
		System.out.println(isNumberEven);
		
	}
	
	public static  boolean isNumberEven(int number)
	{
		try{
			if(number==0)
			{
				System.out.println("0 is not even number...");
				return false;
			}
		else if(number%2==0)
		{
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is not even");
			return false;
		}
		}
		catch(NumberFormatException ex)
		{
			System.out.println(ex.getMessage());
			return false;
		}
		
		return true;
	}
	

}
