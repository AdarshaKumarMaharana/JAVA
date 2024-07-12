package JAVA;

import java.util.Scanner;

public class Hollow_triangle_star_pattern 
{
	 public static void main(String[] args)  
	    {  
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Enter the number of rows : ");
	        int  rows=scan.nextInt();
	        for (int r=1; r<=rows; r++)
	        {
	            for (int c=rows; c>r; c--)
	            {
	                System.out.print(" ");
	            }
	            for (int k=1; k<=r; k++)
	            {
	                if( k == 1 || k == r || r == rows)
	                    System.out.print("*");
	                else
	                    System.out.print(" ");
	            }
	            System.out.println();
	        }  
	    }  
}
