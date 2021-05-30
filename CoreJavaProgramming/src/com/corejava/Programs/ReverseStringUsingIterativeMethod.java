package com.corejava.Programs;

public class ReverseStringUsingIterativeMethod {
	/***
	  @Author: Azharuddin Khan
	  @Description: This Program is to used to reverse a string using iterative approach.
	***/
	
	
	
	
	public void reverseStringWithIterativeApproach(String text)
	{
		if(text.length()==0||text.equals("")||text.equals(" "))
		{
			System.out.print("String length is 0 or null or space");
		}
		
		//Convert String into char array
		char[] charArray=text.toCharArray();
		//Iterate char array into reverse order to get reverse string of actual string
		//start from char array length to 0 and decrementing by 1
		for(int i=charArray.length-1;i>=0;i--)
		{
			System.out.print(charArray[i]);
			
		}
		
	}
	
	
	public static void main(String[] args) {
		ReverseStringUsingIterativeMethod obj=new ReverseStringUsingIterativeMethod();
		obj.reverseStringWithIterativeApproach("A");
		System.out.println();
		obj.reverseStringWithIterativeApproach("Azhar Khan");
		System.out.println();
		obj.reverseStringWithIterativeApproach("");
		System.out.println();
		obj.reverseStringWithIterativeApproach(" ");
		System.out.println();
	}

}
