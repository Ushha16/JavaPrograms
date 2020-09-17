package notesMethods;

import java.util.Scanner;

public class IsEvenOrOdd {
	
	public static boolean isEven(int num)
	{
		
		if ( num%2 ==0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int number;
		
		System.out.println("Enter number:");
		number = scan.nextInt();
		
		if (isEven(number))
			System.out.println("Even");			
		else
			System.out.println("Odd");
		
	}

}
