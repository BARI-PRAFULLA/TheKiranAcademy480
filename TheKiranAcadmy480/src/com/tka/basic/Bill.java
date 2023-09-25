package com.tka.basic;

public class Bill {
	int qty;
	final int cost=45;
	void cal()
	{
		qty=2;
		int a=qty*cost;
		System.out.println("total="+a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bill b=new Bill();
		b.cal();
		
		
	}

}
