package basic;
import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Radius: ");
		double radius = scan.nextDouble();
		double area = Math.PI * (radius * radius);
		System.out.println("The Area of Circle is : " +area);
		double circumference = Math.PI*2*radius;
		System.out.println("The Circumference of the Circle is :" +circumference);
		scan.close();
		
		
	}

}
