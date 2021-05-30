import java.util.Scanner;

public class evenNumber {
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Please enter the range: ");
        int number=scn.nextInt();
        evenNumber(number);

    }
    public static void evenNumber(int number)
    {
        for(int i=0;i<=number;i++)
        {
            if(i%2==0)
                System.out.println("The number "+i+" is an even number ");
        }
    }
}
