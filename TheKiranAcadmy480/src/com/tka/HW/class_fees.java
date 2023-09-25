package com.tka.HW;
import java.util.Scanner;
public class class_fees {
     static	Scanner sc=new Scanner(System.in);
    
       
   
         void sub_fees()
         {
        	 int avgfees=0, sum=0;
        	
        	 for(int i=1;i<=5;i++)
        	 {
        			System.out.println("Enter sub fee ");
                  	 int fee=sc.nextInt();
        	  sum=sum+fee;
        	  avgfees=sum/5;
        	
        	 }
        	 System.out.println("average fee="+avgfees);
         }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class_fees cf=new class_fees();
		
		cf.sub_fees();
	}

}
