package com.tka.HW;
import java.util.Scanner;
public class Number {
	Scanner sc=new Scanner(System.in);
	          
           void checkno(int num)
           {
        	
	           
        	   if (num>0)
        		   System.out.println("number is positive");
        	   else if (num<0)
        		   System.out.println("number is negative");
        	   else 
        		   System.out.println("number is zero");
        		sc.close();   
        		   
           }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number n=new Number();
		  Scanner sc=new Scanner(System.in);
          System.out.println("Enter a number");
          int num=sc.nextInt(); 
		n.checkno(num);
	}

}
