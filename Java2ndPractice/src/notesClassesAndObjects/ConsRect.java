package notesClassesAndObjects;

public class ConsRect {
	
	private double length;
	private double width;
	
	public ConsRect()
	{
		
	}
	
	public ConsRect(double l, double w)
	{
		length = l; 
		width = w;
	}
	
	public void set(double l, double w)
	{
		length = l;
		width = w;
		
	}
	
	public double getArea()
	{
		return length * width;
	}
	
	public double getPeri()
	{
		return 2*(length+width);
	}

	public static void main(String[] args) {
		
		ConsRect cr = new ConsRect();		
		System.out.println(cr.getArea());
		System.out.println(cr.getPeri());
		
		
		
		ConsRect cr1 = new ConsRect(4.5,8.5);		
		System.out.println(cr1.getArea());
		System.out.println(cr1.getPeri());

	}

}
