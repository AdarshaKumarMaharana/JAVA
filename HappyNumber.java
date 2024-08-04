package JAVA;
import java.util.Scanner;

public class HappyNumber
{
    public static void main(String args[])
    {
//      Taking the number as input from the user using scanner class
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

//      Temp is used to preserve the original value
        int temp = num,sum = 0, remainder =1;
//      Loop to add the digits
        while (temp > 9)
        {
//          Loop to iterate the digits
            while (temp > 0)
            {
                remainder = temp % 10;
                sum = sum + (remainder * remainder);
                temp = temp / 10;
            }
            temp = sum;
            sum = 0;
        }
        if (temp == 1)
        {
            System.out.println(num+" is a Happy Number");
        }
        else
        {
            System.out.println(num+" is Not a Happy Number");
        }
        sc.close();
    }
}