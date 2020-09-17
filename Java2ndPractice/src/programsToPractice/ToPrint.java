package programsToPractice;

import java.util.Scanner;

public class ToPrint {

	public static void main(String[] args) {
		
	int a[][]= {{1,3,4},{7,5,9}};
	int i,j;
	int min = a[0][0];
	
	
	 
	 for ( i=0;i<2;i++)
	 	{
		 	for  (j = 0;j<3; j++)
		 		{
		 			if(a[i][j]<min)
		 			{
						min = a[i][j];
		 			}

				}
	 	}
	 
	 System.out.println(min);
}
}
