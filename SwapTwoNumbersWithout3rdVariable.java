package JAVA;

import java.util.Scanner;

public class SwapTwoNumbersWithout3rdVariable 
{
	public static void main(String args[])
    {
		int a,b;
	    // Asking user to give inputs
	    System.out.println("Enter any two numbers : ");
	    // create Scanner class objects to take the inputs
	    Scanner sc = new Scanner(System.in);
	      
	    a = sc.nextInt();
	    b = sc.nextInt();
        //print the values of numbers before swapping
        System.out.println("--Before swapping--");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);
    
        // Addition of both the values are stored in a
        a= a + b;
        // b value is assigned with the difference between a and b
        // i.e. now b contains a
        b = a - b;
        // difference of a and b i.e. total value-a is stored in a 
        a = a - b;
        
        // print the values of number after swapping
        System.out.println("\n\n--After swapping--");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);
    }
}
