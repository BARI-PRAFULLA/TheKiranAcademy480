package com.tka.inheritance;
import java.util.Scanner;
public class Manager extends Employee  {
	       
	        private double empbonus;
	        
	      static Scanner sc=new Scanner(System.in);  

	public double getEmpbonus() {
				return empbonus;
			}



			public void setEmpbonus(double empbonus) {
				this.empbonus = empbonus;
			}

			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            
		  Manager m=new Manager();
		  System.out.println("Enter empid");
		  m.setEmpid(sc.nextInt());
		  System.out.println("Enter empnm");
			m.setEmpnm(sc.next());
			System.out.println("Enter empsal");
			m.setEmpsal(sc.nextDouble());
			
			System.out.println("Enter empid :"+m.getEmpid());
			System.out.println("Enter empnm :"+m.getEmpnm());
			System.out.println("Enter empsal :"+m.getEmpsal());
			
			
			System.out.println("Enter empbonus");
			double mbonus=sc.nextDouble();
			System.out.println("Total sal="+(m.getEmpsal()+mbonus));
	}

}
