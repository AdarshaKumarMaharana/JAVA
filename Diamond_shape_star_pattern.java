package JAVA;

import java.util.Scanner;

public class Diamond_shape_star_pattern 
{
	public static void main(String args[])   
    {   
    int row,r,c,d;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the number of rows : ");
    row = s.nextInt();
    d = row - 1;
        for (r = 1; r <= row; r++) 
        {
            for (c = 1; c <= d; c++) 
                System.out.print(" ");
            d--;
            for (c = 1; c <= 2 * r - 1; c++) 
                System.out.print("*");   
            System.out.println("");
        }
        d = 1;
        for (r = 1; r <= row - 1; r++) 
        {
            for (c = 1; c <= d; c++) 
                System.out.print(" ");
            d++;
            for (c = 1; c <= 2 * (row - r) - 1; c++) 
                System.out.print("*");
            System.out.println("");
        }
    }
}
