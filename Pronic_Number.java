package JAVA;

import java.util.Scanner;
public class Pronic_Number{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :: ");
        int num = sc.nextInt();

        boolean flag = false;
//      Iteates from all numbers from 1 to num 
        for(int iter=0; iter < num; iter++)
        {
//          Checks whether any consecutive number multiplies to num
            if(iter*(iter+1) == num)
            {
                flag =true;
                break;
            }
        }
        if(flag)
        {
            System.out.println(num+" is a Pronic Number");
        }
        else
        {
            System.out.println(num+" is Not a Pronic Number");
        }
        sc.close();
    }
}