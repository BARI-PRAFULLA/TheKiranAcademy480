package com.tka.basic;
import java.util.Scanner;
public class Squareofno {
        
	   void square()
	   {
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the no");
		   int no=sc.nextInt();
		   int sqr=no*no;
		   System.out.println("Square="+sqr);
		   sc.close();
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Squareofno n=new Squareofno();
		
		n.square();
	}

}
