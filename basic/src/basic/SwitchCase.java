package basic;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		char operator;
		Double num1, num2, result;
		
		//Creat an Object an Scanner Class
		Scanner scan = new Scanner(System.in);
		
		//Ask user to enter operator
		System.out.println("Choose an Operator : +, -, *  or / ");
		operator = scan.next().charAt(0);
		
		//Ask useer to enter numbers
		System.out.println("Enter First number");
		num1 = scan.nextDouble();
		
		System.out.println("Enter Second number");
		num2 = scan.nextDouble();
		
		switch (operator) {
		
		//perform addition between numbers
		case '+':
			result = num1 + num2;
			System.out.println(num1 + "+" + num2 + "=" +result);
			break;
		
		case '-':
			result = num1 - num2;
			System.out.println(num1 + "-" + num2 + "=" +result);
			break;
			
		case '*':
			result = num1 * num2;
			System.out.println(num1 + "*" + num2 + "=" +result);
			break;	
			
		case '/':
			result = num1 / num2;
			System.out.println(num1 + "/" + num2 + "=" +result);
			break;
			
			default:
				System.out.println("Invalid Operator!");
				break;
				
		}
		scan.close();
		
		
		
	}

}
