package com.corejava.Programs;

import java.util.HashMap;
import java.util.Set;

public class FindOccuranceOfEachCharacter {
	
	
	public void findOccuranceOfEachCharacter(String str)
	{
		//convert string into character array
		char[] chars=str.toCharArray();
		//Store character array into hashmap as key and value pair, if character repeats than increase the count of character as value
		HashMap<Character, Integer> charMap=new HashMap<Character,Integer>();
		for(Character ch:chars)
		{
			if(charMap.containsKey(ch))
			{
				charMap.put(ch,charMap.get(ch)+1);
			}
			else
			{
				charMap.put(ch,1);
			}
		}
	
		Set<Character> keys = charMap.keySet();
		for(Character ch:keys)
		{
			if(charMap.get(ch)>1)
			{
				System.out.println(ch+"- count is "+charMap.get(ch));
			}
			else
			{
				System.out.println(ch+"- count is "+charMap.get(ch));
			}
			
		}
	
	}
	
	
	public static void main(String[] args) {
		FindOccuranceOfEachCharacter obj=new FindOccuranceOfEachCharacter();
		obj.findOccuranceOfEachCharacter("azharuddinkhan");
	}
	
	

}
