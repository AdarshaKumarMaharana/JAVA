package java_programming;

import java.util.Scanner;

public class Tech_Number
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :: ");
        int num = sc.nextInt();

        int digits = numberOfDig(num);

        if((digits%2==0) && (Math.pow((sumofHalves(num,digits)),2)==num))
        {
            System.out.println(num+" is a Tech Number");
        }
        else
        {
            System.out.println(num+" is Not a Tech Number");
        }
    }

    static int sumofHalves(int num,int digits)
    {
        int firstHalf = 0, secondHalf=0;
        firstHalf = num%(int)Math.pow(10,digits/2);
        secondHalf = num/(int)Math.pow(10,digits/2);
        return (firstHalf+secondHalf);
    }

    static int numberOfDig(int num)
    {
        int digits = 0;
        while (num > 0)
        {
            digits++;
            num = num / 10;
        }
        return digits;
    }

}
