package JAVA;

import java.util.Scanner;

public class inverted_pascal_triangle_star_pattern 
{
	public static void main(String args[])
	{
    int row,r,c,d;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the number of rows : ");
    row = s.nextInt();
    for (r=row;r>=1;r--)
        {
            for(c=row-r;c>=1;c--)
                System.out.print(" ");
            for(c=1;c<=r;c++)
                 System.out.print(" * ");
            System.out.println();
        }
	}
}
