package com.corejava.Programs;

import java.util.Arrays;


/**
 * 
 * 
 * @author Azharuddin Khan
 * @description: This program is to find largest number from integer using inbuilt sort method of Arrays class under java.util package
 *
 */

public class FindLargestNumerUsingArraysSortMethod {
	
	public static void main(String[] args) {
		
		FindLargestNumerUsingArraysSortMethod obj= new FindLargestNumerUsingArraysSortMethod();
		int [] element={10,12,22,3,33,2,88,8};
		int largestNumber=obj.findLargestNumberFromIntegerArrayUsingArraysSortMethod(element);
		System.out.println("largest Number is "+largestNumber);
	}
	
	
	
	
	public int findLargestNumberFromIntegerArrayUsingArraysSortMethod(int[] element)
	{   //declare integer variable to store largest number
		int largestNumber;
		//using inbuilt Sort method of Arrays class of Java.util package to sort an array using ascending order, 
		//so largest number will be the last element of an array
		Arrays.sort(element);
		//store largest number from sorted array as last element will be largest number, array indexing starts from 0 , 
		//element.length-1 will be last element of an array
		largestNumber=element[element.length-1];
		//return that element
		return largestNumber;
	}

}
