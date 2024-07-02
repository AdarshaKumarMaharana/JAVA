package JAVA;

import java.util.Scanner;

public class SwapTwoNumbersWith3rdVariable {
	public static void main(String args[])
	   {
	    int a,b,temp;
	    // Asking user to give inputs
	    System.out.println("Enter any two numbers : ");
	    // create Scanner class objects to take the inputs
	    Scanner sc = new Scanner(System.in);
	      
	    a = sc.nextInt();
	    b = sc.nextInt();
	    // print the values before swapping 
	    System.out.println("--Before swapping--");
	    System.out.println("First number = " + a);
	    System.out.println("Second number = " + b);
	    // Assign value of a in temporary(third) variable
	    temp = a;
	    // Value of b will be stored in a 
	    a = b;
	    // Value of temp (temporary variable) initially contains a's value
	    // a's value assigned to b
	    b = temp;
	    
	    // print the values after swapping
	    System.out.println("--After swapping--");
	    System.out.println("First number = " + a);
	    System.out.println("Second number = " + b);
	   }
}
