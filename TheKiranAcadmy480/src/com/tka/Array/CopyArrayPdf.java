package com.tka.Array;

//import java.lang.reflect.Array;

public class CopyArrayPdf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int arr1[]= {2,3,4,5,8,9};
          int arr2[]= new int[6];
          System.out.println("array:");
          System.out.println("[");
          for(int i=0;i<arr1.length;i++)
          {
        	  System.out.println();
        	  
          }
          System.out.println("]");
          System.out.println("arr1:");
          System.out.println("[");
          for (int j=0;j<arr2.length;j++)
{
	     arr2[j]=arr1[j];
	     System.out.println(" "+arr2[j]);
}         System.out.println("]");
	}

}
