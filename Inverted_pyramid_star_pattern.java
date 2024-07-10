package JAVA;

import java.util.Scanner;

public class Inverted_pyramid_star_pattern 
{
	public static void main (String[] args) 
	{
	      
	    int row,r, c;
	    System.out.print("Enter no of rows = ");
	    Scanner sc= new Scanner(System.in);
	    row=sc.nextInt();
	    for(r=1; r<=row; ++r)
	    {
	        for(c=1; c<=r; ++c)
	        {
	            System.out.print(" ");
	        }
	        for(c =1; c <=((row*2)-((2*r)-1)); ++c)
	        {
	            System.out.print("*");
	        }
	        System.out.println("");
	    }
	}
}
