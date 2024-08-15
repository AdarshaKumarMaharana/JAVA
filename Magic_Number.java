package JAVA;

import java.util.Scanner;

public class Magic_Number
{
    public static void main(String[] args)
    {
        int n, r = 1, num, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :: ");
        n = sc.nextInt();
        num = n;
        //Loop that runs until there is one digit remaining
        while (num > 9)
        {
            // Loop to iterate and add the digits
            while (num > 0)
            {
                r = num % 10;
                sum = sum + r;
                num = num / 10;
            }
            num = sum;
            sum = 0;
        }
        if (num == 1)
        {
            System.out.println(n+" is a Magic Number");
        }
        else
        {
            System.out.println(n+" is not a Magic Number");
        }
        sc.close();
    }
}