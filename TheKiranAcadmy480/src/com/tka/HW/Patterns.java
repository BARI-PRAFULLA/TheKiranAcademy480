package com.tka.HW;

public class Patterns {
           
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 for(int i = 1;i<=4;i++)
    	 {
			
    		 for(int j=i;j<=4;j++)
    		 {System.out.println(" ");
    		 }
    		 for(int j=1;j<=i;j++) {
    			 System.out.print(" * ");
    			 
    		 }
    		 System.out.println();
    	 }
	}
}