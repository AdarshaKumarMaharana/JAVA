package JAVA;

import java.util.Scanner;

public class Armstrong_number_within_interval 
{
	public static void main(String[] args)
    {  
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter the 1st  number : ");  
        int n1= sc.nextInt();
        System.out.print("Enter the 2nd number : ");  
        int n2= sc.nextInt();
        System.out.print("Amstrong numbers between "+n1+" and "+n2+" are :");
//      traversing between two number 
        for( int i=n1; i<=n2;i++)
        {
//          storing original value in temp variable
            int k=i;
            int temp=0;
//          calculating the cube sum of digit of that number  
            while(k>0)
                {
                    int a=k%10;
                    temp=temp+(a*a*a);
                    k=k/10;
                }
             if (temp==i) 
            System.out.print(temp+" , ");
        }   
    }
}
