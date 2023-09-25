package com.ControlStatments_loops;
import java.util.Scanner;

public class Table_while {
	static Scanner sc=new Scanner(System.in);
	int no;
    void calc()
    {
    	System.out.println("Enter a no");
    	no=sc.nextInt();
		
    	int i=1,d=1;
   
    	while (i<=10)
    	{
    		
    		d=i*no;
    		i++;
    		
      }
    	
    	System.out.println("table="+d);
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table_while tb=new Table_while();
		tb.calc();
	}

}
