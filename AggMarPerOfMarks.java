package javaprograms;

import java.util.Scanner;

public class AggMarPerOfMarks {

	public static void main(String[] args) {
	int m1,m2,m3,m4,m5,aggr;
	float per;
	Scanner aggper=new Scanner(System.in);
	System.out.println("Enter Marks:");
	m1=aggper.nextInt();
	m2=aggper.nextInt();
	m3=aggper.nextInt();
	m4=aggper.nextInt();
	m5=aggper.nextInt();
	System.out.println("Marks for M1,M2,M3,M4,M5 = " +m1 +" , " +m2 +" , " +m3 +" , " +m4 +" , " +m5);
	aggr=m1+m2+m3+m4+m5;
	per=aggr/5;
	System.out.println("Aggregate Marks = " + aggr);
	System.out.println("Percentage of Marks = " + per);
	
	}

}
