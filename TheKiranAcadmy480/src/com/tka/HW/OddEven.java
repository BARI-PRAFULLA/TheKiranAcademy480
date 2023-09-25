package com.tka.HW;
import java.util.Scanner;
public class OddEven {
           void check1()
           {
        	  Scanner sc=new Scanner(System.in);
        	  System.out.println("Enter a Number");
        	  int no=sc.nextInt();
        	  
        	  if(no%2==0)
        		  System.out.println("Number is Even");
        	  else
        		  System.out.println("Number is odd");
        	  
        	  sc.close();
        	  
           }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         OddEven oe=new OddEven();
         oe.check1();
        		 
	}

}
