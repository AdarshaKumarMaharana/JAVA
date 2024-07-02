package JAVA;

import java.util.Scanner;

public class LargestAmongThreeNumbers 
{
	public static void main(String[] args)   
    {  
        int first, second, third, big, temp; 
        
        //Scanner class object created to take input
        Scanner sc = new Scanner(System.in);
        
        //Taking input from the user  
        System.out.println("Enter the first number:");  
        first = sc.nextInt();  
        System.out.println("Enter the second number:");  
        second = sc.nextInt();  
        System.out.println("Enter the third number:");  
        third = sc.nextInt();  
        
        //comparing first with second and third value
        if(first>=second && first>=third)  
            System.out.println("The largest among largest numbers: "+first);  
        //comparing second with first and third value
        else if (second>=first && second>=third)  
            System.out.println("The largest among largest numbers: "+second);  
        // else third value is largest
        else  
            System.out.println("The largest among largest numbers: "+third);  
    }  
}
