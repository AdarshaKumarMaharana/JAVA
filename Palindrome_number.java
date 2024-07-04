package JAVA;

import java.util.Scanner;

public class Palindrome_number 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number ::");
		int num = sc.nextInt();
	    int revnum = 0, rem;
	    
	    // store the number in orgnum
	    int orgnum = num;
	    
	    // get the reverse of no and store in revnum
	    while (num != 0) {
	      rem = num % 10;
	      revnum = revnum * 10 + rem;
	      num /= 10;
	    }
	    if (orgnum == revnum) {
	      System.out.println(orgnum + " is a Palindrome number.");
	    }
	    else {
	      System.out.println(orgnum + " is not a Palindrome number.");
	    }
	  }
}
