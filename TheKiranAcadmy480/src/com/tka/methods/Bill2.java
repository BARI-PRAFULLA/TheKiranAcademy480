package com.tka.methods;
import java.util.Scanner;
public class Bill2 {
	 //method with without passing without return parameter
	final int cost=500;
	
     void billcal()
     {
    
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter productnm");
    	 String pronm=sc.next();
    	 
    	 System.out.println("Enter Qty");
    	 int qty=sc.nextInt();
    	
    	
    		int billamt=qty*cost;
    		System.out.println("--------------");
    		System.out.println("Invoice");
    		System.out.println("Qty-"+qty);
    		System.out.println("Total="+billamt);
    		sc.close();
    	}
    	 
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bill2 b2=new Bill2();
		b2.billcal();
		
	}

}
