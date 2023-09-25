package com.tka.basic;

public class Block_Demo {
              
	{
		//Instant Block
	System.out.println("Instant");
	}
	static
	{
		//Static Block
		System.out.println("static");
	}
          	void m1()
          	{
          		//Local Block
          		System.out.println("Local");
          	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Block_Demo b=new  Block_Demo();
		 b.m1();
	}

}
