import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=scn.nextLine();
        HashMap<Character,Integer> map=new HashMap<Character, Integer>();
        char [] c=str.toCharArray();
        for(char character:c)
        {
            if(map.containsKey(character))
            {
                map.put(character, map.get(character)+1);
            }
            else
                map.put(character ,1);

        }


Set<Character> set=map.keySet();
        for(Character ch:set)
        {
            if(map.get(ch)>1)
            System.out.println(ch+"-----"+map.get(ch));
        }
    }
}
