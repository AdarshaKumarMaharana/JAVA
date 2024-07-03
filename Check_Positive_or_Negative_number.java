package JAVA;

import java.util.Scanner;

public class Check_Positive_or_Negative_number 
{
	public static void main(String[] args) 
    {
//      Scanner class object created to take input
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number");
//      Taking input from user
        int num=sc.nextInt();
//      If the number is greater than 0 then it is positive
        if(num > 0)
        {
            System.out.println(num+" is a positive number");
        }
//      If the number is less than 0 then it is negative
        else if(num < 0)
        {
            System.out.println(num+" is a negative number");
        }
//      otherwise it is not positive or negative
        else
        {
            System.out.println(num+" is neither positive nor negative");
        }
    }
}
