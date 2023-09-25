package com.tka.methods;
import java.util.Scanner;
public class Square {
           
	
	   void area(int side)
	   {
		  int a=(side*side);
			System.out.println("area of Square"+a);
			
			  
				  
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s=new Square();
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the area of one side");
          int side=sc.nextInt();	
           s.area(side);
	      sc.close();
	}
}
