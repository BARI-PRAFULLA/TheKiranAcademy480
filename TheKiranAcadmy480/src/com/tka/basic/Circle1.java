package com.tka.basic;
import java.util.Scanner;
public class Circle1 {

	  void area(double rad1)
	  {
		 
		  double pi=3.14d;
		 double  a=pi*(rad1*rad1);
		   System.out.println("area of circle="+a);
		  
	  }
	
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle1 c1=new Circle1();
		 Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius");
		int rad1=sc.nextInt();
        c1.area(rad1);
		sc.close();
	}

}
