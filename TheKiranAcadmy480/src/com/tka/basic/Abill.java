package com.tka.basic;
import java.util.Scanner;
public class Abill {
	double bill(double pcost,int noofperson)
	{
		double tamt=noofperson*pcost;
		//5% tax
		tamt=tamt+(tamt*5)/100;
		return tamt;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Abill ab=new Abill();
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter tamt & no of person");
          double amt=ab.bill(sc.nextDouble(),sc.nextInt());
          System.out.println("total amt="+amt);
	}

}
