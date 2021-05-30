package com.corejava.Programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author Azharuddin Khan
 * @description: This Program is to find Largest Number from Integer Array using Collections sort method .
 *
 */

public class FindLargestNumberFromIntegerArrayUsingCollections {
	
	
	
	public static void main(String[] args) {
		FindLargestNumberFromIntegerArrayUsingCollections obj=new FindLargestNumberFromIntegerArrayUsingCollections();
		Integer[] element={1,22,11,82,3,6,3};
		int largestNumber=obj.findLargestNumberFromIntgerArrayUsingCollectionsSort(element);
		System.out.println("Largest Number is "+largestNumber);
	}
	
	
	
	
	public int findLargestNumberFromIntgerArrayUsingCollectionsSort(Integer[] element)
	{
		List<Integer> list=Arrays.asList(element);
		Collections.sort(list);
		int number=list.get(element.length-1);
		
		return number;
	}
	
	
	
	
	

}
