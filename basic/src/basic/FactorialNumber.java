package basic;

import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = scan.nextInt();
		scan.close();
		//Called the user defined function fact 
		int factorial = fact(num);
		System.out.println("Factorial of Entered Number Is: " +factorial);
	}
	static int fact(int n)
	{
		int output;
		if(n==1) {
			return 1;
			
		}
		//Recursion : Function calling itself!
		output = fact(n-1)*n;
		return output;
		
	}

}
