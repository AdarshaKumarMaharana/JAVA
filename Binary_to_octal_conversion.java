package JAVA;

import java.util.Scanner;

public class Binary_to_octal_conversion 
{
	int binaryToDecimal(long binary_no)
    {
        int decimal_Number = 0, k = 0;
        while (binary_no > 0)
        {
        decimal_Number+= Math.pow(2, k++) * (binary_no % 10);
        binary_no /= 10;
        }
        return decimal_Number;
    }
    
    int decimalToOctal(long binary_no)
    {
        int decimal_Number = binaryToDecimal(binary_no);
        String octalString= Integer.toOctalString(decimal_Number);
        int octal_Number = Integer.parseInt(octalString);
        return octal_Number;
    }
    
    public static void main(String[] args)
    {
        Binary_to_octal_conversion ob = new Binary_to_octal_conversion();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number : ");
        long n = sc.nextLong();
        System.out.println("The octal value of "+n+" is "+ob.decimalToOctal(n));
    }
}
