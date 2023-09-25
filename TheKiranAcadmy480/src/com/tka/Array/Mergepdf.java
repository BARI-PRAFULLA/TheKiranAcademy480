package com.tka.Array;

import java.util.Arrays;

public class Mergepdf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int []v1= {10,20,30};
          int []v2= {100,200,300};
          // Merge two array with for loops.
          int[]merge=new int[v1.length+v2.length];
          for (int i=0;i<v1.length;i++) {
        	  merge[i]=v1[i];
          }

          
	 for (int i=0;i<v2.length;i++)
	 {
  	  merge[i+v1.length]=v2[i];
    

}
	 System.out.println(Arrays.toString(merge));
}}