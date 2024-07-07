package JAVA;

import java.util.Scanner;

public class Calculator_using_switch_case {
	public static void main(String[] args) 
	  {
	    char operator;
	    int operand1, operand2, result;
//	    Scanner class object created, for user input
	    Scanner sc= new Scanner(System.in);
	    System.out.print("Enter first number : ");
	    operand1 = sc.nextInt();
	    System.out.print("Enter second number : ");
	    operand2 = sc.nextInt();
	    
	    System.out.println("Choose an operator : + , - , * , or / ");
	    operator = sc.next().charAt(0);
	    switch (operator) 
	    {
//	      addition
	      case '+':
	        result = operand1+operand2;
	        System.out.println("Result = "+operand1+ " + " +operand2+ " = " + result);
	        break;
//	      subtraction
	      case '-':
	        result = operand1-operand2;
	        System.out.println("Result = "+operand1+ " - " +operand2+ " = " + result);
	        break;
//	      multiplication
	      case '*':
	        result = operand1*operand2;
	        System.out.println("Result = "+operand1+ " * " +operand2+ " = " + result);
	        break;
//	      division
	      case '/':
	        result = operand1/operand2;
	        System.out.println("Result = "+operand1+ " / " +operand2+ " = " + result);
	        break;
	      default:
	        System.out.println("Please enter a valid operator...");
	        break;
	    }
	  }
}
