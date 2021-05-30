import java.util.HashSet;
import java.util.Scanner;

public class hashSet {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string");
        String str=scn.nextLine();
        char [] ch=str.toCharArray();
        System.out.println(ch);
        HashSet<Character> set=new HashSet<>();
        for(Character c:ch)
        {
            if(!set.add(c))
            {
                System.out.println("This is the duplicate character "+c);
            }
        }
    }

}
