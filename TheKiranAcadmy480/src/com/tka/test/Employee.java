package com.tka.test;
import java.util.Scanner;
public class Employee extends Member{
        private String specialization;
        private String department;
        private long phonno;
        private String addr;

		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
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

		public String getSpecialization() {
			return specialization;
		}

		public void setSpecialization(String specialization) {
			this.specialization = specialization;
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Employee emp=new Employee();
			    Scanner sc=new Scanner(System.in);
			    
			        System.out.println("Enter Member Name");
					emp.setMembnm(sc.next());
					
					System.out.println("Enter Member age");
					emp.setMemb_age(sc.nextInt());
					
					System.out.println("Enter Member Salary");
					emp.setMembsal(sc.nextDouble());
					
					System.out.println("Enter Specialization");
					emp.setSpecialization(sc.next());
					
					System.out.println("Enter Department");
					emp.setDepartment(sc.next());
					
					System.out.println("Enter Phone no.");
					emp.setPhonno(sc.nextLong());
					
					System.out.println("Enter Adderss");
					emp.setAddr(sc.next());
					
					System.out.println();
					
					
					System.out.println("Member Name :"+emp.getMembnm());
					System.out.println("Member age :"+emp.getMemb_age());
					System.out.println("Member salary :"+emp.getMembsal());
					System.out.println("Specialization :"+emp.getSpecialization());
					System.out.println("Department :"+emp.getDepartment());
					System.out.println("Phone no. :"+emp.getPhonno());
					System.out.println("Address :"+emp.getAddr());
}
}