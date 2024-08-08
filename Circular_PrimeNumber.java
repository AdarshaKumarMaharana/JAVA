package JAVA;
import java.util.Scanner;

public class Circular_PrimeNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

//      Iter is the iterator which starts from 2 as 1 divided every number
        int iter = 0, temp = num, remainder;
//      Flag is used to record if the number is divisible after each iteration
        boolean flag = true;
        while (temp > 0)
        {
            remainder = temp % 10;
            iter++;
            temp = temp / 10;
        }
        temp = num;
        for (int i = 1; i <= iter; i++)
        {
            remainder = temp % 10;
            temp = temp / 10;
            temp = (remainder * (int) Math.pow(10, iter - 1)) + temp;
            if (!prime(temp))
            {
                flag = false;
                break;
            }
        }
        if (flag)
        {
            System.out.println(num+" is circular prime number.");
        }
        else
        {
            System.out.println(num+" is not circular prime number.");
        }
        sc.close();
    }

//  Function to check for prime number
    static boolean prime(int n)
    {
        int i = 2;
        boolean flag = true;
        while (n > i)
        {
            if (n % 2 == 0)
            {
                flag = false;
                break;
            }
            i++;
        }
        return flag;
    }
}