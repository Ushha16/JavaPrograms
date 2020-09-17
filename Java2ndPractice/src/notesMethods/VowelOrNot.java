package notesMethods;

import java.util.Scanner;

public class VowelOrNot {
	
	public static boolean isVowel(char letter)
	{
		switch (letter)
		{
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			
			return true;
			default:
				return false;
			
		}
	}

	public static void main(String[] args) {
		
		System.out.println("Enter the String");
		Scanner scan = new Scanner(System.in);
		
		String str;
		
		str = scan.nextLine();
		
		int count = 0;
		
		for (int i=0;i<str.length();i++)
		{
			if (isVowel(str.charAt(i)))
			{
				count++;
			}
			
		}
		System.out.println("vowels count = " + count);
		
		scan.close();
	}

}
