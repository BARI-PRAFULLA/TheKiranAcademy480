package com.tka.conditional;
import java.util.Scanner;
public class FoodApp {
  boolean member;
  String couponcd;
  final int pizzacost=500;
  
  static Scanner sc=new Scanner(System.in);
  int qty;
  int bill=qty*pizzacost;
  
   void getData()
   {
	   System.out.println("Enter coupan code");
	   String couponcd=sc.next();
	   System.out.println("Enter true if you are a member else enter false");
	   boolean member=sc.nextBoolean();
	  
	   
   }
   void discount1()
   {
	   if ((couponcd.startsWith ("P")||couponcd.startsWith("p"))&&member==true) 
	   {
		   System.out.println("Eligible for 25% discount");
		   bill=bill*25/100;
	   }
	   else if ((couponcd.startsWith("P")||couponcd.startsWith("p"))&&member==false)
	   {
		   System.out.println("Eligible for 20% discount");
		   bill=bill*20/100;
	   }
	   else if (member==true)
	   {
		   System.out.println("E+ligible for 15% discount");
		   bill=bill*15/100;
	   }
	   else 
		   System.out.println("No Discount");
	   System.out.println("total bill="+bill);
	   
   }
}
