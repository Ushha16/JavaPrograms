package notesClassesAndObjects;

import java.util.Set;

public class Rectangle {
	
	private double width;
	private double length;
	
	public void set(double l, double w)
	{
		width = w;
		length = l;
	}
	
	public double getArea()
	{
		return width*length;
	}
	
	public double getPerimeter()
	{
		return 2*(width+length);
	}
	

	public static void main(String[] args) {
		
		Rectangle rectangle1 = new Rectangle();
		
		rectangle1.set(4.5, 5.5);
		
		System.out.println(rectangle1.getArea());
		System.out.println(rectangle1.getPerimeter());
		

	}

}
