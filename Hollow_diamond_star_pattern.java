package JAVA;

import java.util.Scanner;

public class Hollow_diamond_star_pattern 
{
	public static void main(String args[])   
    {   
        int row,r,c,d;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        row = s.nextInt();
        for(r=1; r<=row ; r++)
        {
            for(c=row ; c>r; c--)
                System.out.print(" ");
            System.out.print("*");  
            for(c=1; c<(r-1)*2; c++)
                System.out.print(" ");
            if(r==1)
                System.out.print("\n");
            else
                 System.out.print("*\n");
        }
        for(r=row -1; r>=1; r--)
        {
            for(c=row ;c>r; c--) 
                System.out.print(" ");
            System.out.print("*");
            for(c=1; c<(r-1)*2; c++) 
                System.out.print(" ");
            if(r==1) 
                 System.out.print("\n");
            else 
                System.out.print("*\n");
        }
   }
}
