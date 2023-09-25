package com.tka.Array;
import java.util.Scanner;
public class Number_Search {
          static Scanner sc=new Scanner(System.in);
          double[] no=new double[10];
          
          void setData()
          {System.out.println("Enter a no");
        	  for(int i=0;i<no.length;i++)
        	  {
        		
        		  no[i]=sc.nextDouble();
        		  System.out.println("Enter a no");
        	  }
          }
          void getData()
          {
        	  int flg=0,pos=0;
        	  for(int i=0;i<no.length;i++)
        	  {
        		 
        		System.out.println(no[i]);  
        	  }
        	  System.out.println("Enter the no to search");
        	  double no1=sc.nextDouble();
        	  for(int i=0;i<no.length;i++)
        	  {
        		  if (no[i]==(no1))
        		  {
        			  flg=1;
        			  pos=i;
        			  break;
        		  }
        		  
        	  }
        	  if(flg==1) {
        		  System.out.println("number found at posiition="+pos);
        	  }
        	  else 
        		  System.out.println("no not found");
          }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number_Search ns=new Number_Search();
		ns.setData();
		ns.getData();
		
	}

}
