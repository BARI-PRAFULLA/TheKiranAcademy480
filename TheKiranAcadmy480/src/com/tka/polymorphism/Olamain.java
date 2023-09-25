package com.tka.polymorphism;
import java.util.Scanner;
public class Olamain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ola_aap op=new Ola_aap();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the city");
	    op.setCity(sc.next());
	    System.out.println("Enter the Startdest");
		op.setStartdest(sc.next());
		System.out.println("Enter the Enddest");
		op.setEnddest(sc.next());
	
		
	
		
		
		
		System.out.println("city :"+op.getCity());
		System.out.println("startdestination :"+op.getStartdest());
		System.out.println("enddestination :"+op.getEnddest());
		
		System.out.println("Enter the kilometer");
   	     int km=sc.nextInt();
   	       boolean withincity;
	        boolean outsidecity;
	   if(withincity=true)
    	    System.out.println("withincity totamt="+km*8+2);
   	     else if (outsidecity=true)
   		    System.out.println("outsidecity totamt="+km*10+4);
}}