import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class hashMap {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=scn.nextLine();
        char[] charArray=str.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        for(Character ch:charArray)
        {
            if(map.containsKey(ch))
            {
                map.put(ch, map.get(ch)+1);
            }
            else
                map.put(ch,1);
        }
        Set<Character> set=map.keySet();
        for(Character ch:set)
        {
            if(map.get(ch)>1)
            {
                System.out.println(ch+"-----"+map.get(ch));
            }
        }
    }
}
