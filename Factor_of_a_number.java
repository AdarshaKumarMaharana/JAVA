package JAVA;

import java.util.Scanner;

public class Factor_of_a_number {
	public static void main(String[] args) 
	  {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ::");
	    int num = sc.nextInt();
	    int i=1;  
	    System.out.print("Factors of " + num + " = ");
	    // iterate i from 1 to num
	    while(i <= num) 
	    {
	        // if num is divisible by i print i
	            if(num % i == 0) 
	            {
	                System.out.print(i + " , ");
	            }
	            i++;
	    }
	  }
}
