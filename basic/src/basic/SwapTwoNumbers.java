package basic;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		int first = 120, second = 5656;
		System.out.println("---Before swap---");
		System.out.println("First number =" +first);
		System.out.println("Second number =" +second);
		//value of first assigned to temporary
		int temporary = first;
		//value of second is assigned to first
		first = second;
		//value of temporary (which contains the initial value of first) is assigned to second
		second = temporary;
		System.out.println("---After Swap----");
		System.out.println("First number =" +first);
		System.out.println("Second number =" +second);
		
		
	}

}
