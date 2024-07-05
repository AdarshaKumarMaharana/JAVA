package JAVA;

import java.util.Scanner;

public class Prime_number_within_interval 
{
	public static void main(String args[])
	 {
	    int i,count;
	    Scanner sc=new Scanner(System.in);
//	    Ask input from user
	    System.out.println("Please Enter starting number : ");
	    int minValue=sc.nextInt();
	    System.out.println("Please Enter ending number : ");
	    int maxValue=sc.nextInt();
	    System.out.println("Prime numbers between "+minValue+" to "+maxValue+" are : ");
//	    for loop for finding and printing all prime numbers in given range
	    i=minValue;
	    while(i<=maxValue)
	    {
	      count=0;
	      int j=1;
	      while(j<=i)
	      {
	        if(i%j==0)
	        {
	          count++;
	        }
	        j++;
	    }
	    if(count==2)
	      System.out.print(i+" ");
	     i++;
	    }
	 }
}
