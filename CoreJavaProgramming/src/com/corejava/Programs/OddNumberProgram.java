package com.corejava.Programs;

public class OddNumberProgram {
	
	
	public static void main(String[] args) {
		
		//print odd numbers from 1 to 100
		for(int i=1;i<=100;i++)
		{
			if(i%2 !=0)
			{
				System.out.println(i);
			}
		}
		
		boolean result = OddNumberProgram.isNumberOdd(16);
		System.out.println(result);
	}
	
	
	public static boolean isNumberOdd(int number)
	{
		try{
			
			if(number==0)
			{
				System.out.println("0 is not an odd number.");
				return false;
			}
			else if(number%2 !=0)
			{
				System.out.println(number+" is an odd number");
			}
			else
			{
				System.out.println(number+" is not an add number..");
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
