package JAVA;

import java.util.Scanner;
public class Disarium_Number{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :: ");
        int num = sc.nextInt();

        int temp=num,dig=0,remainder,sum=0;
//      Loop to count the number of dig
        while(temp>0)
        {
            dig++;
            temp=temp/10;
        }
//      Reassigning values to temp
        temp=num;
//      Adds up the digits with power
        while (temp > 0)
        {
            remainder = temp % 10;
            sum = sum + (int)Math.pow(remainder, dig);
            temp = temp / 10;
            dig--;
        }        

        if(sum==num)
        {
            System.out.println(num+" is a Disarium Number");
        }
        else
        {
            System.out.println(num+" is not a Disarium Number");
        }
        sc.close();
    }
}