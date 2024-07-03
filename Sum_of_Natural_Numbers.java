package JAVA;

import java.util.Scanner;

public class Sum_of_Natural_Numbers 
{
	public static void main(String args[])
    {
        System.out.println("Enter the last element");
//      Taking input from user
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
//      Calculate the sum using the math formula
        int sum=num*(num+1)/2;
        System.out.println("The sum of natural numbers including "+num+" is "+sum);
    }
}
