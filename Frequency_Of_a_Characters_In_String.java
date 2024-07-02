package JAVA;

import java.util.Scanner;

public class Frequency_Of_a_Characters_In_String 
{
	public static void main(String[] args)
	{
		String s;
		char c;
		// Scanner class object created for input
        Scanner sc=new Scanner(System.in); 
        
        System.out.print("Enter a String::");
        s=sc.nextLine();
		System.out.print("Enter the Character to find the frequency::");
		c=sc.next().charAt(0);
		
		int count = 0;
		for(int i = 0; i < s.length(); i++) 
		{
			if(c == s.charAt(i)) 
			{
				count++;
			}
		}
		System.out.println("Frequency of " + c + " = " + count);
	}
}
