package JAVA;

import java.util.Scanner;

public class Octal_to_binary {
	public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter a octal Value : ");
        String input1=sc.next();
        int octal = Integer.parseInt(input1, 8);
        String output = Integer.toBinaryString(octal);
        System.out.println("Binary value of "+input1+"(OCTAL) is "+output);
    }
}
