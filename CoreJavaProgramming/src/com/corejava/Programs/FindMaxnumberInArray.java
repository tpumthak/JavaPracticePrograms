package com.corejava.Programs;

public class FindMaxnumberInArray {
	
	
	public static void main(String[] args) {
		
		int[] inputArray={1,2,3,33,44,7};
		int maxNumber=getMinimumNumberFromAnIntegerArray(inputArray);
		System.out.println("max Number in array is "+maxNumber);
	}
 static int getMinimumNumberFromAnIntegerArray(int[] inputArray) {
		// TODO Auto-generated method stub
		int maxNumber=inputArray[0];
		for(int i=0;i<=inputArray.length-1;i++)
		{
			if(inputArray[i]>maxNumber)
			{
				maxNumber=inputArray[i];
			}
		}
		return maxNumber;
	}

}
