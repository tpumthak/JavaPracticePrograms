package com.corejava.Programs;

import java.util.HashSet;

/***
  @author: Azharuddin Khan
  @Desscription: This progrm is used to find duplicate element in String array.
  
**/

public class FindDuplicateElementInStringArray {
	
	
	public void findDuplicateElementInStringArray(String [] elements)
	{
		//Create an Hash Set Object which take generic type as  
		HashSet<String> set= new HashSet<String>();
		//check all elements using for each loop
		for(String element:elements)
		{      //if element can't be add into hash set means , element is duplicate,if thats true
			if(!set.add(element))
			{
				//print duplicate Element
				System.out.println("Duplicate Element is "+element);
				
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		FindDuplicateElementInStringArray obj=new FindDuplicateElementInStringArray();
		String [] name={"Java","Python","Protractor","Java","C","C++","C++"};
		
		obj.findDuplicateElementInStringArray(name);
		
		
	}

}
