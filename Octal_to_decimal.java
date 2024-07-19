package JAVA;

import java.util.Scanner;

public class Octal_to_decimal {
	public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter a octal Value : ");
        String input1=sc.next();
        int output =Integer.parseInt(input1, 8);
        System.out.println("Decimal value of "+input1 +"(octal) is "+output);
    }
}
