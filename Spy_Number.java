package JAVA;

import java.util.Scanner;
public class Spy_Number
{
    public static void main(String args[])
    {
//      Taking the number as input from the user using scanner class
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int temp = num,prod = 1, sum =0, remainder;
//      Loop to iterate through the digits and calculate um and prod
        while(temp>0)
        {
            remainder = temp%10;
            sum += remainder;
            prod *= remainder;
            temp = temp /10;
        }

        if(sum==prod)
        {
            System.out.println(num+" is a spy number");
        }
        else
        {
            System.out.println(num+" is not a spy number");
        }
    }
}