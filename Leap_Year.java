package JAVA;

import java.util.Scanner;

public class Leap_Year {
	public static void main(String[] args) 
    {
//      initializing the variable for entering the year value 
        int y;
        Scanner sc = new Scanner(System.in);
//      entering year, we want to check 
        System.out.println("Enter any Year:");
        y = sc.nextInt();
        sc.close();
//      checking leap year or not  using  logical operator 
        if(y%100 == 0 && y%100 != 0 ||  y%400 == 0)
            System.out.println("\n"+ y  + " is a Leap Year.");
        else
            System.out.println("\n"+ y  + " is not a Leap Year.");
    }
}
