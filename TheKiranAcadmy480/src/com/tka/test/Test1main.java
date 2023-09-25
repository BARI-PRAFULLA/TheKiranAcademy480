package com.tka.test;
import java.util.Scanner;
import com.tka.test.Factorial;
import com.tka.test.Series_no;
import com.tka.test.Odd_Number1to20;
public class Test1main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Scanner sc=new Scanner(System.in);
	        System.out.println("Enter your choice");
	        System.out.println("1.Factorial");
	        System.out.println("2.Series_no");
	        System.out.println("3.Odd_Number50to1");
	        System.out.println("4.Exit");
	       
	         int ch=sc.nextInt();
	         switch (ch)
	         {
	         case 1:
	         {
	        	 Factorial fa=new  Factorial();
	        	 System.out.println("Enter the number");
	        	 sc.nextInt();
	        	 fa.calc1();
	        	 break;
	         }
	         case 2:
	         {
	        	 Series_no se=new Series_no();
	        	 System.out.println("Enter the number");
	             se.setData();
	        	 se.getData();
	        	 break;
	         }
	         case 3:
	         {
	        	 Odd_Number1to20 od=new Odd_Number1to20();
	        	 System.out.println("Enter the number");
	        	 od.checkT();
	        	 break;
	        	 
	        	 
	         }
	         case 4:
	         {
	        	 System.out.println("Exit");
	         }
	         default :
	        	 System.out.println("Enter only 1 to 4 number ");
	         }
	        
		}

	

	}


