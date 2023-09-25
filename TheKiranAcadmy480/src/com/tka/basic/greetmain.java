package com.tka.basic;
import java.util.Scanner;
public class greetmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           greet g=new greet();
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter your name");
           String  nm=sc.next();
           g.msg(nm);
	}

}
