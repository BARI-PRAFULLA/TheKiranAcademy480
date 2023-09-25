package com.ControlStatments_loops;

public class Factorial_if {
	
	static int factorial(int n) {
		if(n==0)
			return 1;
		else
			return(n*factorial(n-1));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,fact=1;
int number=4;
fact=factorial(number);
System.out.println("facto"+number+"is"+fact);
	}

}
