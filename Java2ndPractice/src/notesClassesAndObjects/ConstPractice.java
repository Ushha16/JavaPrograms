package notesClassesAndObjects;

public class ConstPractice {
	
	private int x;
	private double y;
	
	public ConstPractice()
	{
		x=0;
		y=0.0;	
	}
	
	public ConstPractice(int a, double b)
	{
		x=a;
		y=b;
	}
	
	public void setConstPractice()
	{
		 x=10;
		 y = 25.8;
	}
	
	public void print()
	{
		System.out.println("2 constructors are there in this example");
		System.out.println("x=" +x+ "  y="+y);
	}
	

	public static void main(String[] args) {
		
		ConstPractice cp = new ConstPractice();
		ConstPractice cp1= new ConstPractice(20,35.0);
		
		cp1.print();
		cp.print();
	
	}

}
