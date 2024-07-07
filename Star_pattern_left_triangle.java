package JAVA;

import java.util.Scanner;

public class Star_pattern_left_triangle 
{
	public static void main(String args[])   
    {   
    int row,r,c;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the number of rows : ");
    row = s.nextInt();
        for (r=0; r<row; r++) 
        {
//           iteration for printing space 
             for (c=2*(row-r); c>=0; c--)         
               System.out.print(" ");  
//          iteration for printing stars
            for (c=0; c<=r; c++ ) 
                System.out.print("* "); 
//          printing new line .
            System.out.println();   
        }   
    }
}
