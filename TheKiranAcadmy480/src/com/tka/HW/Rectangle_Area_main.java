package com.tka.HW;
import java.util.Scanner;
public class Rectangle_Area_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle_Area ra=new Rectangle_Area();
		Scanner sc=new Scanner(System.in);
		     ra.rectangle(20,10);
		  System.out.println(ra.getArea());
		  sc.close();
		
	}

}
