package com.corejava.Programs;

public class ReverseStringUsingRecursiveApproach {
	
	
	/***
	@Author: Azharuddin Khan
	@Description:This Program is used to Reverse a string using recursive method.
	//calling method recursively till all string got reversed,
		//text.charAt(0) will take first character of string and it will add into end of string
		//again it will check for null or length and then , same logic will applied for remaining String
		//it will execute till string length became 1
	***/
	
	public String reverseStringRecursively(String text)
	{
		//here check string is null or length is less than or equal to 1, then return string
		if((null==text)||text.length()<=1)
		{   System.out.println("this block");
			return text;
		}
		
		//calling method recursively till all string got reversed,
		//text.charAt(0) will take first character of string and it will add into end of string
		//again it will check for null or length and then , same logic will applied for remaining String
		//it will execute till string length became 1
		return reverseStringRecursively(text.substring(1))+text.charAt(0);
	}
	
	public static void main(String[] args) {
		
		ReverseStringUsingRecursiveApproach obj=new ReverseStringUsingRecursiveApproach();
		String result=obj.reverseStringRecursively("Azhar");
		System.out.println(result);
	}
	

}
