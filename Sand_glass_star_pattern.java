package JAVA;

import java.util.Scanner;

public class Sand_glass_star_pattern 
{
	public static void main(String args[])   
    {   
    int row,r,c,d;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the nmber of rows : ");
    row = s.nextInt();
    for ( r= 0; r<= row -1 ; r++)
       {
            for (  c=0; c <r; c++)
                  System.out.print(" ");
            for (  c=r; c<=row -1; c++) 
                 System.out.print("* "); 
            System.out.println();
        } 
        
    for (  r= row -1; r>= 0; r--)
       {
            for (  c=0; c< r ;c++)
                System.out.print(" ");
             for (  c=r; c<=row -1; c++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
