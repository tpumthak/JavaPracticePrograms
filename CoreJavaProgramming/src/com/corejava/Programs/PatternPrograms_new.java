package com.corejava.Programs;

public class PatternPrograms_new {
	
	
	public static void main(String[] args) {
		
		/**
		 *         *******
		 *         *******
		 *         *******
		 *         *******
		 * 
		 *     
		 * 
		 */
		
		
		
		
		/*for(int i=0;i<5;i++){
		 
			for(int j=0;j<7;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		
		
		/**
		 *    *
		 *    * *
		 *    * * *
		 *    * * * *
		 *    * * * * *
		 *     
		 * 
		 * 
		 */
		
		/*
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}*/
		
		
		
		/**
		 *    * * * * *
		 *    * * * *
		 *    * * *
		 *    * *
		 *    *
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		/*for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();	
		}*/
		
		
		/**
		 *    * * * *
		 *    *     *
		 *    * * * *
		 *    *     *
		 * 
		 * 
		 */
		
	/*	for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{   if(i==1 || i==3){
				System.out.print("* ");
		     	}
			  if(i==2&&j==2 || i==2&&j==3||i==4&&j==2 || i==4&&j==3)
			  {
				  System.out.print("");
			  }
			  if(i==2&&j==1 || i==4&&j==1)
			  {
				  System.out.print("* ");
			  } 
			  
			  if(i==2&&j==3 || i==4&&j==3)
			  {
				  System.out.print("    *");
			  } 
			 
				
			}
			System.out.println("");
		}*/
		
		
		/**
		 * 
		 *    *     *
		 *    * * * *
		 *    * * * *
		 *    *     *
		 * 
		 */
		
		
	/*	
		for(int i=1;i<=4;i++)
		{ 
			for(int j=1;j<=4;j++)
			{
				if(i%2==0)
				System.out.print("* ");
				if(i%2==0&&j==1)
					System.out.print("* ");
				if(i%2==0&&j==4)
					System.out.print("    *");
				
			}
			System.out.println();
			
		}
		*/
		
		
		/**
		 *    * * * *
		 *    *     *
		 *    * * * *
		 *    *     *
		 * 
		 * 
		 */
		
		for(int i=1;i<=4;i++)
		{ 
			for(int j=1;j<=4;j++)
			{
				if(i%2==1)
				System.out.print("* ");
			   if(i%2==0&j==1)
				   System.out.print("* ");
			   if(i%2==0&j==4)
				   System.out.print("    *");
			}
			System.out.println();
			
		}
		
		
		/**
		 * 
		 *     1     1
		 *     2 2 2 2
		 *     2 2 2 2
		 *     1     1 
		 * 
		 */
		
		
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=4;j++)
		{
			if(i%2==0)
				System.out.print("2 ");
			if(i%2==1&&j==1)
				System.out.print("1     ");
			if(i%2==1&&j==2)
				System.out.print("1     ");
			
		}
		System.out.println();
	}
		
	
	
	/**
	 * 
	 *    1 1 1 1
	 *    2     2
	 *    1 1 1 1
	 *    2     2
	 * 
	 * 
	 * 
	 * 
	 */
	
	/*
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=4;j++)
		{
			if(i%2==1)
				System.out.print("1 ");
			if(i%2==0&&j==1)
				System.out.print("2 ");
			if(i%2==0&&j==4)
				System.out.print("    2");
		}
		
		System.out.println();
	}*/
}
}
