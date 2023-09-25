package com.tka.encapsulation;
import java.util.Scanner;
public class Studmain {
    static Scanner sc=new Scanner(System.in);           
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Student s[]=new Student[3];
         
           
           for (int i=0; i<3; i++)
           {
        	   s[i]=new Student();
        	   
        	   System.out.println("Enter studid");
        	   s[i].setStudid(sc.nextInt());
        	   System.out.println("Enter studnm");
        	   s[i].setStudnm(sc.next());
        	   System.out.println("Enter studfees");
        	   s[i].setStudfees(sc.nextDouble());
        	   System.out.println();
           }
           for (int i=0; i<3; i++)
           {
        	   System.out.println("studid="+s[i].getStudid());
        	   System.out.println("studnm="+s[i].getStudnm());
        	   System.out.println("studfees="+s[i].getStudfees());
        	   System.out.println();
           }
	}

}
