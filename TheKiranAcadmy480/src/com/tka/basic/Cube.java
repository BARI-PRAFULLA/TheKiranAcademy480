package com.tka.basic;
import java.util.Scanner;
public class Cube {
      float cube()
      {
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println("Enter a no");
    	  int no=sc.nextInt();
    	  sc.close();
    	  int ans=no*no*no;
    	  return ans;
    	  
    	  
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Cube c=new Cube();
       float ans=c.cube();
       System.out.println("cube="+ans);
      
	}

}
