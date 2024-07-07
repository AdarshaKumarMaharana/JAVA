package JAVA;

import java.util.Scanner;

public class Star_pattern_right_angle_triangle 
{
	public static void main(String args[])
	 { 
	    int row,r,c;
	    Scanner s = new Scanner(System.in);
//	    entering the number of row
	    System.out.print("Enter the number of rows : ");
	    row = s.nextInt();
	    for(r=1;r<=row;r++)
	     {
//	         iteration for printing stars
	         for(c=1;c<=r;c++)
	         {
	             System.out.print("* ");
	         }
//	         taking to the new line 
	         System.out.println(" ");
	     } 
	 }
}
