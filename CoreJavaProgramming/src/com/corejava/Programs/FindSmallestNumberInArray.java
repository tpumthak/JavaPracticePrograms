package com.corejava.Programs;

public class FindSmallestNumberInArray {
	
	public static void main(String[] args) {
		
		int[] inputArray={10,1,5,3,-1,2};
		int minNumber=getMinimumNumberFromAnIntegerArray(inputArray);
		System.out.println("Minimum number is "+minNumber);
		
		
		
	}
	
	static int getMinimumNumberFromAnIntegerArray(int[] inputArray)
	{
		int minNumber=inputArray[0];
		for(int i=0;i<=inputArray.length-1;i++)
		{
			if(inputArray[i]<minNumber)
			{
				minNumber=inputArray[i];
			}
			
			
		}
		return minNumber;
	}
	
	

}
