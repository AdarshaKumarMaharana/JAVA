package JAVA;

import java.util.Scanner;

public class EnenAndOddNumberChecking 
{
	public static void main(String args[])
    {
        // Scanner class object created for input
        Scanner sc=new Scanner(System.in); 
        
        System.out.print("Enter a number: ");
        //Take a number input from user
        int num=sc.nextInt();
        
        // using ternary operator
        String res=(num%2==0) ? "Even number":"Odd number";
        System.out.println(res);
    }
}
