package com.tka.inheritance;

public class mainUEM1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 e1=new Employee1();
		e1.name="Candid";
		e1.age=22;
		e1.ph=51546654;
		e1.specialization="java";
		
		Manager1 m1=new Manager1 ();
		m1.name="java";
		m1.age=25;
		m1.ph=254546545;
		m1.department="HR";
		
		System.out.println(e1.name);
		System.out.println(e1.age);
		System.out.println(e1.ph);
		System.out.println(e1.specialization);
		System.out.println(m1.name);
		System.out.println(m1.age);
		System.out.println(m1.ph);
		System.out.println(m1.department);
		
				
		
	}

}
