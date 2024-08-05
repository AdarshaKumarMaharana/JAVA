package JAVA;

import java.util.Scanner;
public class HarshadNumber
{
    public static void main(String args[])
    {
//      Taking the number as input from the user using scanner class
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :: ");
        int num = sc.nextInt();

//      Temp is used to preserve orignal variable
        int temp = num, remainder, sum = 0;
//      Loop that iterates all digits and adds them
        while (temp > 0)
        {
            remainder = temp % 10;
            sum = sum + remainder;
            temp = temp / 10;
        }
        if (num % sum == 0)
        {
            System.out.println(num+" is a Harshad Number");
        }
        else
        {
            System.out.println(num+" is Not a Harshad Number");
        }
        sc.close();
    }
}