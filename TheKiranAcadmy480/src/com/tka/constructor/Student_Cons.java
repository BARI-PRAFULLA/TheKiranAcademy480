package com.tka.constructor;
import java.util.Scanner;
public class Student_Cons {
          
	  static Scanner sc=new Scanner(System.in);
	          int studid;
	          String studnm;
	          Student_Cons(int studid,String studnm)
	 {
		   this.studid=studid;
		   this.studnm=studnm;
	 }
	           void disp()
	           {
	        	   System.out.println(studid);
	        	   System.out.println(studnm);
	           }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter id,nm");
		Student_Cons s1=new Student_Cons(sc.nextInt(),sc.next());
		
		System.out.println("Enter id,nm");
		Student_Cons s2=new Student_Cons(sc.nextInt(),sc.next());
		s1.disp();
		s2.disp();
	}

}
