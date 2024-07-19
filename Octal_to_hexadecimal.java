package JAVA;

import java.util.Scanner;

public class Octal_to_hexadecimal {
	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a octal Value : ");
        String input1=sc.next();
        int octal = Integer.parseInt(input1, 8);
        String output = Integer.toHexString(octal);
        System.out.println("Hexadecimal value of "+input1+"(octal) is "+output);
    }
}
