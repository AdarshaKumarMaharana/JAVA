package JAVA;
import java.util.Scanner;

public class NeonNumber
{
    public static void main(String args[])
    {
//      Taking the number as input from the user using scanner class
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

//      sq holds the square of the number
        int sq = num*num , sum = 0, remainder;
        //Loop to iterate and add the digits of the square number
        while (sq > 0)
        {
            remainder = sq % 10;
            sum = sum + remainder;
            sq = sq / 10;
        }
        if (num == sum)
        {
            System.out.println(num+" is a Neon Number");
        }
        else
        {
            System.out.println(num+" is not a Neon Number");
        }
        sc.close();
    }
}