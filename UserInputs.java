package JAVA;

import java.util.Scanner;

public class UserInputs {
	public static void main(String[] args) {
		
		int i;
		float f;
		char c;
		String s;
		
//    Creating Scanner class object
    Scanner scanner = new Scanner(System.in);
    
//    Taking input from user
    System.out.print("Enter a String");
    s = scanner.nextLine();
    
    System.out.print("Enter an Integer Number::");
    i = scanner.nextInt();
    
    System.out.print("Enter a Decimal Number::");
    f = scanner.nextFloat();
    
    System.out.print("Enter a Character::");
    c = scanner.next().charAt(0);
    
//    Printing data entered by user
    System.out.println("You Entered The Followig Data::");
    System.out.println("String = "+s);
    System.out.println("Integer = "+i);
    System.out.println("Decimal = "+f);
    System.out.println("Character = "+c);
    
    
	}
}
