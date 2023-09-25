package com.tka.HW;
import java.util.Scanner;
public class Hw5 {
	/*The program for taking input from user and display on screen*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter any number: ");
		
		int num = sc.nextInt();
	
		sc.close();
		
		System.out.println("The number entered by user: "+num);

	}

}
