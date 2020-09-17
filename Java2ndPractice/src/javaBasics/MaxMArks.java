package javaBasics;

public class MaxMArks {

	public static void main(String[] args) {
		
		
		int a[] = {98,99,65,100,67};
		
		int max = a[0];
		
		for (int i=0;i<a.length;i++)
		{
			if (a[i]>max)
			{
				max=a[i];
			}
			
		}
		
System.out.println(max);
	}

}
