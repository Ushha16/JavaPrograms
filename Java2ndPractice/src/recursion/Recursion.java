package recursion;

import java.util.Scanner;

public class Recursion {
	
	public static void printNum(int num)
	{
		if (num==0)
		{
			return;
		}
		else
		{
			System.out.println(num);
			printNum(num-1);
		}
	}

	public static void main(String[] args) {
		
		int number;
		System.out.println("Enter Number");
		Scanner scan = new Scanner(System.in);
		
		number=scan.nextInt();
		
		printNum(number);

	}

}
