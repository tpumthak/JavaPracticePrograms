package com.corejava.Programs;

import java.util.HashSet;

public class FindDuplicateElementInIntegerArray {
	
	public void findDuplicateElementInIntegerArray(int[] elements)
	{
		
		//Use Hash Set store Elements uniquely,since Hash set does not allow duplicate elements
		HashSet<Integer> set=new HashSet<Integer>();
		for(Integer element:elements)
		{
			if(!set.add(element))
			{
				System.out.println("Duplicate Element in Integer Array is "+element);
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		
		FindDuplicateElementInIntegerArray obj=new FindDuplicateElementInIntegerArray();
		int[] elements={1,0,11,10,1,4,5,4};
		obj.findDuplicateElementInIntegerArray(elements);
		
	}
	

}
