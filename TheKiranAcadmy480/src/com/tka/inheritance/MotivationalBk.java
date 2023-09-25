package com.tka.inheritance;
import java.util.Scanner;


public class MotivationalBk extends Author {
	  static Scanner sc=new Scanner(System.in); 
	 private String booknm;
	 private int noofpage;
	 private double bookcost;

	public String getBooknm() {
		return booknm;
	}

	public void setBooknm(String booknm) {
		this.booknm = booknm;
	}

	public int getNoofpage() {
		return noofpage;
	}

	public void setNoofpage(int noofpage) {
		this.noofpage = noofpage;
	}

	public double getBookcost() {
		return bookcost;
	}

	public void setBookcost(double bookcost) {
		this.bookcost = bookcost;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MotivationalBk mbk[]=new MotivationalBk[2];
		int i;
		for(i=0; i<2;i++)
		{
			 mbk[i]=new MotivationalBk();
		System.out.println("Enter Authornm");
		mbk[i].setAuthornm(sc.next());
		
		System.out.println("Enter Booknm");
		mbk[i].setBooknm(sc.next());
		
		System.out.println("Enter No of Pages");
		mbk[i].setNoofpage(sc.nextInt());
		
		System.out.println("Enter Bookcost");
		mbk[i].setBookcost(sc.nextDouble());
		System.out.println();
		
		
		}
		for(i=0; i<2;i++) {
		System.out.println("Authornm :"+mbk[i].getAuthornm());
		System.out.println("Booknm :"+mbk[i].getBooknm());
		System.out.println("No of Pages :"+mbk[i].getNoofpage());
		System.out.println("Bookcost :"+mbk[i].getBookcost());
		System.out.println();
		
		}
		

}}
