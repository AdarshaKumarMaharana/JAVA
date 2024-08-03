package JAVA;
import java.util.Scanner;

class DuckNumber{
    public static void main(String args[])
    {
//      Taking the number as input from the user using scanner class
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :: ");
        int num = sc.nextInt();

//      Temp is used to preserve the original value
        int temp = num, remainder;
//      Flag is a variable to break the loop if 0 is encountered
        boolean flag = false;
//      While loop to iterate through each digit
        while (temp > 0)
        {
            remainder = temp % 10;
            if(remainder==0)
            {
                flag=true;
            }
            temp = temp / 10;
        }
        if(flag)     
        {
            System.out.println(num+" is a Duck Number");
        }
        else
        {
            System.out.println(num+" is not a Duck Number");
        }
        sc.close();
    }
}