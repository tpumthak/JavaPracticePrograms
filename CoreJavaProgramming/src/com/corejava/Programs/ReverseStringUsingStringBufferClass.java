package com.corejava.Programs;

public class ReverseStringUsingStringBufferClass {
	
	/***
         @Author:Azharuddin Khan
         @Description: This program is used to Reverse a input string using stringbuffer class reverse Method.
         
         @return type is StringBuffer
        ***/
	public StringBuffer reverseStringUsingStringBuffer(String text)
	{
		//check for null
		if(text.equals("")||text.equals(null))
		{
			System.out.println("String is null");
			return null;
		}
		StringBuffer sbf=new StringBuffer(text);
		
		return sbf.reverse();
	}
	
	
	
	public static void main(String[] args) {
		
		ReverseStringUsingStringBufferClass obj=new ReverseStringUsingStringBufferClass();
		StringBuffer x=obj.reverseStringUsingStringBuffer("Azhar");
		System.out.println(x.toString());
		
	}

}
