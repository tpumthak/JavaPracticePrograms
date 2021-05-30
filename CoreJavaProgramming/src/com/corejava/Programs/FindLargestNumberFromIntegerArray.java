package com.corejava.Programs;

public class FindLargestNumberFromIntegerArray {
	
	
	
	public static void main(String[] args) {
		
		int[] integerArray={40,12,13,15,191,10,29,23,10,38};
		FindLargestNumberFromIntegerArray obj= new FindLargestNumberFromIntegerArray();
		int largestNumber=obj.findLargestNumberFromIntegerArray(integerArray);
		System.out.println("Largest Number is "+largestNumber);
	}
	
	
	public int  findLargestNumberFromIntegerArray(int [] element)
	{
		//assume first element is largest number element
		int largestNumber=element[0];
		//iterate array to check all elements compare with largestNumber
		//if largestNumber is < less than the next number then assign that value to largestNumber 
		//and continue loop till the last element and keeps repeating the step and return that element
		for(int i=0;i<element.length;i++)
		{
			if(largestNumber<element[i])
			{
				largestNumber=element[i];	
			}
		}
		return largestNumber;
	}

}
