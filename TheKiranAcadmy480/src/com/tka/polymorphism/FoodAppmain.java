package com.tka.polymorphism;
import java.util.Scanner;


public class FoodAppmain {

	public static void main(String[] args )
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("1.copencode");
		System.out.println("2.normal membership");
		System.out.println("3.primium membership");
		int ch=sc.nextInt();
		Foodapp1 f1=new Foodapp1();
		switch(ch)
		{
		case 1:
		{
    	System.out.println("Enter copen code");
    	f1.disc(sc.next());
    	break;
		}
		case 2:
		{
			System.out.println("Enter copen code and Enter 'true' if you are normal_member");
			f1.disc1(sc.next(),sc.next());
			break;
		}
		case 3:
		{
			System.out.println("Enter copen code and Enter 'true' if you are primium_member");
			f1.disc2(sc.next(),sc.next());
			break;
		}
}
}}