package javaBasics;

public class ConClass {
	
	ConClass()
	{
		System.out.println("Default Constructor");
	}
	
	ConClass(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		
		ConClass cc = new ConClass();		
		ConClass cc1 = new ConClass(10,5);
	}

}
