package JAVA;

import java.util.Scanner;

public class Check_Alphabet {
	public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a character");
//      Taking the character as input from the user
        char ch = scan.next().charAt(0);
//      CHecking wheteher the character entered an alphabet or not
        if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
        {
            System.out.print(ch+" is an alphabet ");
        }
        else
        {
            System.out.print(ch+" is not an Alphabet ");
        }
    }
}
