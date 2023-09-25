package com.tka.HW;

public class DataType_Boolean {
	boolean a=true;
	 void check()
     {
  	   if(a==true)
  	   {
  		   a=false;
  		   System.out.println("The Boolean Value is="+a);
  	   }
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 DataType_Boolean db=new  DataType_Boolean();
		 db.check();
		 System.out.println(db.a);
       }

}
