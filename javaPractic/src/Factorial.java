import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter the range: ");
        int number = scn.nextInt();
        System.out.println(factorial(number));

    }

    public static int factorial(int number) {
        int fact = 0;
        if (number == 0)
            fact = 0;
        else if (number == 1)
            fact = 1;
        else {
            int n = 1;
            while (number > 1) {
                n = n * number;
                number = number - 1;

            }
            fact = n;
        }
        return fact;
    }
}
