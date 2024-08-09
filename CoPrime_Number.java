package JAVA;

import java.util.Scanner;
public class CoPrime_Number{
    public static void main(String args[])
    {
//      Taking the number as input from the user using scanner class
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number :: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number :: ");
        int num2 = sc.nextInt();

//      greates coomon divisor of both numbers should be 1 i.e gcd here
        int min , max, gcd = 1;

//      Assigning min and max values
        if(num1<num2)
        {
            min = num1;
            max = num2;
        }
        else
        {
            min = num2;
            max = num1;
        }

        while (max > min)
        {
            int remainder = max % min;
            if (remainder == 0)
            {
                gcd = min;
                break;
            }
            else
            {
                max = min;
                min = remainder;
            }
        }

        if (gcd == 1)
        {
            System.out.println(num1+" and "+num2+" are Co-Prime Numbers");
        }
        else
        {
            System.out.println(num1+" and "+num2+" are Not Co-Prime Numbers");
        }
        sc.close();
    }
}
