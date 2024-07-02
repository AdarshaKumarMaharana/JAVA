package JAVA;

public class SwapTwoNumbersUsingBitwiseXOR 
{
	public static void main(String args[])
    {
        int a = 6;
        int b = 13;
        
        //print the values of numbers before swapping
        System.out.println("--Before swapping--");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);
 
        // For XOR operations. x=0110, y=1101
        a = a ^ b; // a now becomes 11 (1011)
        b = a ^ b; // b becomes 6 (0110)
        a = a ^ b; // a becomes 13 (1101)
 
        // print the values of number after swapping
        System.out.println("\n\n--After swapping--");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);
    }
}
