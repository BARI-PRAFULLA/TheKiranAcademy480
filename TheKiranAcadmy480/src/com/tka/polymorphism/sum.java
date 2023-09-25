package com.tka.polymorphism;

import java.util.Scanner;

public class sum {
	int num, num1;
	Scanner sc = new Scanner(System.in);
	void sum(int no,int no1)
	{
		System.out.println("tot-"+no+no1);
	}
	void sum1(int no,int no1,int no2)
	{
		System.out.println("tot-"+no+no1+no2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            sum s2=new sum();
            s2.sum(10,40);
            s2.sum1(10,40,20);
           
	}

}
