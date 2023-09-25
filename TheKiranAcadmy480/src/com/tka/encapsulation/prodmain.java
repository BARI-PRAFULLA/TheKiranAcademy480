package com.tka.encapsulation;
import java.util.Scanner;
public class prodmain {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
           Product p[]=new Product[4];
           
          // p1.bill(sc.nextInt());
           for(int i=0; i<2; i++)
           {   int cost=0;
        	   p[i]=new Product();
        	   
        	   System.out.println("Enter Prodid");
        	   p[i].setProdid(sc.nextInt());
        	   
        	   System.out.println("Enter Prodnm");
        	   p[i].setProdnm(sc.next());
        	   
        	   System.out.println("Enter Prodcost");
        	   p[i].setProdcost(sc.nextDouble()+cost);
        	
        
        	   System.out.println();
           }
           for (int i=0; i<2; i++)
           {
        	 
        	  // int qty=0;
        	   System.out.println("Prodid   :"+p[i].getProdid());
        	   System.out.println("Prodnm   :"+p[i].getProdnm());
        	   System.out.println("Prodcost :"+p[i].getProdcost());
        	   System.out.println("Enter the qty - ");
        	   int qty=sc.nextInt();
        	  
        	   System.out.println("Invoice");
        	   System.out.println("bill = "+p[i].getProdcost()*qty);
        	   System.out.println("--------------");
        	   System.out.println();
        	   System.out.println();
	}

}}
