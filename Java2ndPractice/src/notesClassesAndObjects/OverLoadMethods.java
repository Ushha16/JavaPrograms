package notesClassesAndObjects;

public class OverLoadMethods {
	
	public void getPrint()
	{
		System.out.println("No Parameters");
	}
	
	public void getPrint(int a, int b)
	{
		System.out.println("With int type parameters");
		System.out.println(a);
		System.out.println(b);
	}
	
	public void getPrint(String str)
	{
		System.out.println("With String type parameter");
		System.out.println(str);
	}

	public void getPrint(double x, double y)
	{
		System.out.println("With double type parameter");
		
		System.out.println(x);
		System.out.println(y);
	}


	public static void main(String[] args) {
		OverLoadMethods olm = new OverLoadMethods();
		
		olm.getPrint();
		olm.getPrint("USHHA");
		olm.getPrint(4.5, 6.7);
		olm.getPrint(4, 5);

	}

}
