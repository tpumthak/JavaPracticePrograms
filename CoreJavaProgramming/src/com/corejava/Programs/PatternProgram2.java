package com.corejava.Programs;



/*
 
 *
 * * 
 * * * 
 * * * *
 * * * * *
 
 Here this is Triangle pattern, observe as rows and coulmn,  5 Rows and coulmn is increasing by 1

*/
public class PatternProgram2 {
	
	
	
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
		
			System.out.println();
		}
		
		
		
	}

}
