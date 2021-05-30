package com.corejava.Programs;

public class IsNumberOrNot {
	/***
	 * @author azhar
	 * Program: Check Input is Number or Not
	 *
	 * 
	 * 
	 */
	
	/**
	 * MethodName:isNumberOrNot  
	 * @param input is String type
	 * @return boolean
	 * Description: This method will take string as input and will check given String input is numeric or not , 
	 * if its numeric will return true else return false
	 * 
	 */
	public static boolean isNumberOrNot(String input)
	{
		try
		{
		  Long.parseLong(input);
			
		}catch(NumberFormatException ex)
		{
			System.out.println(ex.getMessage());
			return false;
			
		}
		return true;
		
	}
	
	
	public static void main(String[] args) {
		
		boolean result=IsNumberOrNot.isNumberOrNot("Azhar");
		System.out.println(result);
		result=IsNumberOrNot.isNumberOrNot("8197");
		System.out.println(result);
	}

}
