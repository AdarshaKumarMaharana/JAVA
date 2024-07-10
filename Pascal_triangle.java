package JAVA;

import java.util.Scanner;

public class Pascal_triangle 
{
	public static void main(String args[])
	{
        int row,r,c;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        row = s.nextInt();
       for (r=0; r<row; r++) 
        {
            for (c=row-r; c>1; c--)
                System.out.print(" ");
//          iteration for printing stars
            for (c=0; c<=r; c++ )
                System.out.print("* ");
//          taking to new line
            System.out.println();
        }
    }
}
