package com.tka.Array;
import java.util.Scanner;
public class Array_Average {
	          
	     static Scanner sc=new Scanner(System.in);
	    float arr[]=new float [10];
	    float sum=0,avg;
	     void avg() {
	 	
			for(int i=0;i<arr.length;i++)
			{
				System.out.println("Enter a no");
				arr[i]=sc.nextInt();
			    sum=sum+arr[i];
				
			}
			System.out.println("average="+(sum/10));
			sc.close();
			}
		  
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array_Average av=new Array_Average();
		av.avg();
	}

}
