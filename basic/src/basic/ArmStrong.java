package basic;

public class ArmStrong {
	public static void main(String[] args) {
		
	
	int num = 371, originalNumber, remainder, result = 0;
	originalNumber = num;
	while (originalNumber != 0)
	{
		remainder = originalNumber % 10;
		result += Math.pow(remainder, 3);
		originalNumber /= 10;
	}
		if (result == num)
			System.out.println( num + " is an Armstrong number.");
		else
			System.out.println( num + " is not Armstrong number.");

			

			}
		}