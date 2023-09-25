package com.tka.test;

import java.util.Scanner;

public class Manager extends Member {
	 
	 private String specialization;
     private String department;
     private long phonno;
     private String addr;

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public long getPhonno() {
		return phonno;
	}

	public void setPhonno(long phonno) {
		this.phonno = phonno;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager mg=new Manager();
		  Scanner sc=new Scanner(System.in);
		    
	        System.out.println("Enter Member Name");
			mg.setMembnm(sc.next());
			
			System.out.println("Enter Member age");
			mg.setMemb_age(sc.nextInt());
			
			System.out.println("Enter Member Salary");
			mg.setMembsal(sc.nextDouble());
			
			System.out.println("Enter Specialization");
			mg.setSpecialization(sc.next());
			
			System.out.println("Enter Department");
			mg.setDepartment(sc.next());
			
			System.out.println("Enter Phone no.");
			mg.setPhonno(sc.nextLong());
			
			System.out.println("Enter Adderss");
			mg.setAddr(sc.next());
			
			System.out.println();
			
			
			System.out.println("Member Name :"+mg.getMembnm());
			System.out.println("Member age :"+mg.getMemb_age());
			System.out.println("Member salary :"+mg.getMembsal());
			System.out.println("Specialization :"+mg.getSpecialization());
			System.out.println("Department :"+mg.getDepartment());
			System.out.println("Phone no. :"+mg.getPhonno());
			System.out.println("Address :"+mg.getAddr());
}
}
