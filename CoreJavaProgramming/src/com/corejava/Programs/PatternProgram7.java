package com.corejava.Programs;

public class PatternProgram7 {
	
	
	public static void main(String[] args) {
		
		int k=0;
		for(int i=1;i<=31;i=i+2)
		{   
			if(k<=3){
			System.out.print(i+" ");  // 1 3 5 7
			k++; 
			}
			else
			{
				System.out.println();
				System.out.print(i+" ");
				k=1;
			}
			
		}
		
		
	}

}
