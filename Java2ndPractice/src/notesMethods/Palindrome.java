package notesMethods;

import java.util.Scanner;

public class Palindrome {
	
	public static boolean isPalindrome(int num)
	{
		int rev=0, num1=num;
		
		while (num>0)
			
		{
			int digit = num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		
		if (rev==num1)
		return true;
		else
			return false;
	}

	public static void main(String[] args) {
		
		System.out.println("Enter number");
		Scanner scan = new Scanner(System.in);
				
		int number;
		
		number=scan.nextInt();
		
		if(isPalindrome(number))
		
			System.out.println("palindrome");
		
		else
			System.out.println("Not Palindrome");
		
	}

}
