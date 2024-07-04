package JAVA;

import java.util.Scanner;

public class Multiplication_table 
{
	public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number::");
		int num = sc.nextInt();
        // This is the number of which we will get the multiplication table.
		System.out.println("Multiplication Table of "+num);
        for (int i = 1; i <= 10; i++) 
        {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
}
