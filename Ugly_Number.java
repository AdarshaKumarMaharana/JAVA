package JAVA;

import java.util.Scanner;
public class Ugly_Number
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :: ");
        int num = sc.nextInt();

        boolean flag = true;
        int temp = num;
//       Checks whether the number is divisible  by 2,3 or 5
//       If diviisible, it divides the number by it and iterates until number is one
        while(temp!=1)
        {
            if(temp%2==0)
                temp=temp/2;
            else if(temp%3==0)
                temp=temp/3;
            else if(temp%5==0)
                temp=temp/5;
            else{
                flag = false;
                break;
}
        }
        if(flag)
        {
            System.out.println(num+" is an Ugly Number");
        }
        else
        {
            System.out.println(num+" is Not an Ugly Number");
        }
        sc.close();
    }
}