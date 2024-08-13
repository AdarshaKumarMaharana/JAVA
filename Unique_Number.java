package JAVA;

import java.util.Scanner;
public class Unique_Number{
    public static void main(String args[])
    {
//      Taking the number as input from the user using scanner class
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

//      n1 and n2 are variable holders for num, counter is the digit counter
        int n1 = num, n2 = num, remainder1, remainder2, counter=0;
//      Checking the occurence of digits
        while (n1 > 0)
        {
            remainder1 = n1 % 10;
            while (n2 > 0)
            {
                remainder2 = n2 % 10;
                if (remainder1 == remainder2)
                {
                    counter++;
                }
                n2 = n2 / 10;
            }
            n1 = n1 / 10;
        }

        if(counter==1)
        {
            System.out.println(num+" is an unique number");
        }
        else
        {
            System.out.println(num+" is not an unique number");
        }
        sc.close();
    }
}