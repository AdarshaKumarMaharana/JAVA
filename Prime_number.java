package JAVA;

import java.util.Scanner;

public class Prime_number 
{
	public static void main(String[] args) 
    {
        int i=2;
        Scanner sc = new Scanner(System.in);
//      ask user to enter a number
        System.out.print("Please enter a number: ");
        int no = sc.nextInt();
//      set temp to false
        boolean temp = false;
//      iterate from 2 to number/2
        while (i<= no / 2) 
        {
//          check if a number is divisible by 2 to number/2
            if (no % i == 0) 
            {
//              if any number divisible by i, set temp to true 
                temp = true;
//              come out of the loop
                break;
            }
//          increment i value
            ++i;
        }
//      if number not divisible by any value of i, then flag is false
//      if !false i.e. true , then number is a prime number
        if (!temp)
            System.out.println(no + " is a prime number.");
        else
            System.out.println(no + " is not a prime number.");
    }
}
