package com.ControlStatments_loops;
import java.util.Scanner;
public class Factorial {
            static Scanner sc=new Scanner(System.in);
            int no;
	 
	    void calc()
	    {
	    	System.out.println("Enter a no");
	    	no=sc.nextInt();
    		
	    	int i=1,d=0;
	    	int fact = 0;
	    	while (i<=no)
	    	{
	    		
	    		fact=fact+no;
	    		i++;
	    		d=fact*1;
	      }
	    	
	    	System.out.println("Factorial="+d);
	    	
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial f=new Factorial();
		
		f.calc();
	}

}
