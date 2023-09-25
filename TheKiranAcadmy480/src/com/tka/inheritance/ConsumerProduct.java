package com.tka.inheritance;

import java.util.Scanner;

public class ConsumerProduct extends Product {
	 
	 private String prodcategory;
	 private String prodnm;
	 private double prodcost;
	 static Scanner sc=new Scanner(System.in);   

	public String getProdcategory() {
		return prodcategory;
	}


	public void setProdcategory(String prodcategory) {
		this.prodcategory = prodcategory;
	}


	public String getProdnm() {
		return prodnm;
	}


	public void setProdnm(String prodnm) {
		this.prodnm = prodnm;
	}


	public double getProdcost() {
		return prodcost;
	}


	public void setProdcost(double prodcost) {
		this.prodcost = prodcost;
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConsumerProduct cp=new ConsumerProduct();
		System.out.println("Enter Prodid");
		cp.setProdid(sc.nextInt());
		System.out.println("Enter Prodnm");
		cp.setProdnm(sc.next());
		System.out.println("Enter Prodcategory");
		cp.setProdcategory(sc.next());
		System.out.println("Enter Prodcost");
		cp.setProdcost(sc.nextDouble());
		
		
		 System.out.println("prodid :"+cp.getProdid());
		 System.out.println("prodnm :"+cp.getProdnm());
		 System.out.println("prodcategory :"+cp.getProdcategory());
		 System.out.println("prodcost :"+cp.getProdcost());
		
			System.out.println("Enter prod qty");
				int qty=sc.nextInt(); //double cost=0;
				System.out.println("Billamt :"+(cp.getProdcost()*qty) );
			

	}

}
