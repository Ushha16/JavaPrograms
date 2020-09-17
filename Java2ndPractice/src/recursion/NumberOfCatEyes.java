package recursion;

import java.util.Scanner;

public class NumberOfCatEyes {
	
	public static int countEyes(int cats) {
		
		
		if(cats==0)
		{
			return 0;
		}
		
		else
		{
			return 2 + countEyes(cats-1);
		
		}
		
	}

	public static void main(String[] args) {
		
		int cat;
		
		System.out.println("Enter number of cats");
		Scanner scan=new Scanner(System.in);
		cat = scan.nextInt();
		
		System.out.println("Cat Eyes = " + countEyes(cat));
		

	}

}
