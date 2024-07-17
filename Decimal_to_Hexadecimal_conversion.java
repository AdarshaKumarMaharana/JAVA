package JAVA;

import java.util.Scanner;

public class Decimal_to_Hexadecimal_conversion 
{
	public static void main(String args[])
    {
		System.out.println("Enter a decimal number :: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
        System.out.println("The Hexadecimal value of "+num +" is "+Integer.toHexString(num));
    }
}
