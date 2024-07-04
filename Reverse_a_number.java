package JAVA;

import java.util.Scanner;

public class Reverse_a_number 
{
	public static void main(String args[])
    {
        System.out.print("Enter a number");
        //Taking input from user
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt(), rev=0, digit;
        //While loop that runs unitl our number gets reduced to 0
        while(num>0)
        {
            
            digit = num%10;
            rev = rev *10+ digit;
            num/=10;
        }
        System.out.println("The reverse is "+rev);
    }
}
