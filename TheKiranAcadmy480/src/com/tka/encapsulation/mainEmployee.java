package com.tka.encapsulation;
import java.util.Scanner;
public class mainEmployee {
      static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Employee e[]=new Employee[5];
         
         for (int i=0; i<5;i++)
         {
        	 e[i]=new Employee();
        	 
         System.out.println("Enter Empid");
         e[i].setEmpid(sc.nextInt());
         
         System.out.println("Enter Empnm");
         e[i].setEmpnm(sc.next());
         
         System.out.println("Enter Empsal");
         e[i].setSal(sc.nextDouble());
         
         System.out.println();
         
         }
         for (int i=0; i<5;i++) {
        	
         System.out.println("Empid :"+e[i].getEmpid());
	  	 System.out.println("Empnm :"+e[i].getEmpnm());
         System.out.println("Empsal :"+e[i].getSal());
         System.out.println("Annual sal :"+e[i].getSal()*12);
         System.out.println();
	}

}}
