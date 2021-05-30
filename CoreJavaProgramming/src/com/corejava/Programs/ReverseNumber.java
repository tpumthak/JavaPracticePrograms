package com.corejava.Programs;

public class ReverseNumber {
	
	
	
	public static void main(String[] args) {
		
		reverseNumber(1986);
	}
	
	
	
	/**
	 * @author azhar
	 * Description: This Program is to reverse an integer number
	 * @param number
	 * @logic: 
	 */
	
	public static void reverseNumber(int number)
	{
		//initilaize reverse number as 0
		int reverseNumber=0;
		//run while loop and check given number is greater than 0,
		//if true, then it will execute while loop
		while(number>0)
		{  //get reminder of number
			int reminder=number%10;
			//here is the main logic,in first iteration reverse number is initialized as 0 , 
			//eg: given number is 321, in first iteration
			//reversenumber=0*10+reminder of 321
			//reversenumber=reversenumber*10+reminder of number(321%10=1)
			//reversenumber=0*10+1=1
			//reversenumber=1
			reverseNumber=reverseNumber*10+reminder;
			//divide number by 10 to get quotient
			number=number/10;
			//now number will become eg: 321/10=32 and 32>0, loop will continue
		}
		System.out.println(reverseNumber);
	}

}
