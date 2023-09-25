package com.tka.test;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Series_no {
	        static Scanner sc=new Scanner(System.in);
	         Integer arr[]=new Integer[50];
                    void setData()
                    {
                    	for(int i=0;i<arr.length;i++)
                    	{
                    		System.out.println("Enter a no");
                    		arr[i]=sc.nextInt();
                    				
                    	}
                    }
                    void getData()
                    {
                    	Arrays.sort(arr,Collections.reverseOrder());
                    	for(int i=0;i<arr.length;i++)
                    	{
                    		System.out.println(arr[i]);
                    	}
                    }
                public static void main(String[] args) {
                	 Series_no S2=new Series_no();
                	 S2.setData();
                	 S2.getData();

}}