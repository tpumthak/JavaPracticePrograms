package com.corejava.Programs;

import java.util.Scanner;


/**
 * 
 * 
 * 
 * @author Azharuddin Khan
 * @Descroiption:This program is to find factorial of an integer number using iterative approach
 *
 */
public class FindFactorialOfNumberUsingLoop {
	
	
	
	
	public static void main(String[] args) {
		FindFactorialOfNumberUsingLoop obj=new FindFactorialOfNumberUsingLoop();
		Scanner sc= new Scanner(System.in);
		System.out.println("Please Enter Number");
		int number=sc.nextInt();
		sc.close();
		int factorial=obj.findFactorialOfNumberUsingLoop(number);
		System.out.println("Factorial of "+number+ " is "+factorial);
	}
	
	
	
	
	
	public int findFactorialOfNumberUsingLoop(int number)
	{
		//check if number is 1 , return result as 1
		if(number==1)
		{
			return 1;
		}
		//check if number is 0, return result as 0
		if(number==0)
		{
			return 0;
		}
		//initialize fact =1 
		int fact=1;
		//iterate loop till the number provided as input
		for(int i=1;i<=number;i++)
		{ 
			//multiply fact with i and store into fact variable till loop ends
			fact=fact*i;
		}
		//return final value as factorial
		return fact;
	}
	
	
	

}
