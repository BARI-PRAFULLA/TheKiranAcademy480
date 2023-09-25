package com.tka.Array;

import java.util.Scanner;

public class Ascii_value {
    
	     static Scanner sc=new Scanner(System.in);
	    
	  static char ch[]=new char[10];
	     void asccii_vl()
         {
	    		
	    		for(int i=0;i<ch.length;i++)
	    		{
	    			System.out.println("Enter a charactor");
	    			   ch[i]=(char) sc.nextInt();
	    
	    } }
	    		void as2() {
	    			for(int i=0;i<ch.length;i++)
	    			{
	    				System.out.println(ch[i]);
	    			}
	    		}
	    	
	     
		  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ascii_value av=new Ascii_value();
		
		av.asccii_vl();
		
		av.as2();
	}

}
