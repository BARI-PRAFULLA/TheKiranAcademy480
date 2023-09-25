package com.tka.basic;
import java.util.Scanner;
public class Tour2 {
     
      double calculate(double tcost,int noofper)
      {
	    double total=noofper*tcost;
	    total=total+(total*10)/100;
	   
	      return total;
	   
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tour2 t1=new Tour2();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of person & tcost ");
	double tot=t1.calculate(sc.nextDouble(),sc.nextInt());
        System.out.println("Total Cost="+tot);
        sc.close();
	}

      
	}


