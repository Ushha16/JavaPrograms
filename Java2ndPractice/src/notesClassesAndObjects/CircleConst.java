package notesClassesAndObjects;


public class CircleConst {
	
	double radius=5.5;
	
	public CircleConst() {
		 
		radius=1.0;
	}

	public void CircleConst(double r)
	{
		this.radius = r;	
	}
	
	public void setRadius(double r)
	{
		radius=r;
	
	}
	
	public double getRadius()
	{
		return radius;
		
	}
	
	public static void main(String[] args) {
		CircleConst cc = new CircleConst();
		
		System.out.println(cc.getRadius());
	}

}
