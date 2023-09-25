package com.ControlStatments_loops;
import java.util.Scanner;
public class Factorial_for {
	static Scanner sc=new Scanner(System.in);
			int no;
	   void getData()
	   {
		   System.out.println("Enter a no");
		     no=sc.nextInt();
	   }
	   void facto()
	   {
		   int fact=1,t = 0;
		   for(int i=1;i<=no;i++)
		   {
			   fact=fact*i;   ;
		   }
		
		   System.out.println("Factorial="+fact);
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial_for f=new Factorial_for();
		f.getData();
		f.facto();
	}

}
