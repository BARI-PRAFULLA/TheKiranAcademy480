package com.tka.polymorphism;



public class Foodapp1 {
	 boolean member;
	  String couponcd;
	  boolean normal_member1= true ;
	   void disc( String couponcd)
	   {
		   if((couponcd.startsWith ("P")||couponcd.startsWith("p")))
		   System.out.println("Eligible for 25% discount");
	   }
		   

	   void disc1( String couponcd,String normal_member)
	   {   
		   boolean normal_member1= true ;
		 
		if((couponcd.startsWith ("A")||couponcd.startsWith("a"))&&normal_member1==true)
		   System.out.println("Eligible for 25% discount");
		else if ((couponcd.startsWith ("P")||couponcd.startsWith("p"))&&normal_member1==false)
			 System.out.println("Eligible for 20% discount");
		else if(normal_member1==true)
			System.out.println("Eligible for 15% discount");
		else
			System.out.println("Enter valid code ");
       }
	   void disc2( String couponcd,String primium_member)
	   {
		   boolean  primium = true ;
		  if((couponcd.startsWith ("A+")||couponcd.startsWith("a+"))&&normal_member1==true)
		  System.out.println("Eligible for 40% discount");
		  else if ((couponcd.startsWith ("P+")||couponcd.startsWith("p+"))&&normal_member1==false)
			  System.out.println("Eligible for 30% discount");
		  else if(normal_member1==true)
				System.out.println("Eligible for 20% discount");
		  else
				System.out.println("Enter valid code ");  
	   }
	   }

