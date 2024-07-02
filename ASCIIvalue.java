package JAVA;

import java.util.Scanner;

public class ASCIIvalue {
	public static void main(String[] args) {
		// Scanner class object created to take input.
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter a character: ");
        // Taking character input from user
        // And assigning it to character variable 'letter
        char letter = sc.next().charAt(0);
        // character variable type casted into int value
        int code = (int) letter;
        System.out.println("ASCII value of " + letter + " is: " + code);
	}
}
