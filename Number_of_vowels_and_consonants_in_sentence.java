package JAVA;

import java.util.Scanner;

public class Number_of_vowels_and_consonants_in_sentence 
{
	public static void main(String args[])
	   {
	      int vow = 0, cons=0;
	      // Ask user to enter a string
	      System.out.println("Please enter a sentence :");
	      Scanner sc = new Scanner(System.in);
	      String str = sc.nextLine();
	      // convert the whole string to lowercase
	      str = str.toLowerCase();
	      for (int i=0 ; i<str.length(); i++)
	      {
	         char temp = str.charAt(i);
	         // check if character is a vowel
	         if(temp == 'a'|| temp == 'e'|| temp == 'i' ||temp == 'o' ||temp == 'u')
	         {
	            vow ++;
	         }
	         
	         // check if there is any character other than vowels
	         else if ((temp >= 'a' && temp <= 'z')) 
	         {
	         ++cons;
	        }
	      }
	      System.out.println("Vowels =  "+vow);
	      System.out.println("Consonants =  "+cons);
	   }
}
