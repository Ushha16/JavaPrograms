package notesMethods;

import java.util.Scanner;

public class ReturnStatement {
	
	public static int factorial(int num)
	{
		int fact = 1;
		
		for (int i=1;i<=num;i++)
		{
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int number, x;
		
		System.out.println("Enter Number : ");
		number = scan.nextInt();
		x = factorial(number);
		
		System.out.println("Factorial = " +x);
		scan.close();
		

	}

}
