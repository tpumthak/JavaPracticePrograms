package com.corejava.Programs;

public class OddNumberWithinRange {
	
	
	public static void main(String[] args) {
		System.out.println("odd Numbers are");
		printOddNumber(0, 10);
		
	}
	
	
	static void printOddNumber(int minRange,int maxRange)
	{
		
		for(int i=minRange;i<=maxRange;i++)
		{
			if(i==0)
			{
				System.out.println("0 is not an odd Number");
				i++;
			}
			if(i%2==1)
			{
				System.out.println(i);
			}
			
		}
		
		
		
	}
	
	
	
	

}
