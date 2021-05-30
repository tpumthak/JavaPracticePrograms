package com.corejava.Programs;

/*
      * * * *
      * * * *
      * * * *
      * * * *
      here this is square pattern, 4x4  4 Rows and each row has 4 columns
      
      The logic is , outer loop will execute 4 times since there are 4 rows and nested loop will execute 4 times for each row

 */

public class PatternProgram1 {
	
	
	public static void main(String[] args) {
		
		
		for(int i=1;i<=4;i++)
		{
			
			for(int j=1;j<=4;j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
	
	

}
