package JAVA;

import java.util.Scanner;

public class Binary_to_hexadecimal_conversion {
	int binaryToDecimal(long binary_no)
    {
        int decimal_Number = 0, i = 0;
        while (binary_no > 0) 
        {
            decimal_Number
            += Math.pow(2, i++) * (binary_no % 10);
            binary_no /= 10;
        }
        return decimal_Number;
    }
        
    String decimalToHex(long binary_no)
        {
        int decimal_Number = binaryToDecimal(binary_no);
        
        String hexNumber= Integer.toHexString(decimal_Number);
        hexNumber = hexNumber.toUpperCase();
    
        return hexNumber;
    }
    
    public static void main(String[] args)
    {
    	Binary_to_hexadecimal_conversion ob = new Binary_to_hexadecimal_conversion();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the binary number : ");
        long n = sc.nextLong();
        System.out.println("Hexadecimal value of "+n+" is "+ob.decimalToHex(n));
    
    }
}
