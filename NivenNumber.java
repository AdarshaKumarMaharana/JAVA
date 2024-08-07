package JAVA;
import java.util.Scanner;

public class NivenNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :: ");
        int num = sc.nextInt();

//      Temp is used to preserve orignal variable
        int temp = num, remainder, sum = 0;
//      Loop that iterates all digits and adds them
        while (temp > 0)
        {
            remainder = temp % 10;
            sum = sum + remainder;
            temp = temp / 10;
        }
        if (num % sum == 0)
        {
            System.out.println(num+" is a Niven Number");
        }
        else
        {
            System.out.println(num+" is Not a Niven Number");
        }
        sc.close();
    }
}