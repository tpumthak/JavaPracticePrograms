package com.corejava.Programs;

import java.util.HashMap;
import java.util.Set;

public class FindDuplicateCharacterInString {
	
	public void findDuplicateCharacterInString(String str)
	{
	  //Convert this string to character Array
		char[] chars=str.toCharArray();
		
		//Store this character in Hashmap as key and value pair
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
		
		//All character stores in map as key and count as value
		
		//display only characters which count is greater than 1
		Set<Character> keys =charMap.keySet();//get all keys
		for(Character ch:keys)
		{
			if(charMap.get(ch)>1)
			{                      //get key---get key value
				System.out.println(ch+"----"+charMap.get(ch));
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		FindDuplicateCharacterInString obj=new FindDuplicateCharacterInString();
		obj.findDuplicateCharacterInString("azharuddinkhan");
	}
	
	
	
	
	
	

}
