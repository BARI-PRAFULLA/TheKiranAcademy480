package com.tka.HW;
import java.util.Scanner;
public class grade {
	      
	void checkper()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks of sub1");
		 double sub1=sc.nextDouble();
		 System.out.println("Enter the marks of sub2");
		 double sub2=sc.nextDouble();
		 System.out.println("Enter the marks of sub3");
		 double sub3=sc.nextDouble();
	   
		 double total=sub1+sub2+sub3;
		 System.out.println("Enter outoff total");
		double outoff=sc.nextDouble();
		 double per=total/outoff*100;
		 System.out.println("Percentage="+per);
		 /*Example:- sub1 total marks 400 i get 320 outoff400
		  * 3 sub total= 1200 my sub total=960
		  * calc:-  320+320+320=960=store on total
		  *         960/1200*100=80%=store on per  */

		
		if (per>=90 && per<100)
		System.out.println("You get grade A+");
		else if (per>=75 && per<90)
			System.out.println("You get grade A");
		else if (per>=60 && per<75)
			System.out.println("You get grade B");
		else if (per>=45 && per<60)
			System.out.println("You get grade C");
		else 
			System.out.println("fail");
		sc.close();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		grade g=new grade();
		g.checkper();
	}

}
