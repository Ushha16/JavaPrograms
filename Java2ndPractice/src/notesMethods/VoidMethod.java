package notesMethods;

public class VoidMethod {
	
	public static void sum()
	{
		int num1 = 5 ,num2 =6;
		
		System.out.println("Sum of two numbers = " +(num1+num2));
		
	}
	
	public static void div(int num1, int num2)
	{
		int division ;
		
		division = num1/num2;
		System.out.println("division = " + division );
		
	}

	public static void main(String[] args) {
		
			sum();
			
			div(18,3);
	}

}
