package com.tka.HW;
import java.util.Scanner;
public class Hw2 {
	/*The program for taking input from user then calculates the
	subtraction and display output on screen*/


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
	
		int num1 = sc.nextInt();
		System.out.print("Enter second number: ");
		int num2 = sc.nextInt();
	
		sc.close();
	
		int product = num1 - num2;
	
		System.out.println("Output: " + product);
	}

}
