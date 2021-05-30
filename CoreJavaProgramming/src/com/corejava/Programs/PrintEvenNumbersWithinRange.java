package com.corejava.Programs;

public class PrintEvenNumbersWithinRange {
	
	
	public static void main(String[] args) {
	
		 System.out.println("Even Numebrs are : ");
		printEvenNumbers(0, 20);	
	}
	
	
	static void printEvenNumbers(int minRange,int maxRange)
	{
		for(int i=minRange;i<=maxRange;i++)
		{	 	
			if(i==0)
			{
				System.out.println("0 is not even number");
			 i++;
			}
			
		  if(i%2==0)
		  {
			  System.out.println(i);
		  }	
		}
	}
	

}
