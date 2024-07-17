package JAVA;

import java.util.Scanner;

public class Binary_to_Decimal_conversion 
{
	public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number :: ");
        String binarynum=sc.nextLine();
        int decimal=Integer.parseInt(binarynum,2);
        System.out.println("The Decimal value of " +binarynum+ " is "+decimal);
    }
}
