package JAVA;
import java.util.*;

public class Peterson_Number
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :: ");
        int num = sc.nextInt();

        int temp = num,remainder, sum =0;
//      Loop to iterate through digits and add their factorials
        while(temp>0)
        {
            remainder = temp%10;
            sum+= factorialOf(remainder);
            temp = temp /10;
        }

        if(sum==num)
        {
            System.out.println(num+" is a Peterson number");
        }
        else
        {
            System.out.println(num+" is not a Peterson number");
        }
        sc.close();
    }

//  method that returns the factorial of the number
    static int factorialOf(int num)
    {
        int prod = 1;
        while(num>0)
        {
            prod = prod*num;
            num--;
        }
        return prod;
    }
}