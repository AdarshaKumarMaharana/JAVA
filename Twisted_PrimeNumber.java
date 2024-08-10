package JAVA;

import java.util.Scanner;
public class Twisted_PrimeNumber{
    public static void main(String args[])
    {
        //Taking the number as input from the user using scanner class
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :: ");
        int num = sc.nextInt();

        if((isPrime(num)) && (isPrime(reverseNum(num))))
        {
            System.out.println(num+" is Twisted Prime Number");
        }
        else
        {
            System.out.println(num+" is not a Twisted Prime Number");
        }
        sc.close();
    }

//  method that returns reverse of a number
    static int reverseNum(int num)
    {
        int rev=0, remainder = 0;
        while (num != 0)
        {
            
            remainder = num % 10;
            rev = rev * 10 + remainder;
            num = num / 10;
        }
        
        return rev;
    }
//  method to check for prime number
    static boolean isPrime(int num)
    {
        int iter = 2;
        boolean flag = true;
        while (num > iter)
        {
            if (num % iter == 0)
            {
                flag = false;
                break;
            }
            iter++;
        }
        return flag;
    }
}