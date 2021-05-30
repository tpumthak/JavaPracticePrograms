package com.corejava.Programs;

public class PalindromeNumber {
	
	
	
	
	public static void main(String[] args) {
		isPalindromeNumber(345);
	}
	
	
	
	/**
	 * @author azhar
	 * Description:Get Palindrome Number of Given number 
	 * @param number
	 */
	public static void isPalindromeNumber(int number)
	{
		
		int temp=number;
		int reverseNumber=0;
		while(number>0)
		{
			int reminder=number%10;
			reverseNumber=reverseNumber*10+reminder;
			number=number/10;
		}
		if(reverseNumber==temp)
		{
			System.out.println(reverseNumber+" Number is Palindrome to "+temp);
		}
		else
		{
			System.out.println(reverseNumber+" Number is not palindrome to "+temp);
		}
	}
	
	

}
