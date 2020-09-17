package notesMethods;

import java.util.Scanner;

public class ValueReturn {
	
	public static boolean isVowel(char chr)
	{
		if (chr=='a' || chr == 'A' || chr=='e' || chr == 'E' || chr=='i' || chr == 'I' 
				|| chr=='o' || chr == 'O' || chr=='u' || chr == 'U')
		
			return true;
		else 
			return false;
	}

	public static void main(String[] args) 
	
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the character");
		
		char ch=scan.next().charAt(0);
		
		  if (isVowel(ch))
		 
		  System.out.println("Vowel"); else System.out.println("Not Vowel");
	}

}
