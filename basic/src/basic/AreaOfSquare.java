package basic;

import java.util.Scanner;

public class AreaOfSquare {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
	System.out.println("Enter the Side of Square: ");
	double side = scan.nextDouble();
	double area = side * side ;
			scan.close();
	System.out.println("Area of Square is: " +area);
	
	}
}
