package JAVA;

import java.util.Scanner;

public class Perfect_Number
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :: ");
        int num = sc.nextInt();

        int sum = 0, iter;
//      Loop to find all the divisors of the number and add them
        for(iter = 1; iter<num; iter++)
        {
            if(num%iter==0)
                sum+=iter;
        }
        if(sum==num)
        {
            System.out.println(num+" is a Perfect Number");
        }
        else
        {
            System.out.println(num+" is Not a Perfect Number");
        }
        sc.close();
    }
}