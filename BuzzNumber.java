package JAVA;
import java.util.Scanner;

public class BuzzNumber
{
    public static void main(String args[])
    {
//      Taking the number as input from the user using scanner class
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :: ");
        int num = sc.nextInt();

//      Checks whether the number is divisible by 7 or has 7 at its end
        if (num % 10 == 7 || num % 7 == 0)
        {
            System.out.println(num+" is a Buzz number");
        }
        else
        {
            System.out.println(num+" is not a Buzz number");
        }
        sc.close();
    }
}