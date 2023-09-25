package com.tka.test;
import java.util.Scanner;

public class Odd_Number1to20 {
	
	static  Scanner sc=new Scanner(System.in);
	   void checkT()
       { 
		   for(int i=0;i<=20;i++) {
		   int no=sc.nextInt();
     	  
     	  if(no%2==0) 
     		  System.out.println("not odd no");
     	  else 
     		  System.out.println("Number is odd");
     	  break;
     	  }
       }
		  
       
    	
    		 
    	  
    	
    	  

public static void main(String[] args) {
	 Odd_Number1to20 O2=new Odd_Number1to20();
	 
	 System.out.println("Enter the number");
	
	 O2.checkT();
}
}