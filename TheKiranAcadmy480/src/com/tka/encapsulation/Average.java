package com.tka.encapsulation;

public class Average { 
	            
	public void avg(int no,int no1)
	{
		System.out.println((no+no1)/2);
	}
	public void avg(int no,int no1,int no2)
	{
		System.out.println((no+no1+no2)/3);
	}

	public void avg(int  no,float no1,float no2)
	{
		System.out.println((no+no1+no2)/3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stu 
		Average a=new Average();
		a.avg(10, 20);
		a.avg(12, 13, 14);
		a.avg(12, 12.3F, 3.4F);
	}

}
