package com.tka.inheritance;
//Single inheritance
public class B extends A {
	        public void methodB() {
	        	System.out.println("child class method");
	        }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        B b=new B();
        b.methodA();// calling super class method
        b.methodB();// calling local method
        
	}

}
