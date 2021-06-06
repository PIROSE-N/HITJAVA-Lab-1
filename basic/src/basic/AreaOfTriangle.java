package basic;

import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter the width of the Triangle: ");
	double base = scan.nextDouble();
	System.out.println("Enter the Height of the Triangle: ");
	double height = scan.nextDouble();
	
	double area = (base * height)/2;
	scan.close();
	System.out.println("Area  of  Triangle is : " +area);


}

}
