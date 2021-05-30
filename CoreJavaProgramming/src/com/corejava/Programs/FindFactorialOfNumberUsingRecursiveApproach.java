package com.corejava.Programs;

import java.util.Scanner;


/**
 * 
 * 
 * 
 * @author Azharuddin Khan
 * @Descroiption:This program is to find factorial of an integer number using recursive approach
 *
 */
public class FindFactorialOfNumberUsingRecursiveApproach {
	
	
	
	
	public static void main(String[] args) {
		FindFactorialOfNumberUsingRecursiveApproach obj=new FindFactorialOfNumberUsingRecursiveApproach();
		Scanner sc= new Scanner(System.in);
		System.out.println("Please Enter Number");
		int number=sc.nextInt();
		sc.close();
		//initialize fact =1 
		int factorial=1;
			
		factorial=obj.findFactorialOfNumberUsingRecursive(number);
		System.out.println("Factorial of "+number+ " is "+factorial);
	}
	
	
	
	
	
	public int findFactorialOfNumberUsingRecursive(int number)
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
		//return final value as factorial using recursive approach
		return (number*findFactorialOfNumberUsingRecursive(number-1));
	}
	
	
	

}
