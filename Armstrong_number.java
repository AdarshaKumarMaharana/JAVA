package JAVA;

import java.util.Scanner;

public class Armstrong_number 
{
	public static void main(String[] args)
    {  
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter the number : ");  
        int n= sc.nextInt();
//      storing original value in temp variable 
        int k=n;
        int temp=0;
//      calculating the cube sum of digit of that number  
        while(n>0)
            {
                int a=n%10;
                temp=temp+(a*a*a);
                n=n/10;
            }
//      comparing with the original value and printing  it.
        if (k==temp)
            System.out.print(k + " is an Armstrong"); 
        else
            System.out.print(k+ " is an Not Armstrong"); 
    }
}
