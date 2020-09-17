package notesMethods;

import java.util.Scanner;

public class PassingArguments {
	
	public static void factorial(int num)
	{
		int fact = 1;
		for (int i = 1; i<=num; i++)
		{
			fact = fact*i;
		}
			
	System.out.println("Factorial = " + fact);
		
	}
	
	

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	int number;
	
	System.out.println("Enter Number : ");
	
	number=scan.nextInt();
	
	factorial(number);
	
	
	
	}

}
