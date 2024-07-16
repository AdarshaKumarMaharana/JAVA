package JAVA;

import java.util.Scanner;

public class Decimal_to_binary_using_toBinaryString
{
	public static void main(String args[])
    {
		System.out.println("Enter a decimal number::");
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        System.out.println("The binary value of "+n1+" is "+Integer.toBinaryString(n1));
    }
}
