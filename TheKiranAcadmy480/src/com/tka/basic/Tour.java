package com.tka.basic;
import java.util.Scanner;
public class Tour {
       
	void calc(double tcost,int noofper)
	{
		double total=noofper*tcost;
		total=total+(total*10)/100;
		System.out.println("Total="+total);
	   
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tour t=new Tour();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of person & tcost");
	     t.calc(sc.nextDouble(),sc.nextInt());
        sc.close();
	}

}
