package com.corejava.Programs;
import java.util.HashSet;
public class FindDuplicateElementInCharArray {
	
	
	public void findDuplicateElementInCharArray(char[] chars)
	{
		HashSet<Character> set=new HashSet<Character>();
		if(chars==null)
		{
			System.out.println("Null Character Array");
		}
		for(Character ch:chars)
		{
			if(!set.add(ch))
			{
				System.out.println("Duplicate Element is "+ch);
			}
		}
	}
	
	public static void main(String[] args) {
		
		char[] chars={'a','a'};
		FindDuplicateElementInCharArray obj=new FindDuplicateElementInCharArray();
		obj.findDuplicateElementInCharArray(chars);
	}

}
