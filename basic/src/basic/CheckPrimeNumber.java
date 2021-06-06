package basic;
import java.util.Scanner;
public class CheckPrimeNumber {
	public static void main(String[] args) {
		int temp;
		boolean isPrime = true;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any Numbers");
		temp = scan.nextInt();
		scan.close();
		for(int i = 2; i <= temp / 2; i++ )
			temp = temp%i;
		if(temp == 0)
		{
			isPrime = false;
		
			
		}
		if(isPrime)
			System.out.println(temp + " is a Prime Number ");
		else
			System.out.println(temp + " is not a prime Number");
		
	}
}
