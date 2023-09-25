package com.tka.basic;
import java.util.Scanner;
public class DataTypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		int len=sc.nextInt();
	    System.out.println("Length="+len);
		
		System.out.println("Enter hight");
		float high=sc.nextFloat();
		System.out.println("Hight="+high);
		
		System.out.println("Enter weight");
		double wei=sc.nextDouble();
		System.out.println("Weight="+wei);
		
		System.out.println("Enter mobile no");
		long no=sc.nextLong();
		System.out.println("Mobile no="+no);
		
		System.out.println("Enter if pass(true)/fail(false)");
		boolean status=sc.nextBoolean();
		System.out.println("result="+status);
		
		System.out.println("Enter your name");
		String nm=sc.next();
		System.out.println("Name="+nm);
		
		sc.nextLine();
		System.out.println("Enter your full name");
		String nm1=sc.nextLine();
		System.out.println(nm1);
	  sc.close();
	}

}
