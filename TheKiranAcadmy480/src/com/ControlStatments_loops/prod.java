package com.ControlStatments_loops;

import java.util.Scanner;

public class prod {
	static Scanner sc=new Scanner(System.in);
          int no;
          void cal()
          {
        	  int i=1,p=1;
        	  while (i<=10)
        	  {
        		  System.out.println("Enter a no");
            	  no=sc.nextInt();
        	  p=p*no;
        	  i++;
        	  }
        	  System.out.println("Product="+p);
        	  
          }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prod p=new prod();
		p.cal();
	}

}
