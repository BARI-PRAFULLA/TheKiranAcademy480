package com.tka.HW;
import java.util.Scanner;
public class pro {
	  static	Scanner sc=new Scanner(System.in);
              void p1()
              {
            	  int no,p=1;
            	  for( int i=1;i<=10;i++)
            	  {
            		  System.out.println("Enter a num");
            		  no=sc.nextInt();
            		  p=p*no;
            		
            	  }
            	  System.out.println("product="+p);
              }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 pro p=new  pro();
		 p.p1();
		 
	}

}
